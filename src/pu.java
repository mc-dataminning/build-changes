import javax.annotation.Nullable;

class pu {
   @Nullable
   public final Long a;
   public final Runnable b;

   private pu(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static pu a(Runnable $$0) {
      return new pu(null, $$0);
   }

   static pu a(long $$0, Runnable $$1) {
      return new pu($$0, $$1);
   }
}
