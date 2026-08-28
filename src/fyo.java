public class fyo extends fyk<gux> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gbm d = this.v.b("body");
   private final gbm e = this.d.b("head");
   private final gbm f = this.e.b("eyes");
   private final gbm g = this.d.b("tongue");
   private final gbm i = this.d.b("left_arm");
   private final gbm j = this.d.b("right_arm");
   private final gbm k = this.v.b("left_leg");
   private final gbm l = this.v.b("right_leg");
   private final gbm m = this.d.b("croaking_body");

   public fyo(gbm $$0) {
      super($$0.b("root"));
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      gbw $$2 = $$1.a("root", gbr.c(), gbo.a(0.0F, 24.0F, 0.0F));
      gbw $$3 = $$2.a(
         "body", gbr.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gbo.a(0.0F, -2.0F, 4.0F)
      );
      gbw $$4 = $$3.a(
         "head", gbr.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gbo.a(0.0F, -2.0F, -1.0F)
      );
      gbw $$5 = $$4.a("eyes", gbr.c(), gbo.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gbr.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gbo.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gbr.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gbo.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gbr.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gbq(-0.1F)), gbo.a(0.0F, -1.0F, -5.0F));
      gbw $$6 = $$3.a("tongue", gbr.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gbo.a(0.0F, -1.01F, 1.0F));
      gbw $$7 = $$3.a("left_arm", gbr.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gbo.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gbr.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gbo.a(0.0F, 3.0F, -1.0F));
      gbw $$8 = $$3.a("right_arm", gbr.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gbo.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gbr.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gbo.a(0.0F, 3.0F, 0.0F));
      gbw $$9 = $$2.a("left_leg", gbr.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gbo.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gbr.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gbo.a(2.0F, 3.0F, 0.0F));
      gbw $$10 = $$2.a("right_leg", gbr.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gbo.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gbr.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gbo.a(-2.0F, 3.0F, 0.0F));
      return gbs.a($$0, 48, 48);
   }

   public void a(gux $$0) {
      super.a($$0);
      this.a($$0.b, fke.c, $$0.p);
      this.a($$0.c, fke.a, $$0.p);
      this.a($$0.d, fke.d, $$0.p);
      if ($$0.a) {
         this.a(fke.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fke.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fke.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
