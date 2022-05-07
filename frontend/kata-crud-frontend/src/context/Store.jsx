import { createContext } from 'react';
const initialState = {
    todo: { list: [], item: {} }
};

const Store = createContext(initialState)

export { Store, initialState }