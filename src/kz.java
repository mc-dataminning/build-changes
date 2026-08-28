public class kz extends kw {
   private final cvm c;
   private final cvm.a d;

   public kz(cul $$0) {
      if ($$0 instanceof cvm $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cvm.class.getSimpleName());
      }
   }

   @Override
   public cuq a(ku $$0, cuq $$1) {
      dcw $$2 = $$0.b();
      ji $$3 = $$0.d().c(did.b);
      jw $$4 = this.d.b().getDispensePosition($$0, $$3);
      cnp $$5 = this.c.a($$2, $$4, $$1, $$3);
      this.c.a($$5, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ku $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
