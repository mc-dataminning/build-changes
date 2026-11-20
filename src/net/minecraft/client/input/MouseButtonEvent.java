package net.minecraft.client.input;

public record MouseButtonEvent(double x, double y, MouseButtonInfo buttonInfo) implements InputWithModifiers {
   @Override
   public int input() {
      return this.button();
   }

   public @MouseButtonInfo.MouseButton int button() {
      return this.buttonInfo().button();
   }

   @Override
   public @InputWithModifiers.Modifiers int modifiers() {
      return this.buttonInfo().modifiers();
   }

   public boolean isLeftMouse() {
      return this.buttonInfo().isLeftMouse();
   }

   public boolean isMiddleMouse() {
      return this.buttonInfo().isMiddleMouse();
   }

   public boolean isRightMouse() {
      return this.buttonInfo().isRightMouse();
   }

   public boolean isMouse4() {
      return this.buttonInfo().isMouse4();
   }

   public boolean isMouse5() {
      return this.buttonInfo().isMouse5();
   }
}
