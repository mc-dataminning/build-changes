public class lk extends lf {
   private final czs c;
   private final czs.a d;

   public lk(cyu $$0) {
      if ($$0 instanceof czs $$1) {
         this.c = $$1;
         this.d = $$1.a();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + czs.class.getSimpleName());
      }
   }

   @Override
   public cyy a(ld $$0, cyy $$1) {
      arq $$2 = $$0.b();
      ja $$3 = $$0.d().c(dog.b);
      jo $$4 = this.d.b().getDispensePosition($$0, $$3);
      crs.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ld $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
