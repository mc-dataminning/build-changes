public abstract class ii extends ig {
   private boolean c = true;

   public boolean a() {
      return this.c;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(id $$0) {
      $$0.b().c(this.a() ? 1000 : 1001, $$0.c(), 0);
   }
}
