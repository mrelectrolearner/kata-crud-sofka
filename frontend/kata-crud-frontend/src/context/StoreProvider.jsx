import React, { useReducer } from 'react';
import { reducer } from './reducer/StoreReducer';
import { Store, initialState } from './Store';

const StoreProvider = ({ children }) => {
    const [state, dispatch] = useReducer(reducer, initialState);

    return <Store.Provider value={{ state, dispatch }}>
        {children}
    </Store.Provider>

}

export { StoreProvider }