public abstract class kj extends kh {
   private boolean c = true;

   public boolean a() {
      return this.c;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(kf $$0) {
      $$0.b().c(this.a() ? 1000 : 1001, $$0.c(), 0);
   }
}
