import javax.annotation.Nullable;

class rb {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rb(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rb a(Runnable $$0) {
      return new rb(null, $$0);
   }

   static rb a(long $$0, Runnable $$1) {
      return new rb($$0, $$1);
   }
}
