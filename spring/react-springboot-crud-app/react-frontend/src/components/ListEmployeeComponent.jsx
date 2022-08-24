import React, { Component } from "react";
import EmployeeService from "../services/EmployeeService";
import { Link } from "react-router-dom";

class ListEmployeeComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {
      employees: [],
    };
  }

  componentDidMount() {
    EmployeeService.getEmployees().then((res) => {
      this.setState({
        employees: res.data,
      });
    });
  }

  render() {
    return (
      <div>
        <h2 className="text-center page-heading">Employees List</h2>
        <Link to="/add-employee" className="btn btn-primary add-emp-btn">
          Add Employee
        </Link>
        <div className="row">
          <table className="table table-striped table-bordered">
            <thead>
              <tr>
                <th>Employee First Name</th>
                <th>Employee Last Name</th>
                <th>Employee Email Id</th>
                <th>Actions</th>
              </tr>
            </thead>

            <tbody>
              {this.state.employees.map((emp) => (
                <tr key={emp.id}>
                  <td>{emp.firstName}</td>
                  <td>{emp.lastName}</td>
                  <td>{emp.emailId}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default ListEmployeeComponent;
