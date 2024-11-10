import { View, Text, Alert, ScrollView } from "react-native";
import React, { useState } from "react";
import { SafeAreaView } from "react-native-safe-area-context";
import FormField from "../../components/FormField";
import CustomButton from "../../components/CustomButton";
import { router } from "expo-router";
import { StatusBar } from "expo-status-bar";

const sign_in_doctor = () => {
  const [form, setForm] = useState({
    email: "",
    password: "",
  });

  const [isSubmitting, setIsSubmitting] = useState(false);

  const Submit = async () => {
    if (!form.email || !form.password) {
      Alert.alert("Error", "Please fill in all the fields.");
    }

    setIsSubmitting(true);

    try {
      //login logic

      router.replace("/home_doctor");
    } catch (error) {
      Alert.alert("Error", error.message);
    } finally {
      setIsSubmitting(false);
    }
  };

  return (
    <SafeAreaView className="bg-primary-white">
      <ScrollView>
        <View className="w-full justify-center h-full px-4 space-y-6">
          <FormField
            title="Cod Doctor"
            value={form.email}
            handleChangeText={(e) =>
              setForm({
                ...form,
                email: e,
              })
            }
            otherStyles="mt-7"
          />
          <FormField
            title="Parola"
            value={form.password}
            handleChangeText={(e) =>
              setForm({
                ...form,
                password: e,
              })
            }
            otherStyles="mt-7"
          />

          <CustomButton
            title="Sign in"
            primary={true}
            handlePress={Submit}
            containerStyles={"mt-7"}
            isLoading={isSubmitting}
          />
        </View>
      </ScrollView>
      <StatusBar style="light" />
    </SafeAreaView>
  );
};

export default sign_in_doctor;
