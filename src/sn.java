import javax.annotation.Nullable;

class sn {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sn(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sn a(Runnable $$0) {
      return new sn(null, $$0);
   }

   static sn a(long $$0, Runnable $$1) {
      return new sn($$0, $$1);
   }
}
