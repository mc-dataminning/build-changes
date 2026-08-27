import javax.annotation.Nullable;

class sh {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sh(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sh a(Runnable $$0) {
      return new sh(null, $$0);
   }

   static sh a(long $$0, Runnable $$1) {
      return new sh($$0, $$1);
   }
}
