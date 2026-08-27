public class fxi implements fxl<dip> {
   private final fpc a;
   private final fpc b;

   public fxi(fxm.a $$0) {
      this.a = $$0.a(fpb.j);
      this.b = $$0.a(fpb.i);
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("main", fph.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fpe.a);
      $$1.a("left_leg", fph.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fpe.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fph.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fpe.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fpi.a($$0, 64, 64);
   }

   public static fpi c() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("main", fph.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fpe.a);
      $$1.a("left_leg", fph.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fpe.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fph.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fpe.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fpi.a($$0, 64, 64);
   }

   public void a(dip $$0, float $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      giw $$6 = fwa.p[$$0.d().a()];
      cvn $$7 = $$0.i();
      if ($$7 != null) {
         dlf $$8 = $$0.r();
         dav.c<? extends dip> $$9 = dav.a(div.y, cyh::h, cyh::g, czr.c, $$8, $$7, $$0.aE_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fxo<>()).get($$4);
         this.a($$2, $$3, $$8.c(cyh.b) == dls.a ? this.a : this.b, $$8.c(cyh.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ie.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ie.d, $$6, $$4, $$5, true);
      }
   }

   private void a(esa $$0, fvl $$1, fpc $$2, ie $$3, giw $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ese $$8 = $$4.a($$1, fvt::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
