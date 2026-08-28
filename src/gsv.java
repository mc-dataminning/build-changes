public class gsv implements gsy<dxi> {
   private final ghg a;
   private final ghg b;

   public gsv(gsz.a $$0) {
      this($$0.f());
   }

   public gsv(gjk $$0) {
      this.a = new ghg.a($$0.a(gjn.w), gqx::d);
      this.b = new ghg.a($$0.a(gjn.v), gqx::d);
   }

   public static gju b() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      $$1.a("main", gjt.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gjq.a);
      $$1.a("left_leg", gjt.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gjq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gjt.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gjq.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gju.a($$0, 64, 64);
   }

   public static gju c() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      $$1.a("main", gjt.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gjq.a);
      $$1.a("left_leg", gjt.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gjq.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gjt.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gjq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gju.a($$0, 64, 64);
   }

   public void a(dxi $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      djh $$7 = $$0.i();
      if ($$7 != null) {
         hlq $$8 = grg.a($$0.c());
         eao $$9 = $$0.m();
         dou.c<? extends dxi> $$10 = dou.a(dxo.z, dmf::i, dmf::h, dnq.c, $$9, $$7, $$0.ax_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new gtc<>()).get($$4);
         this.a($$2, $$3, $$9.c(dmf.b) == ebb.a ? this.a : this.b, $$9.c(dmf.e), $$8, $$11, $$5, false);
      }
   }

   public void a(fjy $$0, gqm $$1, int $$2, int $$3, hlq $$4) {
      this.a($$0, $$1, this.a, jb.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jb.d, $$4, $$2, $$3, true);
   }

   private void a(fjy $$0, gqm $$1, ghg $$2, jb $$3, hlq $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fkc $$8 = $$4.a($$1, gqx::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
