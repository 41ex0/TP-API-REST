package Principal.TPAPI.controllers;

import Principal.TPAPI.entities.Persona;
import Principal.TPAPI.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
}
