public class gfl implements gfo<dpd> {
   private final fxa a;
   private final fxa b;

   public gfl(gfp.a $$0) {
      this.a = $$0.a(fwz.j);
      this.b = $$0.a(fwz.i);
   }

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("main", fxf.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxc.a);
      $$1.a("left_leg", fxf.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxc.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxf.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxc.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxg.a($$0, 64, 64);
   }

   public static fxg c() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("main", fxf.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxc.a);
      $$1.a("left_leg", fxf.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxc.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxf.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxc.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxg.a($$0, 64, 64);
   }

   public void a(dpd $$0, float $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
      grd $$6 = ged.p[$$0.c().a()];
      dby $$7 = $$0.i();
      if ($$7 != null) {
         dsc $$8 = $$0.n();
         dhg.c<? extends dpd> $$9 = dhg.a(dpj.y, des::h, des::g, dgc.c, $$8, $$7, $$0.ay_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gfr<>()).get($$4);
         this.a($$2, $$3, $$8.c(des.b) == dsp.a ? this.a : this.b, $$8.c(des.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, je.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, je.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ezy $$0, gdo $$1, fxa $$2, je $$3, grd $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fac $$8 = $$4.a($$1, gdw::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
