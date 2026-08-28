public class gcc extends gby<gyr> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gfa d = this.v.b("body");
   private final gfa e = this.d.b("head");
   private final gfa f = this.e.b("eyes");
   private final gfa g = this.d.b("tongue");
   private final gfa i = this.d.b("left_arm");
   private final gfa j = this.d.b("right_arm");
   private final gfa k = this.v.b("left_leg");
   private final gfa l = this.v.b("right_leg");
   private final gfa m = this.d.b("croaking_body");

   public gcc(gfa $$0) {
      super($$0.b("root"));
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      gfk $$2 = $$1.a("root", gff.c(), gfc.a(0.0F, 24.0F, 0.0F));
      gfk $$3 = $$2.a(
         "body", gff.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gfc.a(0.0F, -2.0F, 4.0F)
      );
      gfk $$4 = $$3.a(
         "head", gff.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gfc.a(0.0F, -2.0F, -1.0F)
      );
      gfk $$5 = $$4.a("eyes", gff.c(), gfc.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gff.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gfc.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gff.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gfc.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gff.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gfe(-0.1F)), gfc.a(0.0F, -1.0F, -5.0F));
      gfk $$6 = $$3.a("tongue", gff.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gfc.a(0.0F, -1.01F, 1.0F));
      gfk $$7 = $$3.a("left_arm", gff.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gfc.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gff.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfc.a(0.0F, 3.0F, -1.0F));
      gfk $$8 = $$3.a("right_arm", gff.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gfc.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gff.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gfc.a(0.0F, 3.0F, 0.0F));
      gfk $$9 = $$2.a("left_leg", gff.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gfc.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gff.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfc.a(2.0F, 3.0F, 0.0F));
      gfk $$10 = $$2.a("right_leg", gff.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gfc.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gff.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfc.a(-2.0F, 3.0F, 0.0F));
      return gfg.a($$0, 48, 48);
   }

   public void a(gyr $$0) {
      super.a($$0);
      this.a($$0.b, fmd.c, $$0.u);
      this.a($$0.c, fmd.a, $$0.u);
      this.a($$0.d, fmd.d, $$0.u);
      if ($$0.a) {
         this.a(fmd.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fmd.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fmd.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
