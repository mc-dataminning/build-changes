public class ld extends kz {
   private final cws c;
   private final cws.a d;

   public ld(cvt $$0) {
      if ($$0 instanceof cws $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cws.class.getSimpleName());
      }
   }

   @Override
   public cvx a(kx $$0, cvx $$1) {
      arm $$2 = $$0.b();
      jl $$3 = $$0.d().c(dkd.b);
      jz $$4 = this.d.b().getDispensePosition($$0, $$3);
      cpb.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kx $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
