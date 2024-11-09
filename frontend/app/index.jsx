import { View, Text, SafeAreaView } from 'react-native'
import React from 'react'

const index = () => {
  return (
    <SafeAreaView className='h-full w-full'>
        <View className='flex-1 justify-center items-center'>
            <Text>index</Text>
        </View>
    </SafeAreaView>
  )
}

export default index