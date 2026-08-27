public class fuw implements fuz<dgk> {
   private final fmp a;
   private final fmp b;

   public fuw(fva.a $$0) {
      this.a = $$0.a(fmo.i);
      this.b = $$0.a(fmo.h);
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("main", fmu.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fmr.a);
      $$1.a("left_leg", fmu.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fmr.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fmu.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fmr.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fmv.a($$0, 64, 64);
   }

   public static fmv c() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("main", fmu.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fmr.a);
      $$1.a("left_leg", fmu.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fmr.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fmu.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fmr.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fmv.a($$0, 64, 64);
   }

   public void a(dgk $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      ggj $$6 = fto.p[$$0.d().a()];
      cti $$7 = $$0.i();
      if ($$7 != null) {
         dja $$8 = $$0.r();
         cyq.c<? extends dgk> $$9 = cyq.a(dgq.y, cwc::h, cwc::g, cxm.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fvc<>()).get($$4);
         this.a($$2, $$3, $$8.c(cwc.b) == djn.a ? this.a : this.b, $$8.c(cwc.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ic.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ic.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ept $$0, fsz $$1, fmp $$2, ic $$3, ggj $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      epx $$8 = $$4.a($$1, fth::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
