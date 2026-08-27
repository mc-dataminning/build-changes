import javax.annotation.Nullable;

class rt {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rt(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rt a(Runnable $$0) {
      return new rt(null, $$0);
   }

   static rt a(long $$0, Runnable $$1) {
      return new rt($$0, $$1);
   }
}
