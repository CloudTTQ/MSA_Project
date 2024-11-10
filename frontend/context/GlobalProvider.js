import { createContext, useContext, useState, useEffect } from "react";

const GlobalContext = createContext();
export const useGlobalContext = () => useContext(GlobalContext);

const GlobalProvider = ({ children }) => {
  const [isPacient, setIsPacient] = useState(false);

  return (
    <GlobalContext.Provider
      value={{
        isPacient,
        setIsPacient,
      }}
    >
      {children}
    </GlobalContext.Provider>
  );
};

export default GlobalProvider;
