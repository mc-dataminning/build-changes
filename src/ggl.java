public class ggl extends ghn<hdk> {
   private final gkr a;
   private final gkr b;
   private final gkr c;
   private final gkr d;
   private final gkr e;
   private final gkr f;
   private final gkr g;

   public ggl(gkr $$0) {
      super($$0, gry::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("body", gkw.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gkt.a(0.0F, 17.0F, 0.0F));
      glb $$3 = $$1.a("head", gkw.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gkt.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gkw.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gkt.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gkw.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gkt.a(1.1F, -3.0F, 0.0F));
      glb $$4 = $$2.a("right_wing", gkw.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gkt.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gkw.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gkt.a(-2.0F, 0.0F, 0.0F));
      glb $$5 = $$2.a("left_wing", gkw.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gkt.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gkw.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gkt.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gkw.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gkt.a(0.0F, 5.0F, 0.0F));
      return gkx.a($$0, 32, 32);
   }

   public void a(hdk $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.ad);
      }

      this.a($$0.b, fri.b, $$0.v, 1.0F);
      this.a($$0.c, fri.a, $$0.v, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
