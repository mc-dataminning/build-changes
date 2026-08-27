import javax.annotation.Nullable;

class st {
   @Nullable
   public final Long a;
   public final Runnable b;

   private st(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static st a(Runnable $$0) {
      return new st(null, $$0);
   }

   static st a(long $$0, Runnable $$1) {
      return new st($$0, $$1);
   }
}
