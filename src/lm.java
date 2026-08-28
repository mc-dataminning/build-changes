public class lm extends lh {
   private final dbe c;
   private final dbe.a d;

   public lm(dag $$0) {
      if ($$0 instanceof dbe $$1) {
         this.c = $$1;
         this.d = $$1.a();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + dbe.class.getSimpleName());
      }
   }

   @Override
   public dak a(lf $$0, dak $$1) {
      asb $$2 = $$0.b();
      jc $$3 = $$0.d().c(dpu.b);
      jq $$4 = this.d.b().getDispensePosition($$0, $$3);
      ctd.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(lf $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
