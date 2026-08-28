public class la extends kx {
   private final cwk c;
   private final cwk.a d;

   public la(cvk $$0) {
      if ($$0 instanceof cwk $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cwk.class.getSimpleName());
      }
   }

   @Override
   public cvp a(kv $$0, cvp $$1) {
      arh $$2 = $$0.b();
      jj $$3 = $$0.d().c(djo.b);
      jx $$4 = this.d.b().getDispensePosition($$0, $$3);
      coo.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kv $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
