public class grk extends grw<gua, fxv> {
   private final fxv a;
   private final fxv b;

   public grk(gpf<gua, fxv> $$0, gah $$1) {
      super($$0);
      this.a = new fxv($$1.a(gak.aR));
      this.b = new fxv($$1.a(gak.aS));
   }

   public void a(fde $$0, ghg $$1, int $$2, gua $$3, float $$4, float $$5) {
      cvp $$6 = $$3.i;
      if ($$6.h() instanceof cth $$7 && $$7.d() == cth.a.a) {
         fxv $$9 = $$3.ae ? this.b : this.a;
         $$9.a($$3);
         int $$10;
         if ($$6.a(axc.bD)) {
            $$10 = axo.f(cyh.a($$6, -6265536));
         } else {
            $$10 = -1;
         }

         fdi $$12 = $$1.getBuffer(ghq.f($$7.b()));
         $$9.a($$0, $$12, $$2, gws.d, $$10);
         return;
      }
   }
}
