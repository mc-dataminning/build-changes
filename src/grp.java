public class grp extends gsb<guf, fxz> {
   private final fxz a;
   private final fxz b;

   public grp(gpk<guf, fxz> $$0, gam $$1) {
      super($$0);
      this.a = new fxz($$1.a(gap.aR));
      this.b = new fxz($$1.a(gap.aS));
   }

   public void a(fdi $$0, ghl $$1, int $$2, guf $$3, float $$4, float $$5) {
      cvs $$6 = $$3.i;
      if ($$6.h() instanceof ctk $$7 && $$7.d() == ctk.a.a) {
         fxz $$9 = $$3.ae ? this.b : this.a;
         $$9.a($$3);
         int $$10;
         if ($$6.a(axe.bD)) {
            $$10 = axq.f(cyk.a($$6, -6265536));
         } else {
            $$10 = -1;
         }

         fdm $$12 = $$1.getBuffer(ghv.f($$7.b()));
         $$9.a($$0, $$12, $$2, gwx.d, $$10);
         return;
      }
   }
}
