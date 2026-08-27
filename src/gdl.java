public class gdl implements gdo<dni> {
   private final fvb a;
   private final fvb b;

   public gdl(gdp.a $$0) {
      this.a = $$0.a(fva.j);
      this.b = $$0.a(fva.i);
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("main", fvg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fvd.a);
      $$1.a("left_leg", fvg.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fvd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fvg.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fvd.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fvh.a($$0, 64, 64);
   }

   public static fvh c() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("main", fvg.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fvd.a);
      $$1.a("left_leg", fvg.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fvd.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fvg.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fvd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fvh.a($$0, 64, 64);
   }

   public void a(dni $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      gpc $$6 = gcd.p[$$0.c().a()];
      dad $$7 = $$0.i();
      if ($$7 != null) {
         dqh $$8 = $$0.n();
         dfl.c<? extends dni> $$9 = dfl.a(dno.y, dcx::h, dcx::g, deh.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gdr<>()).get($$4);
         this.a($$2, $$3, $$8.c(dcx.b) == dqu.a ? this.a : this.b, $$8.c(dcx.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, is.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, is.d, $$6, $$4, $$5, true);
      }
   }

   private void a(exx $$0, gbo $$1, fvb $$2, is $$3, gpc $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eyb $$8 = $$4.a($$1, gbw::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
