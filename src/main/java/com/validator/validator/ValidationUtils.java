package com.validator.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidationUtils {

    public List<ValidatorResult> execute(String payload, List<Validator> validators) {
        if (validators == null && validators.isEmpty())
            return null;

        List<ValidatorResult> validatorResults = new ArrayList<>();
        validators.stream().parallel().forEach(
                (validator) -> {
                    if (validator != null) {
                        validatorResults.add(validator.validate(payload));
                    }
                }
        );
        return validatorResults;
    }

    public static void main(String[] args) {
        List<Validator> validators = new ArrayList<>();
        validators.add(new JSONSchemaValidator("Hello"));
        validators.add(new EmailValidator("yuva.aaa@gmail.com"));
        validators.add(new CloudConfigValidator("Testing"));
        List<ValidatorResult> results=new ValidationUtils().execute("Test",validators);
        System.out.println("Results -"+results);
    }
}
