public class gnm implements gnp<dul> {
   private final gca a;
   private final gca b;

   public gnm(gnq.a $$0) {
      this.a = new gca.a($$0.a(geg.t), glo::c);
      this.b = new gca.a($$0.a(geg.s), glo::c);
   }

   public static gen b() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("main", gem.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gej.a);
      $$1.a("left_leg", gem.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gej.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gem.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gej.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gen.a($$0, 64, 64);
   }

   public static gen c() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("main", gem.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gej.a);
      $$1.a("left_leg", gem.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gej.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gem.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gej.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gen.a($$0, 64, 64);
   }

   public void a(dul $$0, float $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      hdn $$6 = glz.r[$$0.c().a()];
      dha $$7 = $$0.i();
      if ($$7 != null) {
         dxn $$8 = $$0.m();
         dmn.c<? extends dul> $$9 = dmn.a(dur.z, djx::i, djx::h, dli.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gns<>()).get($$4);
         this.a($$2, $$3, $$8.c(djx.b) == dya.a ? this.a : this.b, $$8.c(djx.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jm.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jm.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fgl $$0, gle $$1, gca $$2, jm $$3, hdn $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fgp $$8 = $$4.a($$1, glo::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
