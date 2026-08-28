public class kv extends ks {
   private final cvi c;
   private final cvi.a d;

   public kv(cul $$0) {
      if ($$0 instanceof cvi $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cvi.class.getSimpleName());
      }
   }

   @Override
   public cuq a(kq $$0, cuq $$1) {
      dbz $$2 = $$0.b();
      je $$3 = $$0.d().c(dhf.b);
      js $$4 = this.d.b().getDispensePosition($$0, $$3);
      cnq $$5 = this.c.a($$2, $$4, $$1, $$3);
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
