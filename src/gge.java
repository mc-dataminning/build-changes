public class gge extends get<hcv> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final gjx g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final gjo i = this.c.b("left_chest");
   private final gjo j = this.c.b("right_chest");

   public gge(gjo $$0) {
      super($$0);
   }

   public static gju a(float $$0) {
      return gju.a(get.a(gjs.a), 64, 64).a(g).a(gjx.scaling($$0));
   }

   public static gju b(float $$0) {
      return gju.a(get.c(gjs.a), 64, 64).a(g).a(b).a(gjx.scaling($$0));
   }

   public static gju a(float $$0, boolean $$1) {
      return ggl.b($$1).a(g).a($$1 ? get.b : gjx.a).a(gjx.scaling($$0));
   }

   private static void a(gjy $$0) {
      gjy $$1 = $$0.b("body");
      gjt $$2 = gjt.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gjq.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gjq.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gjy $$3 = $$0.b("head_parts").b("head");
      gjt $$4 = gjt.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gjq.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gjq.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hcv $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
