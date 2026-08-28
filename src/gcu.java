public class gcu extends gbm<gzf> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private final ggc g = this.c.b("left_chest");
   private final ggc i = this.c.b("right_chest");

   public gcu(ggc $$0) {
      super($$0);
   }

   public static ggi a(float $$0) {
      ggk $$1 = gbm.a(ggg.a);
      a($$1.a());
      return ggi.a($$1, 64, 64).a(ggl.scaling($$0));
   }

   public static ggi b(float $$0) {
      ggk $$1 = gbm.c(ggg.a);
      a($$1.a());
      return ggi.a(gbm.b.apply($$1), 64, 64).a(ggl.scaling($$0));
   }

   private static void a(ggm $$0) {
      ggm $$1 = $$0.b("body");
      ggh $$2 = ggh.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gge.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gge.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      ggm $$3 = $$0.b("head_parts").b("head");
      ggh $$4 = ggh.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gge.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gge.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gzf $$0) {
      super.a($$0);
      this.g.k = $$0.a;
      this.i.k = $$0.a;
   }
}
