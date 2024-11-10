import { View, Text, Image } from "react-native";
import React from "react";
import { TouchableOpacity } from "react-native";

import { icons } from "../constants";

const ProfilePopup = ({
  name,
  icon,
  lastMessage,
  onlineStatus,
  containerStyles,
  handlePress,
}) => {
  return (
    <TouchableOpacity
      onPress={handlePress}
      className={`bg-primary-red rounded-xl min-h-[62px] justify-left items-center flex-row ${containerStyles}`}
    >
      <Image
        source={icons.eye}
        tintColor={"white"}
        resizeMode="contain"
        className="w-10 h-10"
      />
      <Text className={`text-white font-psemibold text-xl`}>{name}</Text>
    </TouchableOpacity>
  );
};

export default ProfilePopup;
