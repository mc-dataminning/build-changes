public abstract class kz extends kx {
   private boolean c = true;

   public boolean b() {
      return this.c;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(kv $$0) {
      $$0.b().c(this.b() ? 1000 : 1001, $$0.c(), 0);
   }
}
