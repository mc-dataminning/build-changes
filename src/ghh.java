public class ghh extends gfw<hdy> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final gla g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final gkr i = this.c.b("left_chest");
   private final gkr j = this.c.b("right_chest");

   public ghh(gkr $$0) {
      super($$0);
   }

   public static gkx a(float $$0) {
      return gkx.a(gfw.a(gkv.a), 64, 64).a(g).a(gla.scaling($$0));
   }

   public static gkx b(float $$0) {
      return gkx.a(gfw.c(gkv.a), 64, 64).a(g).a(b).a(gla.scaling($$0));
   }

   public static gkx a(float $$0, boolean $$1) {
      return gho.b($$1).a(g).a($$1 ? gfw.b : gla.a).a(gla.scaling($$0));
   }

   private static void a(glb $$0) {
      glb $$1 = $$0.b("body");
      gkw $$2 = gkw.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gkt.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gkt.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      glb $$3 = $$0.b("head_parts").b("head");
      gkw $$4 = gkw.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gkt.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gkt.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hdy $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
