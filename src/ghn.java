public class ghn<T extends bpo> extends ghj<T, fqb<T>> {
   private final foc<T> a;

   public ghn(get<T, fqb<T>> $$0, fqz $$1) {
      super($$0);
      this.a = new fqb<>($$1.a(frc.bp));
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ezg $$10 = ezg.Q();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eud $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fxy.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fxy.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gdz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
