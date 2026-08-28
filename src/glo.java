public class glo implements glr<dsu> {
   private final gae a;
   private final gae b;

   public glo(gls.a $$0) {
      this.a = new gae.a($$0.a(gck.t), gjq::c);
      this.b = new gae.a($$0.a(gck.s), gjq::c);
   }

   public static gcr b() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("main", gcq.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gcn.a);
      $$1.a("left_leg", gcq.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gcn.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gcq.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gcn.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gcr.a($$0, 64, 64);
   }

   public static gcr c() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("main", gcq.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gcn.a);
      $$1.a("left_leg", gcq.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gcn.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gcq.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gcn.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gcr.a($$0, 64, 64);
   }

   public void a(dsu $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      hbn $$6 = gkb.r[$$0.c().a()];
      dfm $$7 = $$0.i();
      if ($$7 != null) {
         dvv $$8 = $$0.m();
         dkx.c<? extends dsu> $$9 = dkx.a(dta.y, dij::i, dij::h, djt.c, $$8, $$7, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new glu<>()).get($$4);
         this.a($$2, $$3, $$8.c(dij.b) == dwi.a ? this.a : this.b, $$8.c(dij.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jm.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jm.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fer $$0, gjg $$1, gae $$2, jm $$3, hbn $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fev $$8 = $$4.a($$1, gjq::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
