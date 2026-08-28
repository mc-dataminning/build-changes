import javax.annotation.Nullable;

class si {
   @Nullable
   public final Long a;
   public final Runnable b;

   private si(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static si a(Runnable $$0) {
      return new si(null, $$0);
   }

   static si a(long $$0, Runnable $$1) {
      return new si($$0, $$1);
   }
}
