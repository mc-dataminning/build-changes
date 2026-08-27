import javax.annotation.Nullable;

class rm {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rm(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rm a(Runnable $$0) {
      return new rm(null, $$0);
   }

   static rm a(long $$0, Runnable $$1) {
      return new rm($$0, $$1);
   }
}
