import { StatusBar } from 'expo-status-bar'
import React from 'react'
import { Stack } from 'expo-router'

const AuthLayout = () => {
  return (
    <>
      <Stack>
        <Stack.Screen name='sign_in_doctor' options={{ headerShown: false }}/>
        <Stack.Screen name='sign_in_pacient' options={{ headerShown: false }}/>
      </Stack>

      <StatusBar backgroundColor='#F7F7F7' style='dark'/>
    </>
  )
}

export default AuthLayout