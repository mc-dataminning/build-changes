import javax.annotation.Nullable;

class su {
   @Nullable
   public final Long a;
   public final Runnable b;

   private su(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static su a(Runnable $$0) {
      return new su(null, $$0);
   }

   static su a(long $$0, Runnable $$1) {
      return new su($$0, $$1);
   }
}
