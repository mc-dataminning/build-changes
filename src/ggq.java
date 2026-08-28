public class ggq implements ggt<dqb> {
   private final fye a;
   private final fye b;

   public ggq(ggu.a $$0) {
      this.a = $$0.a(fyd.j);
      this.b = $$0.a(fyd.i);
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("main", fyj.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fyg.a);
      $$1.a("left_leg", fyj.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fyg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fyj.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fyg.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fyk.a($$0, 64, 64);
   }

   public static fyk c() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("main", fyj.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fyg.a);
      $$1.a("left_leg", fyj.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fyg.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fyj.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fyg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fyk.a($$0, 64, 64);
   }

   public void a(dqb $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      gsj $$6 = gfi.r[$$0.c().a()];
      dcu $$7 = $$0.i();
      if ($$7 != null) {
         dta $$8 = $$0.n();
         did.c<? extends dqb> $$9 = did.a(dqh.y, dfp::h, dfp::g, dgz.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new ggw<>()).get($$4);
         this.a($$2, $$3, $$8.c(dfp.b) == dtn.a ? this.a : this.b, $$8.c(dfp.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ji.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ji.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fbc $$0, get $$1, fye $$2, ji $$3, gsj $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fbg $$8 = $$4.a($$1, gfb::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
