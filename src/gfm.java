public class gfm implements gfp<dpe> {
   private final fxb a;
   private final fxb b;

   public gfm(gfq.a $$0) {
      this.a = $$0.a(fxa.j);
      this.b = $$0.a(fxa.i);
   }

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("main", fxg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxd.a);
      $$1.a("left_leg", fxg.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxg.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxd.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxh.a($$0, 64, 64);
   }

   public static fxh c() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("main", fxg.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxd.a);
      $$1.a("left_leg", fxg.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxd.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxg.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxh.a($$0, 64, 64);
   }

   public void a(dpe $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      gre $$6 = gee.p[$$0.c().a()];
      dbz $$7 = $$0.i();
      if ($$7 != null) {
         dsd $$8 = $$0.n();
         dhh.c<? extends dpe> $$9 = dhh.a(dpk.y, det::h, det::g, dgd.c, $$8, $$7, $$0.ay_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gfs<>()).get($$4);
         this.a($$2, $$3, $$8.c(det.b) == dsq.a ? this.a : this.b, $$8.c(det.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, je.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, je.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ezz $$0, gdp $$1, fxb $$2, je $$3, gre $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fad $$8 = $$4.a($$1, gdx::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
