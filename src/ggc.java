public class ggc implements ggf<dpm> {
   private final fxq a;
   private final fxq b;

   public ggc(ggg.a $$0) {
      this.a = $$0.a(fxp.j);
      this.b = $$0.a(fxp.i);
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("main", fxv.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxs.a);
      $$1.a("left_leg", fxv.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxs.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxv.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxs.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxw.a($$0, 64, 64);
   }

   public static fxw c() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("main", fxv.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxs.a);
      $$1.a("left_leg", fxv.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxs.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxv.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxs.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxw.a($$0, 64, 64);
   }

   public void a(dpm $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      gru $$6 = geu.r[$$0.c().a()];
      dcg $$7 = $$0.i();
      if ($$7 != null) {
         dsl $$8 = $$0.n();
         dhp.c<? extends dpm> $$9 = dhp.a(dps.y, dfb::h, dfb::g, dgl.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new ggi<>()).get($$4);
         this.a($$2, $$3, $$8.c(dfb.b) == dsy.a ? this.a : this.b, $$8.c(dfb.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jf.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jf.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fao $$0, gef $$1, fxq $$2, jf $$3, gru $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fas $$8 = $$4.a($$1, gen::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
