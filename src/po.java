import javax.annotation.Nullable;

class po {
   @Nullable
   public final Long a;
   public final Runnable b;

   private po(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static po a(Runnable $$0) {
      return new po(null, $$0);
   }

   static po a(long $$0, Runnable $$1) {
      return new po($$0, $$1);
   }
}
