public class gdm extends gby<gzz> {
   public static final gfj a = gfj.scaling(0.5F);
   public static final gfj b = gfj.scaling(1.5F);
   private static final String c = "body_front";
   private static final String d = "body_back";
   private static final float e = -7.2F;
   private final gfa f;

   public gdm(gfa $$0) {
      super($$0);
      this.f = $$0.b("body_back");
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      int $$2 = 20;
      gfk $$3 = $$1.a("body_front", gff.c().a(0, 0).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), gfc.a(0.0F, 20.0F, -7.2F));
      gfk $$4 = $$1.a("body_back", gff.c().a(0, 13).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), gfc.a(0.0F, 20.0F, 0.8000002F));
      $$1.a("head", gff.c().a(22, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gfc.a(0.0F, 20.0F, -7.2F));
      $$4.a("back_fin", gff.c().a(20, 10).a(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F), gfc.a(0.0F, 0.0F, 8.0F));
      $$3.a("top_front_fin", gff.c().a(2, 1).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), gfc.a(0.0F, -4.5F, 5.0F));
      $$4.a("top_back_fin", gff.c().a(0, 2).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), gfc.a(0.0F, -4.5F, -1.0F));
      $$1.a("right_fin", gff.c().a(-4, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gfc.a(-1.5F, 21.5F, -7.2F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gff.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gfc.a(1.5F, 21.5F, -7.2F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      return gfg.a($$0, 32, 32);
   }

   public void a(gzz $$0) {
      super.a($$0);
      float $$1 = 1.0F;
      float $$2 = 1.0F;
      if (!$$0.ak) {
         $$1 = 1.3F;
         $$2 = 1.7F;
      }

      this.f.f = -$$1 * 0.25F * ayy.a($$2 * 0.6F * $$0.u);
   }
}
