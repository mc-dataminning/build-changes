import javax.annotation.Nullable;

class qq {
   @Nullable
   public final Long a;
   public final Runnable b;

   private qq(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static qq a(Runnable $$0) {
      return new qq(null, $$0);
   }

   static qq a(long $$0, Runnable $$1) {
      return new qq($$0, $$1);
   }
}
