public class gbw extends gaq<gyh> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private final gfe g = this.c.b("left_chest");
   private final gfe i = this.c.b("right_chest");

   public gbw(gfe $$0) {
      super($$0);
   }

   public static gfk a(float $$0) {
      gfm $$1 = gaq.a(gfi.a);
      a($$1.a());
      return gfk.a($$1, 64, 64).a(gfn.scaling($$0));
   }

   public static gfk b(float $$0) {
      gfm $$1 = gaq.c(gfi.a);
      a($$1.a());
      return gfk.a(gaq.b.apply($$1), 64, 64).a(gfn.scaling($$0));
   }

   private static void a(gfo $$0) {
      gfo $$1 = $$0.b("body");
      gfj $$2 = gfj.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gfg.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gfg.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gfo $$3 = $$0.b("head_parts").b("head");
      gfj $$4 = gfj.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gfg.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gfg.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gyh $$0) {
      super.a($$0);
      this.g.k = $$0.a;
      this.i.k = $$0.a;
   }
}
