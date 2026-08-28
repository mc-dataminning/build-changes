import javax.annotation.Nullable;

class sm {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sm(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sm a(Runnable $$0) {
      return new sm(null, $$0);
   }

   static sm a(long $$0, Runnable $$1) {
      return new sm($$0, $$1);
   }
}
