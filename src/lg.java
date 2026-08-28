public class lg extends lb {
   private final cxj c;
   private final cxj.a d;

   public lg(cwk $$0) {
      if ($$0 instanceof cxj $$1) {
         this.c = $$1;
         this.d = $$1.b();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cxj.class.getSimpleName());
      }
   }

   @Override
   public cwo a(kz $$0, cwo $$1) {
      ard $$2 = $$0.b();
      jn $$3 = $$0.d().c(dlr.b);
      kb $$4 = this.d.b().getDispensePosition($$0, $$3);
      cpp.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kz $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
