public class kv extends ks {
   private final cvh c;
   private final cvh.a d;

   public kv(cuk $$0) {
      if ($$0 instanceof cvh $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cvh.class.getSimpleName());
      }
   }

   @Override
   public cup a(kq $$0, cup $$1) {
      dby $$2 = $$0.b();
      je $$3 = $$0.d().c(dhe.b);
      js $$4 = this.d.b().getDispensePosition($$0, $$3);
      cnp $$5 = this.c.a($$2, $$4, $$1, $$3);
      this.c.a($$5, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kq $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
