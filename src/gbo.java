public class gbo extends gbk<gyd> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gem d = this.v.b("body");
   private final gem e = this.d.b("head");
   private final gem f = this.e.b("eyes");
   private final gem g = this.d.b("tongue");
   private final gem i = this.d.b("left_arm");
   private final gem j = this.d.b("right_arm");
   private final gem k = this.v.b("left_leg");
   private final gem l = this.v.b("right_leg");
   private final gem m = this.d.b("croaking_body");

   public gbo(gem $$0) {
      super($$0.b("root"));
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("root", ger.c(), geo.a(0.0F, 24.0F, 0.0F));
      gew $$3 = $$2.a(
         "body", ger.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), geo.a(0.0F, -2.0F, 4.0F)
      );
      gew $$4 = $$3.a(
         "head", ger.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), geo.a(0.0F, -2.0F, -1.0F)
      );
      gew $$5 = $$4.a("eyes", ger.c(), geo.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", ger.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), geo.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", ger.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), geo.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", ger.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new geq(-0.1F)), geo.a(0.0F, -1.0F, -5.0F));
      gew $$6 = $$3.a("tongue", ger.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), geo.a(0.0F, -1.01F, 1.0F));
      gew $$7 = $$3.a("left_arm", ger.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), geo.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", ger.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), geo.a(0.0F, 3.0F, -1.0F));
      gew $$8 = $$3.a("right_arm", ger.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), geo.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", ger.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), geo.a(0.0F, 3.0F, 0.0F));
      gew $$9 = $$2.a("left_leg", ger.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), geo.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", ger.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), geo.a(2.0F, 3.0F, 0.0F));
      gew $$10 = $$2.a("right_leg", ger.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), geo.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", ger.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), geo.a(-2.0F, 3.0F, 0.0F));
      return ges.a($$0, 48, 48);
   }

   public void a(gyd $$0) {
      super.a($$0);
      this.a($$0.b, fna.c, $$0.p);
      this.a($$0.c, fna.a, $$0.p);
      this.a($$0.d, fna.d, $$0.p);
      if ($$0.a) {
         this.a(fna.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fna.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fna.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
