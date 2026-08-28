public class goi implements gol<dtw> {
   private final gcx a;
   private final gcx b;

   public goi(gom.a $$0) {
      this($$0.f());
   }

   public goi(gfa $$0) {
      this.a = new gcx.a($$0.a(gfd.w), gmj::d);
      this.b = new gcx.a($$0.a(gfd.v), gmj::d);
   }

   public static gfk b() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("main", gfj.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gfg.a);
      $$1.a("left_leg", gfj.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gfg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gfj.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gfg.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gfk.a($$0, 64, 64);
   }

   public static gfk c() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("main", gfj.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gfg.a);
      $$1.a("left_leg", gfj.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gfg.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gfj.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gfg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gfk.a($$0, 64, 64);
   }

   public void a(dtw $$0, float $$1, ffv $$2, glz $$3, int $$4, int $$5) {
      dgj $$6 = $$0.i();
      if ($$6 != null) {
         hha $$7 = gmu.a($$0.c());
         dwy $$8 = $$0.m();
         dlv.c<? extends dtw> $$9 = dlv.a(duc.z, djg::i, djg::h, dkq.c, $$8, $$6, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new goo<>()).get($$4);
         this.a($$2, $$3, $$8.c(djg.b) == dxl.a ? this.a : this.b, $$8.c(djg.aF), $$7, $$10, $$5, false);
      }
   }

   public void a(ffv $$0, glz $$1, int $$2, int $$3, hha $$4) {
      this.a($$0, $$1, this.a, jn.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jn.d, $$4, $$2, $$3, true);
   }

   private void a(ffv $$0, glz $$1, gcx $$2, jn $$3, hha $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ffz $$8 = $$4.a($$1, gmj::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
