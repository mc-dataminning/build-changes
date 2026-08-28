public class gih extends gic<hfb> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final glg d = this.v.b("body");
   private final glg e = this.d.b("head");
   private final glg f = this.e.b("eyes");
   private final glg g = this.d.b("tongue");
   private final glg i = this.d.b("left_arm");
   private final glg j = this.d.b("right_arm");
   private final glg k = this.v.b("left_leg");
   private final glg l = this.v.b("right_leg");
   private final glg m = this.d.b("croaking_body");

   public gih(glg $$0) {
      super($$0.b("root"));
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("root", gll.c(), gli.a(0.0F, 24.0F, 0.0F));
      glq $$3 = $$2.a(
         "body", gll.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gli.a(0.0F, -2.0F, 4.0F)
      );
      glq $$4 = $$3.a(
         "head", gll.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gli.a(0.0F, -2.0F, -1.0F)
      );
      glq $$5 = $$4.a("eyes", gll.c(), gli.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gll.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gli.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gll.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gli.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gll.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new glk(-0.1F)), gli.a(0.0F, -1.0F, -5.0F));
      glq $$6 = $$3.a("tongue", gll.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gli.a(0.0F, -1.01F, 1.0F));
      glq $$7 = $$3.a("left_arm", gll.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gli.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gll.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gli.a(0.0F, 3.0F, -1.0F));
      glq $$8 = $$3.a("right_arm", gll.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gli.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gll.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gli.a(0.0F, 3.0F, 0.0F));
      glq $$9 = $$2.a("left_leg", gll.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gli.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gll.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gli.a(2.0F, 3.0F, 0.0F));
      glq $$10 = $$2.a("right_leg", gll.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gli.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gll.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gli.a(-2.0F, 3.0F, 0.0F));
      return glm.a($$0, 48, 48);
   }

   public void a(hfb $$0) {
      super.a($$0);
      this.a($$0.b, fsb.c, $$0.u);
      this.a($$0.c, fsb.a, $$0.u);
      this.a($$0.d, fsb.d, $$0.u);
      if ($$0.a) {
         this.a(fsb.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fsb.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fsb.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
