import javax.annotation.Nullable;

class tk {
   @Nullable
   public final Long a;
   public final Runnable b;

   private tk(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static tk a(Runnable $$0) {
      return new tk(null, $$0);
   }

   static tk a(long $$0, Runnable $$1) {
      return new tk($$0, $$1);
   }
}
