public class la extends kx {
   private final cwh c;
   private final cwh.a d;

   public la(cvg $$0) {
      if ($$0 instanceof cwh $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cwh.class.getSimpleName());
      }
   }

   @Override
   public cvl a(kv $$0, cvl $$1) {
      arg $$2 = $$0.b();
      jj $$3 = $$0.d().c(dja.b);
      jx $$4 = this.d.b().getDispensePosition($$0, $$3);
      coi.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kv $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
