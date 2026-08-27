public class gdp<T extends bmo> extends gdl<T, fmh<T>> {
   private final fkj<T> a;

   public gdp(gav<T, fmh<T>> $$0, fnf $$1) {
      super($$0);
      this.a = new fmh<>($$1.a(fni.bp));
   }

   public void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      evr $$10 = evr.O();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eqo $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fub.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fub.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gab.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
