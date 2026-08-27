import javax.annotation.Nullable;

class qx {
   @Nullable
   public final Long a;
   public final Runnable b;

   private qx(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static qx a(Runnable $$0) {
      return new qx(null, $$0);
   }

   static qx a(long $$0, Runnable $$1) {
      return new qx($$0, $$1);
   }
}
