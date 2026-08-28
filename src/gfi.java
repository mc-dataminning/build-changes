public class gfi extends gfd<hbz> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gig d = this.v.b("body");
   private final gig e = this.d.b("head");
   private final gig f = this.e.b("eyes");
   private final gig g = this.d.b("tongue");
   private final gig i = this.d.b("left_arm");
   private final gig j = this.d.b("right_arm");
   private final gig k = this.v.b("left_leg");
   private final gig l = this.v.b("right_leg");
   private final gig m = this.d.b("croaking_body");

   public gfi(gig $$0) {
      super($$0.b("root"));
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      giq $$2 = $$1.a("root", gil.c(), gii.a(0.0F, 24.0F, 0.0F));
      giq $$3 = $$2.a(
         "body", gil.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gii.a(0.0F, -2.0F, 4.0F)
      );
      giq $$4 = $$3.a(
         "head", gil.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gii.a(0.0F, -2.0F, -1.0F)
      );
      giq $$5 = $$4.a("eyes", gil.c(), gii.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gil.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gii.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gil.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gii.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gil.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gik(-0.1F)), gii.a(0.0F, -1.0F, -5.0F));
      giq $$6 = $$3.a("tongue", gil.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gii.a(0.0F, -1.01F, 1.0F));
      giq $$7 = $$3.a("left_arm", gil.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gii.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gil.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gii.a(0.0F, 3.0F, -1.0F));
      giq $$8 = $$3.a("right_arm", gil.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gii.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gil.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gii.a(0.0F, 3.0F, 0.0F));
      giq $$9 = $$2.a("left_leg", gil.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gii.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gil.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gii.a(2.0F, 3.0F, 0.0F));
      giq $$10 = $$2.a("right_leg", gil.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gii.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gil.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gii.a(-2.0F, 3.0F, 0.0F));
      return gim.a($$0, 48, 48);
   }

   public void a(hbz $$0) {
      super.a($$0);
      this.a($$0.b, fpc.c, $$0.u);
      this.a($$0.c, fpc.a, $$0.u);
      this.a($$0.d, fpc.d, $$0.u);
      if ($$0.a) {
         this.a(fpc.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fpc.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fpc.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
