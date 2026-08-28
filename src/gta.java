public class gta implements gtd<dxn> {
   private final ghl a;
   private final ghl b;

   public gta(gte.a $$0) {
      this($$0.f());
   }

   public gta(gjp $$0) {
      this.a = new ghl.a($$0.a(gjs.w), grc::d);
      this.b = new ghl.a($$0.a(gjs.v), grc::d);
   }

   public static gjz b() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("main", gjy.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gjv.a);
      $$1.a("left_leg", gjy.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gjv.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gjy.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gjv.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gjz.a($$0, 64, 64);
   }

   public static gjz c() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("main", gjy.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gjv.a);
      $$1.a("left_leg", gjy.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gjv.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gjy.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gjv.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gjz.a($$0, 64, 64);
   }

   public void a(dxn $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      djm $$7 = $$0.i();
      if ($$7 != null) {
         hlx $$8 = grl.a($$0.c());
         eat $$9 = $$0.m();
         doz.c<? extends dxn> $$10 = doz.a(dxt.z, dmk::i, dmk::h, dnv.c, $$9, $$7, $$0.ax_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new gth<>()).get($$4);
         this.a($$2, $$3, $$9.c(dmk.b) == ebg.a ? this.a : this.b, $$9.c(dmk.e), $$8, $$11, $$5, false);
      }
   }

   public void a(fkd $$0, gqr $$1, int $$2, int $$3, hlx $$4) {
      this.a($$0, $$1, this.a, jb.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jb.d, $$4, $$2, $$3, true);
   }

   private void a(fkd $$0, gqr $$1, ghl $$2, jb $$3, hlx $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fkh $$8 = $$4.a($$1, grc::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
