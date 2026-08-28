import javax.annotation.Nullable;

class tc {
   @Nullable
   public final Long a;
   public final Runnable b;

   private tc(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static tc a(Runnable $$0) {
      return new tc(null, $$0);
   }

   static tc a(long $$0, Runnable $$1) {
      return new tc($$0, $$1);
   }
}
