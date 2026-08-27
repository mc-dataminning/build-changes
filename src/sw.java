import javax.annotation.Nullable;

class sw {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sw(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sw a(Runnable $$0) {
      return new sw(null, $$0);
   }

   static sw a(long $$0, Runnable $$1) {
      return new sw($$0, $$1);
   }
}
