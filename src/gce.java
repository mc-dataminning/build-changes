public class gce extends gca<gyt> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gfc d = this.v.b("body");
   private final gfc e = this.d.b("head");
   private final gfc f = this.e.b("eyes");
   private final gfc g = this.d.b("tongue");
   private final gfc i = this.d.b("left_arm");
   private final gfc j = this.d.b("right_arm");
   private final gfc k = this.v.b("left_leg");
   private final gfc l = this.v.b("right_leg");
   private final gfc m = this.d.b("croaking_body");

   public gce(gfc $$0) {
      super($$0.b("root"));
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      gfm $$2 = $$1.a("root", gfh.c(), gfe.a(0.0F, 24.0F, 0.0F));
      gfm $$3 = $$2.a(
         "body", gfh.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gfe.a(0.0F, -2.0F, 4.0F)
      );
      gfm $$4 = $$3.a(
         "head", gfh.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gfe.a(0.0F, -2.0F, -1.0F)
      );
      gfm $$5 = $$4.a("eyes", gfh.c(), gfe.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gfh.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gfe.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gfh.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gfe.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gfh.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gfg(-0.1F)), gfe.a(0.0F, -1.0F, -5.0F));
      gfm $$6 = $$3.a("tongue", gfh.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gfe.a(0.0F, -1.01F, 1.0F));
      gfm $$7 = $$3.a("left_arm", gfh.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gfe.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gfh.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfe.a(0.0F, 3.0F, -1.0F));
      gfm $$8 = $$3.a("right_arm", gfh.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gfe.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gfh.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gfe.a(0.0F, 3.0F, 0.0F));
      gfm $$9 = $$2.a("left_leg", gfh.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gfe.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gfh.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfe.a(2.0F, 3.0F, 0.0F));
      gfm $$10 = $$2.a("right_leg", gfh.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gfe.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gfh.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfe.a(-2.0F, 3.0F, 0.0F));
      return gfi.a($$0, 48, 48);
   }

   public void a(gyt $$0) {
      super.a($$0);
      this.a($$0.b, fme.c, $$0.u);
      this.a($$0.c, fme.a, $$0.u);
      this.a($$0.d, fme.d, $$0.u);
      if ($$0.a) {
         this.a(fme.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fme.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fme.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
