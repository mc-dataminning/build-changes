public abstract class lk extends lg {
   private boolean c = true;

   public boolean b() {
      return this.c;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(le $$0) {
      $$0.b().c(this.b() ? 1000 : 1001, $$0.c(), 0);
   }
}
