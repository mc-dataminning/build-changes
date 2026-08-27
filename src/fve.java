public class fve implements fvh<dgr> {
   private final fmx a;
   private final fmx b;

   public fve(fvi.a $$0) {
      this.a = $$0.a(fmw.i);
      this.b = $$0.a(fmw.h);
   }

   public static fnd b() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("main", fnc.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fmz.a);
      $$1.a("left_leg", fnc.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fmz.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fnc.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fmz.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fnd.a($$0, 64, 64);
   }

   public static fnd c() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("main", fnc.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fmz.a);
      $$1.a("left_leg", fnc.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fmz.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fnc.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fmz.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fnd.a($$0, 64, 64);
   }

   public void a(dgr $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      ggq $$6 = ftw.p[$$0.d().a()];
      ctp $$7 = $$0.i();
      if ($$7 != null) {
         djh $$8 = $$0.r();
         cyx.c<? extends dgr> $$9 = cyx.a(dgx.y, cwj::h, cwj::g, cxt.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fvk<>()).get($$4);
         this.a($$2, $$3, $$8.c(cwj.b) == dju.a ? this.a : this.b, $$8.c(cwj.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ic.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ic.d, $$6, $$4, $$5, true);
      }
   }

   private void a(eqb $$0, fth $$1, fmx $$2, ic $$3, ggq $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eqf $$8 = $$4.a($$1, ftp::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
