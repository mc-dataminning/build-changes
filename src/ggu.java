public class ggu extends ggp<hdp> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gjt d = this.v.b("body");
   private final gjt e = this.d.b("head");
   private final gjt f = this.e.b("eyes");
   private final gjt g = this.d.b("tongue");
   private final gjt i = this.d.b("left_arm");
   private final gjt j = this.d.b("right_arm");
   private final gjt k = this.v.b("left_leg");
   private final gjt l = this.v.b("right_leg");
   private final gjt m = this.d.b("croaking_body");

   public ggu(gjt $$0) {
      super($$0.b("root"));
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      gkd $$2 = $$1.a("root", gjy.c(), gjv.a(0.0F, 24.0F, 0.0F));
      gkd $$3 = $$2.a(
         "body", gjy.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gjv.a(0.0F, -2.0F, 4.0F)
      );
      gkd $$4 = $$3.a(
         "head", gjy.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gjv.a(0.0F, -2.0F, -1.0F)
      );
      gkd $$5 = $$4.a("eyes", gjy.c(), gjv.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gjy.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gjv.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gjy.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gjv.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gjy.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gjx(-0.1F)), gjv.a(0.0F, -1.0F, -5.0F));
      gkd $$6 = $$3.a("tongue", gjy.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gjv.a(0.0F, -1.01F, 1.0F));
      gkd $$7 = $$3.a("left_arm", gjy.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gjv.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gjy.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gjv.a(0.0F, 3.0F, -1.0F));
      gkd $$8 = $$3.a("right_arm", gjy.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gjv.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gjy.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gjv.a(0.0F, 3.0F, 0.0F));
      gkd $$9 = $$2.a("left_leg", gjy.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gjv.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gjy.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gjv.a(2.0F, 3.0F, 0.0F));
      gkd $$10 = $$2.a("right_leg", gjy.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gjv.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gjy.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gjv.a(-2.0F, 3.0F, 0.0F));
      return gjz.a($$0, 48, 48);
   }

   public void a(hdp $$0) {
      super.a($$0);
      this.a($$0.b, fqp.c, $$0.u);
      this.a($$0.c, fqp.a, $$0.u);
      this.a($$0.d, fqp.d, $$0.u);
      if ($$0.a) {
         this.a(fqp.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fqp.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fqp.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
