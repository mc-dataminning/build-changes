public class gbv extends gap<gyg> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private final gfd g = this.c.b("left_chest");
   private final gfd i = this.c.b("right_chest");

   public gbv(gfd $$0) {
      super($$0);
   }

   public static gfj a(float $$0) {
      gfl $$1 = gap.a(gfh.a);
      a($$1.a());
      return gfj.a($$1, 64, 64).a(gfm.scaling($$0));
   }

   public static gfj b(float $$0) {
      gfl $$1 = gap.c(gfh.a);
      a($$1.a());
      return gfj.a(gap.b.apply($$1), 64, 64).a(gfm.scaling($$0));
   }

   private static void a(gfn $$0) {
      gfn $$1 = $$0.b("body");
      gfi $$2 = gfi.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gff.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gff.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gfn $$3 = $$0.b("head_parts").b("head");
      gfi $$4 = gfi.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gff.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gff.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gyg $$0) {
      super.a($$0);
      this.g.k = $$0.a;
      this.i.k = $$0.a;
   }
}
