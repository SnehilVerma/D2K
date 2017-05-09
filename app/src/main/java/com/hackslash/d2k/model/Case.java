package com.hackslash.d2k.model;

/**
 * Created by snehil on 8/5/17.
 */

public class Case {


    private String com_name;
    private String case_name;
    private String case_id;
    private String branch_code;


    public String get_com_name() {
        return com_name;
    }

    public void set_com_name(String com_name) {
        this.com_name = com_name;
    }

    public String get_case_name() {
        return case_name;
    }

    public void set_case_name(String case_name) {
        this.case_name = case_name;
    }

    public String get_case_id() {
        return case_id;
    }

    public void set_case_id(String case_id) {
        this.case_id = case_id;
    }

    public String get_branch_code() {
        return branch_code;
    }

    public void set_branch_code(String branch_code) {
        this.branch_code = branch_code;
    }

}
