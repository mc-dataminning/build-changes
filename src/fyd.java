public class fyd extends fxz<gum> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gbb d = this.v.b("body");
   private final gbb e = this.d.b("head");
   private final gbb f = this.e.b("eyes");
   private final gbb g = this.d.b("tongue");
   private final gbb i = this.d.b("left_arm");
   private final gbb j = this.d.b("right_arm");
   private final gbb k = this.v.b("left_leg");
   private final gbb l = this.v.b("right_leg");
   private final gbb m = this.d.b("croaking_body");

   public fyd(gbb $$0) {
      super($$0.b("root"));
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      gbl $$2 = $$1.a("root", gbg.c(), gbd.a(0.0F, 24.0F, 0.0F));
      gbl $$3 = $$2.a(
         "body", gbg.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gbd.a(0.0F, -2.0F, 4.0F)
      );
      gbl $$4 = $$3.a(
         "head", gbg.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gbd.a(0.0F, -2.0F, -1.0F)
      );
      gbl $$5 = $$4.a("eyes", gbg.c(), gbd.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gbg.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gbd.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gbg.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gbd.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gbg.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gbf(-0.1F)), gbd.a(0.0F, -1.0F, -5.0F));
      gbl $$6 = $$3.a("tongue", gbg.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gbd.a(0.0F, -1.01F, 1.0F));
      gbl $$7 = $$3.a("left_arm", gbg.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gbd.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gbg.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gbd.a(0.0F, 3.0F, -1.0F));
      gbl $$8 = $$3.a("right_arm", gbg.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gbd.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gbg.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gbd.a(0.0F, 3.0F, 0.0F));
      gbl $$9 = $$2.a("left_leg", gbg.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gbd.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gbg.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gbd.a(2.0F, 3.0F, 0.0F));
      gbl $$10 = $$2.a("right_leg", gbg.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gbd.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gbg.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gbd.a(-2.0F, 3.0F, 0.0F));
      return gbh.a($$0, 48, 48);
   }

   public void a(gum $$0) {
      super.a($$0);
      this.a($$0.b, fjw.c, $$0.p);
      this.a($$0.c, fjw.a, $$0.p);
      this.a($$0.d, fjw.d, $$0.p);
      if ($$0.a) {
         this.a(fjw.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fjw.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fjw.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
