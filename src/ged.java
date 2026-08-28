public class ged extends gfd<hay> {
   private final gig a;
   private final gig b;
   private final gig c;
   private final gig d;
   private final gig e;
   private final gig f;
   private final gig g;

   public ged(gig $$0) {
      super($$0, gpn::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      giq $$2 = $$1.a("body", gil.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gii.a(0.0F, 17.0F, 0.0F));
      giq $$3 = $$1.a("head", gil.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gii.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gil.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gii.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gil.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gii.a(1.1F, -3.0F, 0.0F));
      giq $$4 = $$2.a("right_wing", gil.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gii.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gil.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gii.a(-2.0F, 0.0F, 0.0F));
      giq $$5 = $$2.a("left_wing", gil.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gii.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gil.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gii.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gil.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gii.a(0.0F, 5.0F, 0.0F));
      return gim.a($$0, 32, 32);
   }

   public void a(hay $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, foy.b, $$0.u, 1.0F);
      this.a($$0.c, foy.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
