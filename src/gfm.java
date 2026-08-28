public class gfm extends gda<hbu> implements gdj, gfl {
   public static final ggl a = ggl.scaling(0.5F);
   private final ggc b;
   private final ggc c;
   private final ggc d;
   private final ggc e;
   private final ggc f;
   private final ggc g;

   public gfm(ggc $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static ggk a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      float $$2 = 0.5F;
      ggm $$3 = $$1.a("head", ggh.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gge.a);
      ggm $$4 = $$3.a("hat", ggh.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ggg(0.51F)), gge.a);
      $$4.a("hat_rim", ggh.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gge.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", ggh.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gge.a(0.0F, -2.0F, 0.0F));
      ggm $$5 = $$1.a("body", ggh.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gge.a);
      $$5.a("jacket", ggh.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ggg(0.5F)), gge.a);
      $$1.a(
         "arms",
         ggh.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gge.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", ggh.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gge.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", ggh.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gge.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(hbu $$0) {
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
   public ggc b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(fgr $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
