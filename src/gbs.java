public class gbs extends gam<gyd> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private final gfa g = this.c.b("left_chest");
   private final gfa i = this.c.b("right_chest");

   public gbs(gfa $$0) {
      super($$0);
   }

   public static gfg a(float $$0) {
      gfi $$1 = gam.a(gfe.a);
      a($$1.a());
      return gfg.a($$1, 64, 64).a(gfj.scaling($$0));
   }

   public static gfg b(float $$0) {
      gfi $$1 = gam.c(gfe.a);
      a($$1.a());
      return gfg.a(gam.b.apply($$1), 64, 64).a(gfj.scaling($$0));
   }

   private static void a(gfk $$0) {
      gfk $$1 = $$0.b("body");
      gff $$2 = gff.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gfc.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gfc.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gfk $$3 = $$0.b("head_parts").b("head");
      gff $$4 = gff.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gfc.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gfc.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gyd $$0) {
      super.a($$0);
      this.g.k = $$0.a;
      this.i.k = $$0.a;
   }
}
