import { View, Text, Image } from "react-native";
import React from "react";
import { Tabs } from "expo-router";
import { StatusBar } from "expo-status-bar";

import { icons } from "../../constants";

const TabIcon = ({ icon, color, name, focused }) => {
  return (
    <View className="flex-row">
      <Text
        className={`${
          focused ? "font-psemibold" : "font-pregular"
        } text-3xl px-5`}
        style={{ color: color }}
      >
        {name}
      </Text>
      <Image
        source={icon}
        resizeMode="contain"
        tintColor={color}
        className="w-7 h-7"
      />
    </View>
  );
};

const TabsPacientLayout = () => {
  return (
    <>
      <Tabs
        screenOptions={{
          tabBarShowLabel: false,
          tabBarActiveTintColor: "#E00028",
          tabBarInactiveTintColor: "#2E333C",
          tabBarStyle: {
            backgroundColor: "#F7F7F7",
            borderTopWidth: 1,
            borderTopColor: "#2E333C",
            height: 84,
          },
        }}
      >
        <Tabs.Screen
          name="home_pacient"
          options={{
            title: "home",
            headerShown: false,
            tabBarIcon: ({ color, focused }) => (
              <TabIcon
                icon={icons.home}
                color={color}
                name="Acasa"
                focused={focused}
              />
            ),
          }}
        />
      </Tabs>

      <StatusBar backgroundColor="#F7F7F7" style="dark" />
    </>
  );
};

export default TabsPacientLayout;
