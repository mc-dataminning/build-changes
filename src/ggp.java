public class ggp extends ggk<hdj> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gjo d = this.v.b("body");
   private final gjo e = this.d.b("head");
   private final gjo f = this.e.b("eyes");
   private final gjo g = this.d.b("tongue");
   private final gjo i = this.d.b("left_arm");
   private final gjo j = this.d.b("right_arm");
   private final gjo k = this.v.b("left_leg");
   private final gjo l = this.v.b("right_leg");
   private final gjo m = this.d.b("croaking_body");

   public ggp(gjo $$0) {
      super($$0.b("root"));
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      gjy $$2 = $$1.a("root", gjt.c(), gjq.a(0.0F, 24.0F, 0.0F));
      gjy $$3 = $$2.a(
         "body", gjt.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gjq.a(0.0F, -2.0F, 4.0F)
      );
      gjy $$4 = $$3.a(
         "head", gjt.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gjq.a(0.0F, -2.0F, -1.0F)
      );
      gjy $$5 = $$4.a("eyes", gjt.c(), gjq.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gjt.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gjq.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gjt.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gjq.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gjt.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gjs(-0.1F)), gjq.a(0.0F, -1.0F, -5.0F));
      gjy $$6 = $$3.a("tongue", gjt.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gjq.a(0.0F, -1.01F, 1.0F));
      gjy $$7 = $$3.a("left_arm", gjt.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gjq.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gjt.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gjq.a(0.0F, 3.0F, -1.0F));
      gjy $$8 = $$3.a("right_arm", gjt.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gjq.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gjt.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gjq.a(0.0F, 3.0F, 0.0F));
      gjy $$9 = $$2.a("left_leg", gjt.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gjq.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gjt.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gjq.a(2.0F, 3.0F, 0.0F));
      gjy $$10 = $$2.a("right_leg", gjt.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gjq.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gjt.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gjq.a(-2.0F, 3.0F, 0.0F));
      return gju.a($$0, 48, 48);
   }

   public void a(hdj $$0) {
      super.a($$0);
      this.a($$0.b, fqk.c, $$0.u);
      this.a($$0.c, fqk.a, $$0.u);
      this.a($$0.d, fqk.d, $$0.u);
      if ($$0.a) {
         this.a(fqk.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fqk.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fqk.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
