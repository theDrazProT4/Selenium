package seleniumgluecode;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Test extends TestBase {


    private int start;
    private int left;

    @Given("^el usuario se encuentra en la pagina Home$")
    public void el_usuario_se_encuentra_en_la_pagina_Home() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^hacen click en el boton$")
    public void hacen_click_en_el_boton() throws Throwable {
        homePage.clickOnTitleComics();

    }

    @Then("^debe redirigir a la pantalla comics$")
    public void debe_redirigir_a_la_pantalla_comics() throws Throwable {
        Assert.assertTrue("no se redirecciono", comicPage.isTitleComicsDisplayed());


    }

    @Given("^Hay (\\d+) cervezas$")
    public void hayCervezas(int start) throws Throwable {
        this.start = start;

    }

    @When("^Tomo (\\d+) cervezas$")
    public void tomoCervezas(int drink) throws Throwable {
        this.left = this.start - drink;

    }

    @Then("^Deberian quedar (\\d+) cervezas$")
    public void deberianQuedarCervezas(int arg1) throws Throwable {
        Assert.assertEquals(left, this.left);

    }

    @Given("^Un blog \"([^\"]*)\"$")
    public void unBlog(String conComillasDobles, String contenido) throws Throwable {
        System.out.println(conComillasDobles);
        System.out.println(contenido);
    }

    @Given("^Los siguientes usuarios existentes:$")
    public void losSiguientesUsuariosExistentes(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        List<List<String>> rowsWithoutHeading = rows.subList(1, rows.size());

        for (List<String> row : rowsWithoutHeading)
            System.out.println("nombre: " + row.get(0) + " email: " + row.get(1) + " twitter: " + row.get(2));
    }

}

