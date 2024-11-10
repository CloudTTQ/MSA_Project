import { View, Text, ScrollView } from "react-native";
import React from "react";
import { SafeAreaView } from "react-native-safe-area-context";
import CustomButton from "../../components/CustomButton";
import ProfilePopup from "../../components/ProfilePopup";

const home = () => {
  return (
    <SafeAreaView className="bg-primary-white h-full">
      <ScrollView>
        <View className="w-full px-4">
          <ProfilePopup name="Ionut Lenghel" containerStyles="w-full mt-7" />
        </View>
      </ScrollView>
    </SafeAreaView>
  );
};

export default home;
