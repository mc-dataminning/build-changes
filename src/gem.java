public class gem extends gca<hau> implements gcj, gel {
   public static final gfl a = gfl.scaling(0.5F);
   private final gfc b;
   private final gfc c;
   private final gfc d;
   private final gfc e;
   private final gfc f;
   private final gfc g;

   public gem(gfc $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gfk a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      float $$2 = 0.5F;
      gfm $$3 = $$1.a("head", gfh.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gfe.a);
      gfm $$4 = $$3.a("hat", gfh.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gfg(0.51F)), gfe.a);
      $$4.a("hat_rim", gfh.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gfe.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", gfh.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gfe.a(0.0F, -2.0F, 0.0F));
      gfm $$5 = $$1.a("body", gfh.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gfe.a);
      $$5.a("jacket", gfh.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gfg(0.5F)), gfe.a);
      $$1.a(
         "arms",
         gfh.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gfe.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", gfh.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfe.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gfh.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfe.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(hau $$0) {
      super.a($$0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.g = 0.3F * ayz.a(0.45F * $$0.u);
         this.b.e = 0.4F;
      } else {
         this.b.g = 0.0F;
      }

      this.e.e = ayz.b($$0.ad * 0.6662F) * 1.4F * $$0.ae * 0.5F;
      this.f.e = ayz.b($$0.ad * 0.6662F + (float) Math.PI) * 1.4F * $$0.ae * 0.5F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   @Override
   public gfc b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(fft $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
