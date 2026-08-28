public class gfi extends ggk<hch> {
   private final gjo a;
   private final gjo b;
   private final gjo c;
   private final gjo d;
   private final gjo e;
   private final gjo f;
   private final gjo g;

   public gfi(gjo $$0) {
      super($$0, gqx::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      gjy $$2 = $$1.a("body", gjt.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gjq.a(0.0F, 17.0F, 0.0F));
      gjy $$3 = $$1.a("head", gjt.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gjq.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gjt.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gjq.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gjt.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gjq.a(1.1F, -3.0F, 0.0F));
      gjy $$4 = $$2.a("right_wing", gjt.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gjq.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gjt.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gjq.a(-2.0F, 0.0F, 0.0F));
      gjy $$5 = $$2.a("left_wing", gjt.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gjq.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gjt.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gjq.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gjt.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gjq.a(0.0F, 5.0F, 0.0F));
      return gju.a($$0, 32, 32);
   }

   public void a(hch $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, fqg.b, $$0.u, 1.0F);
      this.a($$0.c, fqg.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
