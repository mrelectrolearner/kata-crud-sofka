import React from "react";
import { StoreProvider } from "./context/StoreProvider.jsx";
import { Form } from "./components/Form/Form.jsx";
import { List } from "./components/List/List.jsx";

function App() {
  return (
    <StoreProvider>
      <h3>To-Do List</h3>
      <Form />
      <List />
    </StoreProvider>
  );
}

export default App;
