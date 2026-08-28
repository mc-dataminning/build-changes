public class gbp extends gbl<gye> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gen d = this.v.b("body");
   private final gen e = this.d.b("head");
   private final gen f = this.e.b("eyes");
   private final gen g = this.d.b("tongue");
   private final gen i = this.d.b("left_arm");
   private final gen j = this.d.b("right_arm");
   private final gen k = this.v.b("left_leg");
   private final gen l = this.v.b("right_leg");
   private final gen m = this.d.b("croaking_body");

   public gbp(gen $$0) {
      super($$0.b("root"));
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      gex $$2 = $$1.a("root", ges.c(), gep.a(0.0F, 24.0F, 0.0F));
      gex $$3 = $$2.a(
         "body", ges.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gep.a(0.0F, -2.0F, 4.0F)
      );
      gex $$4 = $$3.a(
         "head", ges.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gep.a(0.0F, -2.0F, -1.0F)
      );
      gex $$5 = $$4.a("eyes", ges.c(), gep.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", ges.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gep.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", ges.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gep.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", ges.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new ger(-0.1F)), gep.a(0.0F, -1.0F, -5.0F));
      gex $$6 = $$3.a("tongue", ges.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gep.a(0.0F, -1.01F, 1.0F));
      gex $$7 = $$3.a("left_arm", ges.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gep.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", ges.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gep.a(0.0F, 3.0F, -1.0F));
      gex $$8 = $$3.a("right_arm", ges.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gep.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", ges.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gep.a(0.0F, 3.0F, 0.0F));
      gex $$9 = $$2.a("left_leg", ges.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gep.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", ges.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gep.a(2.0F, 3.0F, 0.0F));
      gex $$10 = $$2.a("right_leg", ges.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gep.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", ges.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gep.a(-2.0F, 3.0F, 0.0F));
      return get.a($$0, 48, 48);
   }

   public void a(gye $$0) {
      super.a($$0);
      this.a($$0.b, fnb.c, $$0.p);
      this.a($$0.c, fnb.a, $$0.p);
      this.a($$0.d, fnb.d, $$0.p);
      if ($$0.a) {
         this.a(fnb.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fnb.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fnb.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
