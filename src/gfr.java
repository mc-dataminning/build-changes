public class gfr extends ggk<hcn> {
   private static final float c = 2.0F;
   private static final float d = 2.5F;
   public static final gjx a = gjx.scaling(0.45F);
   protected final gjo b;

   public gfr(gjo $$0) {
      super($$0);
      gjo $$1 = $$0.b("body");
      this.b = $$1.b("head");
   }

   public static gju a() {
      return gju.a(b(), 128, 128);
   }

   protected static gjw b() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      gjy $$2 = $$1.a("body", gjt.c().a(0, 25).a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F), gjq.a(0.0F, 4.0F, 9.5F));
      $$2.a("hump", gjt.c().a(74, 0).a(-4.5F, -5.0F, -5.5F, 9.0F, 5.0F, 11.0F), gjq.a(0.0F, -12.0F, -10.0F));
      $$2.a("tail", gjt.c().a(122, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F), gjq.a(0.0F, -9.0F, 3.5F));
      gjy $$3 = $$2.a(
         "head",
         gjt.c()
            .a(60, 24)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F)
            .a(21, 0)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F)
            .a(50, 0)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F),
         gjq.a(0.0F, -3.0F, -19.5F)
      );
      $$3.a("left_ear", gjt.c().a(45, 0).a(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gjq.a(2.5F, -21.0F, -9.5F));
      $$3.a("right_ear", gjt.c().a(67, 0).a(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gjq.a(-2.5F, -21.0F, -9.5F));
      $$1.a("left_hind_leg", gjt.c().a(58, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gjq.a(4.9F, 1.0F, 9.5F));
      $$1.a("right_hind_leg", gjt.c().a(94, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gjq.a(-4.9F, 1.0F, 9.5F));
      $$1.a("left_front_leg", gjt.c().a(0, 0).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gjq.a(4.9F, 1.0F, -10.5F));
      $$1.a("right_front_leg", gjt.c().a(0, 26).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gjq.a(-4.9F, 1.0F, -10.5F));
      return $$0;
   }

   public void a(hcn $$0) {
      super.a($$0);
      this.a($$0, $$0.aa, $$0.ab);
      this.a(fqi.a, $$0.ad, $$0.ae, 2.0F, 2.5F);
      this.a($$0.d, fqi.b, $$0.u, 1.0F);
      this.a($$0.e, fqi.c, $$0.u, 1.0F);
      this.a($$0.f, fqi.d, $$0.u, 1.0F);
      this.a($$0.g, fqi.f, $$0.u, 1.0F);
      this.a($$0.h, fqi.e, $$0.u, 1.0F);
   }

   private void a(hcn $$0, float $$1, float $$2) {
      $$1 = azm.a($$1, -30.0F, 30.0F);
      $$2 = azm.a($$2, -25.0F, 45.0F);
      if ($$0.c > 0.0F) {
         float $$3 = 45.0F * $$0.c / 55.0F;
         $$2 = azm.a($$2 + $$3, -25.0F, 70.0F);
      }

      this.b.f = $$1 * (float) (Math.PI / 180.0);
      this.b.e = $$2 * (float) (Math.PI / 180.0);
   }
}
