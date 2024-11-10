import { View, Text, SafeAreaView, ScrollView } from "react-native";
import React from "react";
import CustomButton from "../components/CustomButton";
import { router } from "expo-router";

const index = () => {
  return (
    <SafeAreaView className="bg-primary-red h-full">
      <View className="flex-1 justify-center items-center px-4 pt-30 w-full">
        <Text className="font-bold text-6xl text-primary-white mb-10">
          Cine esti?
        </Text>

        <CustomButton
          title="Doctor"
          primary={false}
          handlePress={() => {
            router.push("/sign_in_doctor");
          }}
          containerStyles="w-full mt-7 h-[200px]"
          textStyles="text-4xl"
        />
        <CustomButton
          title="Pacient"
          primary={false}
          handlePress={() => {
            router.push("/sign_in_pacient");
          }}
          containerStyles="w-full mt-7 h-[200px]"
          textStyles="text-4xl"
        />
      </View>
    </SafeAreaView>
  );
};

export default index;
