public class ll extends lg {
   private final dae c;
   private final dae.a d;

   public ll(czg $$0) {
      if ($$0 instanceof dae $$1) {
         this.c = $$1;
         this.d = $$1.a();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + dae.class.getSimpleName());
      }
   }

   @Override
   public czk a(le $$0, czk $$1) {
      arq $$2 = $$0.b();
      jb $$3 = $$0.d().c(dos.b);
      jp $$4 = this.d.b().getDispensePosition($$0, $$3);
      cse.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(le $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
