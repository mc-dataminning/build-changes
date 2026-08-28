public class lg extends lb {
   private final cyb c;
   private final cyb.a d;

   public lg(cxd $$0) {
      if ($$0 instanceof cyb $$1) {
         this.c = $$1;
         this.d = $$1.b();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cyb.class.getSimpleName());
      }
   }

   @Override
   public cxh a(kz $$0, cxh $$1) {
      ard $$2 = $$0.b();
      jn $$3 = $$0.d().c(dmk.b);
      kb $$4 = this.d.b().getDispensePosition($$0, $$3);
      cqk.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kz $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
