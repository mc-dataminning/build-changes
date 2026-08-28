public class gbu extends gao<gye> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private final gfc g = this.c.b("left_chest");
   private final gfc i = this.c.b("right_chest");

   public gbu(gfc $$0) {
      super($$0);
   }

   public static gfi a(float $$0) {
      gfk $$1 = gao.a(gfg.a);
      a($$1.a());
      return gfi.a($$1, 64, 64).a(gfl.scaling($$0));
   }

   public static gfi b(float $$0) {
      gfk $$1 = gao.c(gfg.a);
      a($$1.a());
      return gfi.a(gao.b.apply($$1), 64, 64).a(gfl.scaling($$0));
   }

   private static void a(gfm $$0) {
      gfm $$1 = $$0.b("body");
      gfh $$2 = gfh.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gfe.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gfe.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gfm $$3 = $$0.b("head_parts").b("head");
      gfh $$4 = gfh.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gfe.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gfe.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gye $$0) {
      super.a($$0);
      this.g.k = $$0.a;
      this.i.k = $$0.a;
   }
}
