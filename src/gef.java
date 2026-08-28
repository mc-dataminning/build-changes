public class gef extends gea<hau> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final ghd d = this.v.b("body");
   private final ghd e = this.d.b("head");
   private final ghd f = this.e.b("eyes");
   private final ghd g = this.d.b("tongue");
   private final ghd i = this.d.b("left_arm");
   private final ghd j = this.d.b("right_arm");
   private final ghd k = this.v.b("left_leg");
   private final ghd l = this.v.b("right_leg");
   private final ghd m = this.d.b("croaking_body");

   public gef(ghd $$0) {
      super($$0.b("root"));
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("root", ghi.c(), ghf.a(0.0F, 24.0F, 0.0F));
      ghn $$3 = $$2.a(
         "body", ghi.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), ghf.a(0.0F, -2.0F, 4.0F)
      );
      ghn $$4 = $$3.a(
         "head", ghi.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), ghf.a(0.0F, -2.0F, -1.0F)
      );
      ghn $$5 = $$4.a("eyes", ghi.c(), ghf.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", ghi.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), ghf.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", ghi.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), ghf.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", ghi.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new ghh(-0.1F)), ghf.a(0.0F, -1.0F, -5.0F));
      ghn $$6 = $$3.a("tongue", ghi.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), ghf.a(0.0F, -1.01F, 1.0F));
      ghn $$7 = $$3.a("left_arm", ghi.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), ghf.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", ghi.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), ghf.a(0.0F, 3.0F, -1.0F));
      ghn $$8 = $$3.a("right_arm", ghi.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), ghf.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", ghi.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), ghf.a(0.0F, 3.0F, 0.0F));
      ghn $$9 = $$2.a("left_leg", ghi.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), ghf.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", ghi.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), ghf.a(2.0F, 3.0F, 0.0F));
      ghn $$10 = $$2.a("right_leg", ghi.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), ghf.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", ghi.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), ghf.a(-2.0F, 3.0F, 0.0F));
      return ghj.a($$0, 48, 48);
   }

   public void a(hau $$0) {
      super.a($$0);
      this.a($$0.b, fnz.c, $$0.u);
      this.a($$0.c, fnz.a, $$0.u);
      this.a($$0.d, fnz.d, $$0.u);
      if ($$0.a) {
         this.a(fnz.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fnz.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fnz.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
