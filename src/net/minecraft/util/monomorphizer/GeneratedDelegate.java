package net.minecraft.util.monomorphizer;

public abstract class GeneratedDelegate {
   private final Object target;

   protected GeneratedDelegate(final Object target) {
      this.target = target;
   }

   @Override
   public final boolean equals(final Object obj) {
      return super.equals(obj);
   }

   @Override
   public final int hashCode() {
      return super.hashCode();
   }

   @Override
   public final String toString() {
      return "GeneratedDelegate[" + this.target + "]";
   }
}
