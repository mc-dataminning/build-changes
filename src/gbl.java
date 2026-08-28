public class gbl extends gbh<gya> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gej d = this.v.b("body");
   private final gej e = this.d.b("head");
   private final gej f = this.e.b("eyes");
   private final gej g = this.d.b("tongue");
   private final gej i = this.d.b("left_arm");
   private final gej j = this.d.b("right_arm");
   private final gej k = this.v.b("left_leg");
   private final gej l = this.v.b("right_leg");
   private final gej m = this.d.b("croaking_body");

   public gbl(gej $$0) {
      super($$0.b("root"));
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      get $$2 = $$1.a("root", geo.c(), gel.a(0.0F, 24.0F, 0.0F));
      get $$3 = $$2.a(
         "body", geo.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gel.a(0.0F, -2.0F, 4.0F)
      );
      get $$4 = $$3.a(
         "head", geo.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gel.a(0.0F, -2.0F, -1.0F)
      );
      get $$5 = $$4.a("eyes", geo.c(), gel.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", geo.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gel.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", geo.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gel.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", geo.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gen(-0.1F)), gel.a(0.0F, -1.0F, -5.0F));
      get $$6 = $$3.a("tongue", geo.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gel.a(0.0F, -1.01F, 1.0F));
      get $$7 = $$3.a("left_arm", geo.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gel.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", geo.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gel.a(0.0F, 3.0F, -1.0F));
      get $$8 = $$3.a("right_arm", geo.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gel.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", geo.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gel.a(0.0F, 3.0F, 0.0F));
      get $$9 = $$2.a("left_leg", geo.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gel.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", geo.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gel.a(2.0F, 3.0F, 0.0F));
      get $$10 = $$2.a("right_leg", geo.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gel.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", geo.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gel.a(-2.0F, 3.0F, 0.0F));
      return gep.a($$0, 48, 48);
   }

   public void a(gya $$0) {
      super.a($$0);
      this.a($$0.b, fmv.c, $$0.p);
      this.a($$0.c, fmv.a, $$0.p);
      this.a($$0.d, fmv.d, $$0.p);
      if ($$0.a) {
         this.a(fmv.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fmv.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fmv.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
