public class fxp<T extends bjm> extends fxl<T, fgw<T>> {
   private final fey<T> a;

   public fxp(fuy<T, fgw<T>> $$0, fht $$1) {
      super($$0);
      this.a = new fgw<>($$1.a(fhw.bn));
   }

   public void a(elj $$0, foa $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eqp $$10 = eqp.O();
      boolean $$11 = $$10.b($$3) && $$3.cd();
      if (!$$3.cd() || $$11) {
         eln $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(foi.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(foi.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fue.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
