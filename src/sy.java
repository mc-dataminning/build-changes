import javax.annotation.Nullable;

class sy {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sy(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sy a(Runnable $$0) {
      return new sy(null, $$0);
   }

   static sy a(long $$0, Runnable $$1) {
      return new sy($$0, $$1);
   }
}
