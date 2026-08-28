public class ggu implements ggx<dqd> {
   private final fyi a;
   private final fyi b;

   public ggu(ggy.a $$0) {
      this.a = $$0.a(fyh.j);
      this.b = $$0.a(fyh.i);
   }

   public static fyo b() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("main", fyn.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fyk.a);
      $$1.a("left_leg", fyn.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fyk.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fyn.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fyk.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fyo.a($$0, 64, 64);
   }

   public static fyo c() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("main", fyn.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fyk.a);
      $$1.a("left_leg", fyn.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fyk.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fyn.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fyk.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fyo.a($$0, 64, 64);
   }

   public void a(dqd $$0, float $$1, fbg $$2, gex $$3, int $$4, int $$5) {
      gso $$6 = gfm.r[$$0.c().a()];
      dcw $$7 = $$0.i();
      if ($$7 != null) {
         dtc $$8 = $$0.n();
         dif.c<? extends dqd> $$9 = dif.a(dqj.y, dfr::h, dfr::g, dhb.c, $$8, $$7, $$0.aD_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gha<>()).get($$4);
         this.a($$2, $$3, $$8.c(dfr.b) == dtp.a ? this.a : this.b, $$8.c(dfr.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ji.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ji.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fbg $$0, gex $$1, fyi $$2, ji $$3, gso $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fbk $$8 = $$4.a($$1, gff::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
