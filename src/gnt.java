public class gnt implements gnw<dut> {
   private final gch a;
   private final gch b;

   public gnt(gnx.a $$0) {
      this.a = new gch.a($$0.a(gen.t), glv::d);
      this.b = new gch.a($$0.a(gen.s), glv::d);
   }

   public static geu b() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("main", get.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), geq.a);
      $$1.a("left_leg", get.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), geq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", get.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), geq.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return geu.a($$0, 64, 64);
   }

   public static geu c() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("main", get.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), geq.a);
      $$1.a("left_leg", get.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), geq.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", get.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), geq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return geu.a($$0, 64, 64);
   }

   public void a(dut $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      hdu $$6 = gmg.r[$$0.c().a()];
      dhi $$7 = $$0.i();
      if ($$7 != null) {
         dxv $$8 = $$0.m();
         dmv.c<? extends dut> $$9 = dmv.a(duz.z, dkf::i, dkf::h, dlq.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gnz<>()).get($$4);
         this.a($$2, $$3, $$8.c(dkf.b) == dyi.a ? this.a : this.b, $$8.c(dkf.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jm.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jm.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fgs $$0, gll $$1, gch $$2, jm $$3, hdu $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fgw $$8 = $$4.a($$1, glv::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
