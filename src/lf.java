public class lf extends la {
   private final cyf c;
   private final cyf.a d;

   public lf(cxg $$0) {
      if ($$0 instanceof cyf $$1) {
         this.c = $$1;
         this.d = $$1.b();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cyf.class.getSimpleName());
      }
   }

   @Override
   public cxk a(ky $$0, cxk $$1) {
      ash $$2 = $$0.b();
      jm $$3 = $$0.d().c(dml.b);
      ka $$4 = this.d.b().getDispensePosition($$0, $$3);
      cql.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ky $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
