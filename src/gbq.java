public class gbq extends gbm<gyf> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final geo d = this.v.b("body");
   private final geo e = this.d.b("head");
   private final geo f = this.e.b("eyes");
   private final geo g = this.d.b("tongue");
   private final geo i = this.d.b("left_arm");
   private final geo j = this.d.b("right_arm");
   private final geo k = this.v.b("left_leg");
   private final geo l = this.v.b("right_leg");
   private final geo m = this.d.b("croaking_body");

   public gbq(geo $$0) {
      super($$0.b("root"));
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      gey $$2 = $$1.a("root", get.c(), geq.a(0.0F, 24.0F, 0.0F));
      gey $$3 = $$2.a(
         "body", get.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), geq.a(0.0F, -2.0F, 4.0F)
      );
      gey $$4 = $$3.a(
         "head", get.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), geq.a(0.0F, -2.0F, -1.0F)
      );
      gey $$5 = $$4.a("eyes", get.c(), geq.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", get.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), geq.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", get.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), geq.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", get.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new ges(-0.1F)), geq.a(0.0F, -1.0F, -5.0F));
      gey $$6 = $$3.a("tongue", get.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), geq.a(0.0F, -1.01F, 1.0F));
      gey $$7 = $$3.a("left_arm", get.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), geq.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", get.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), geq.a(0.0F, 3.0F, -1.0F));
      gey $$8 = $$3.a("right_arm", get.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), geq.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", get.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), geq.a(0.0F, 3.0F, 0.0F));
      gey $$9 = $$2.a("left_leg", get.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), geq.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", get.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), geq.a(2.0F, 3.0F, 0.0F));
      gey $$10 = $$2.a("right_leg", get.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), geq.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", get.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), geq.a(-2.0F, 3.0F, 0.0F));
      return geu.a($$0, 48, 48);
   }

   public void a(gyf $$0) {
      super.a($$0);
      this.a($$0.b, fnc.c, $$0.p);
      this.a($$0.c, fnc.a, $$0.p);
      this.a($$0.d, fnc.d, $$0.p);
      if ($$0.a) {
         this.a(fnc.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fnc.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fnc.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
