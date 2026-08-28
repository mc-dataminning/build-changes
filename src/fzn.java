public class fzn extends fzj<gvy> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gcl d = this.v.b("body");
   private final gcl e = this.d.b("head");
   private final gcl f = this.e.b("eyes");
   private final gcl g = this.d.b("tongue");
   private final gcl i = this.d.b("left_arm");
   private final gcl j = this.d.b("right_arm");
   private final gcl k = this.v.b("left_leg");
   private final gcl l = this.v.b("right_leg");
   private final gcl m = this.d.b("croaking_body");

   public fzn(gcl $$0) {
      super($$0.b("root"));
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      gcv $$2 = $$1.a("root", gcq.c(), gcn.a(0.0F, 24.0F, 0.0F));
      gcv $$3 = $$2.a(
         "body", gcq.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gcn.a(0.0F, -2.0F, 4.0F)
      );
      gcv $$4 = $$3.a(
         "head", gcq.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gcn.a(0.0F, -2.0F, -1.0F)
      );
      gcv $$5 = $$4.a("eyes", gcq.c(), gcn.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gcq.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gcn.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gcq.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gcn.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gcq.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gcp(-0.1F)), gcn.a(0.0F, -1.0F, -5.0F));
      gcv $$6 = $$3.a("tongue", gcq.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gcn.a(0.0F, -1.01F, 1.0F));
      gcv $$7 = $$3.a("left_arm", gcq.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gcn.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gcq.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gcn.a(0.0F, 3.0F, -1.0F));
      gcv $$8 = $$3.a("right_arm", gcq.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gcn.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gcq.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gcn.a(0.0F, 3.0F, 0.0F));
      gcv $$9 = $$2.a("left_leg", gcq.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gcn.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gcq.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gcn.a(2.0F, 3.0F, 0.0F));
      gcv $$10 = $$2.a("right_leg", gcq.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gcn.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gcq.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gcn.a(-2.0F, 3.0F, 0.0F));
      return gcr.a($$0, 48, 48);
   }

   public void a(gvy $$0) {
      super.a($$0);
      this.a($$0.b, fla.c, $$0.p);
      this.a($$0.c, fla.a, $$0.p);
      this.a($$0.d, fla.d, $$0.p);
      if ($$0.a) {
         this.a(fla.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fla.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fla.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
