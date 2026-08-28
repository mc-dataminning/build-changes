import javax.annotation.Nullable;

class so {
   @Nullable
   public final Long a;
   public final Runnable b;

   private so(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static so a(Runnable $$0) {
      return new so(null, $$0);
   }

   static so a(long $$0, Runnable $$1) {
      return new so($$0, $$1);
   }
}
