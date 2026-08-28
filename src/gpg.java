public class gpg implements gpj<duo> {
   private final gdv a;
   private final gdv b;

   public gpg(gpk.a $$0) {
      this($$0.f());
   }

   public gpg(gfy $$0) {
      this.a = new gdv.a($$0.a(ggb.w), gnh::d);
      this.b = new gdv.a($$0.a(ggb.v), gnh::d);
   }

   public static ggi b() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("main", ggh.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gge.a);
      $$1.a("left_leg", ggh.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gge.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", ggh.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gge.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return ggi.a($$0, 64, 64);
   }

   public static ggi c() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("main", ggh.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gge.a);
      $$1.a("left_leg", ggh.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gge.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", ggh.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gge.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return ggi.a($$0, 64, 64);
   }

   public void a(duo $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      dgz $$6 = $$0.i();
      if ($$6 != null) {
         hhy $$7 = gns.a($$0.c());
         dxq $$8 = $$0.m();
         dmm.c<? extends duo> $$9 = dmm.a(duu.z, djx::i, djx::h, dlh.c, $$8, $$6, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gpm<>()).get($$4);
         this.a($$2, $$3, $$8.c(djx.b) == dyd.a ? this.a : this.b, $$8.c(djx.e), $$7, $$10, $$5, false);
      }
   }

   public void a(fgr $$0, gmx $$1, int $$2, int $$3, hhy $$4) {
      this.a($$0, $$1, this.a, jn.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jn.d, $$4, $$2, $$3, true);
   }

   private void a(fgr $$0, gmx $$1, gdv $$2, jn $$3, hhy $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fgv $$8 = $$4.a($$1, gnh::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
