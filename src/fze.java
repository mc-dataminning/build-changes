public class fze extends fza<gvn> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gcc d = this.v.b("body");
   private final gcc e = this.d.b("head");
   private final gcc f = this.e.b("eyes");
   private final gcc g = this.d.b("tongue");
   private final gcc i = this.d.b("left_arm");
   private final gcc j = this.d.b("right_arm");
   private final gcc k = this.v.b("left_leg");
   private final gcc l = this.v.b("right_leg");
   private final gcc m = this.d.b("croaking_body");

   public fze(gcc $$0) {
      super($$0.b("root"));
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      gcm $$2 = $$1.a("root", gch.c(), gce.a(0.0F, 24.0F, 0.0F));
      gcm $$3 = $$2.a(
         "body", gch.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gce.a(0.0F, -2.0F, 4.0F)
      );
      gcm $$4 = $$3.a(
         "head", gch.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gce.a(0.0F, -2.0F, -1.0F)
      );
      gcm $$5 = $$4.a("eyes", gch.c(), gce.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gch.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gce.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gch.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gce.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gch.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gcg(-0.1F)), gce.a(0.0F, -1.0F, -5.0F));
      gcm $$6 = $$3.a("tongue", gch.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gce.a(0.0F, -1.01F, 1.0F));
      gcm $$7 = $$3.a("left_arm", gch.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gce.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gch.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gce.a(0.0F, 3.0F, -1.0F));
      gcm $$8 = $$3.a("right_arm", gch.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gce.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gch.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gce.a(0.0F, 3.0F, 0.0F));
      gcm $$9 = $$2.a("left_leg", gch.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gce.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gch.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gce.a(2.0F, 3.0F, 0.0F));
      gcm $$10 = $$2.a("right_leg", gch.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gce.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gch.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gce.a(-2.0F, 3.0F, 0.0F));
      return gci.a($$0, 48, 48);
   }

   public void a(gvn $$0) {
      super.a($$0);
      this.a($$0.b, fkt.c, $$0.p);
      this.a($$0.c, fkt.a, $$0.p);
      this.a($$0.d, fkt.d, $$0.p);
      if ($$0.a) {
         this.a(fkt.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fkt.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fkt.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
