public class li extends ld {
   private final cys c;
   private final cys.a d;

   public li(cxu $$0) {
      if ($$0 instanceof cys $$1) {
         this.c = $$1;
         this.d = $$1.b();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cys.class.getSimpleName());
      }
   }

   @Override
   public cxy a(lb $$0, cxy $$1) {
      arn $$2 = $$0.b();
      jo $$3 = $$0.d().c(dna.b);
      kc $$4 = this.d.b().getDispensePosition($$0, $$3);
      crb.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(lb $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
