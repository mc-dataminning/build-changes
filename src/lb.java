public class lb extends ky {
   private final cwn c;
   private final cwn.a d;

   public lb(cvn $$0) {
      if ($$0 instanceof cwn $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cwn.class.getSimpleName());
      }
   }

   @Override
   public cvs a(kw $$0, cvs $$1) {
      arj $$2 = $$0.b();
      jk $$3 = $$0.d().c(djr.b);
      jy $$4 = this.d.b().getDispensePosition($$0, $$3);
      cor.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kw $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
