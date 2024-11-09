import { View, Text } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'

const sign_in = () => {
  return (
  <SafeAreaView>
    <View className='bg-primary h-full'>
      <View className='justify-center items-center h-full'>
        <Text className='text-white text-xl'>Sign In</Text>
      </View>
    </View>
  </SafeAreaView>
      
  )
}

export default sign_in