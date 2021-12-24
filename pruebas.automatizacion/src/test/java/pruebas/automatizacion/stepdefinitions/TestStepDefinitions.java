package pruebas.automatizacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebas.automatizacion.model.UTestData;
import pruebas.automatizacion.questions.Answer;
import pruebas.automatizacion.tasks.Login;
import pruebas.automatizacion.tasks.OpenUp;
import pruebas.automatizacion.tasks.Search;

import java.util.List;


public class TestStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Juan quiere aprender a ser un tester automatizador$")
    public void juanQuiereAprenderASerUnTesterAutomatizador(List<UTestData> uTestData) {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(uTestData.get(0).getStrUser(),uTestData.get(0).getStrPassword())));

    }


    @When("^Buscar el curso en el sitio web$")
    public void buscarElCursoIntroductionToGamblingTestingEnElSitioWeb(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(uTestData.get(0).getStrCourse()));

    }

    @Then("^Elegir el curso$")
    public void elegirElCursoIntroductionToGamblingTesting(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrCourse())));

    }


}
