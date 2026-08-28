public class gns implements gnv<dus> {
   private final gcg a;
   private final gcg b;

   public gns(gnw.a $$0) {
      this.a = new gcg.a($$0.a(gem.t), glu::d);
      this.b = new gcg.a($$0.a(gem.s), glu::d);
   }

   public static get b() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("main", ges.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gep.a);
      $$1.a("left_leg", ges.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gep.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", ges.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gep.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return get.a($$0, 64, 64);
   }

   public static get c() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("main", ges.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gep.a);
      $$1.a("left_leg", ges.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gep.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", ges.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gep.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return get.a($$0, 64, 64);
   }

   public void a(dus $$0, float $$1, fgr $$2, glk $$3, int $$4, int $$5) {
      hdt $$6 = gmf.r[$$0.c().a()];
      dhh $$7 = $$0.i();
      if ($$7 != null) {
         dxu $$8 = $$0.m();
         dmu.c<? extends dus> $$9 = dmu.a(duy.z, dke::i, dke::h, dlp.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gny<>()).get($$4);
         this.a($$2, $$3, $$8.c(dke.b) == dyh.a ? this.a : this.b, $$8.c(dke.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jm.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jm.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fgr $$0, glk $$1, gcg $$2, jm $$3, hdt $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fgv $$8 = $$4.a($$1, glu::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
