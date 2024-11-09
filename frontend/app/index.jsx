import { View, Text, SafeAreaView } from 'react-native'
import React from 'react'
import CustomButton from '../components/CustomButton'
import { router } from 'expo-router'

import { StatusBar } from 'expo-status-bar'

const index = () => {
  return (
    <SafeAreaView className='bg-primary-white h-full w-full'>
        <View className='flex-1 justify-center items-center'>
            <Text className='font-bold text-xl text-black-100'>Index UwU</Text>
            <CustomButton
              title='Go to SignIn'
              handlePress={() => {
                router.push('/sign_in')
              }}
              containerStyles='w-full mt-7'
            />
        </View>
        <StatusBar
        backgroundColor='#161622'
        style='light'
      />
    </SafeAreaView>
  )
}

export default index