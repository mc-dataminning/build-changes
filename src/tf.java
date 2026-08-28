import javax.annotation.Nullable;

class tf {
   @Nullable
   public final Long a;
   public final Runnable b;

   private tf(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static tf a(Runnable $$0) {
      return new tf(null, $$0);
   }

   static tf a(long $$0, Runnable $$1) {
      return new tf($$0, $$1);
   }
}
