public class gan extends gbl<gxd> {
   private final gen a;
   private final gen b;
   private final gen c;
   private final gen d;
   private final gen e;
   private final gen f;
   private final gen g;

   public gan(gen $$0) {
      super($$0, glu::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      gex $$2 = $$1.a("body", ges.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gep.a(0.0F, 17.0F, 0.0F));
      gex $$3 = $$1.a("head", ges.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gep.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", ges.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gep.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", ges.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gep.a(1.1F, -3.0F, 0.0F));
      gex $$4 = $$2.a("right_wing", ges.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gep.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", ges.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gep.a(-2.0F, 0.0F, 0.0F));
      gex $$5 = $$2.a("left_wing", ges.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gep.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", ges.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gep.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", ges.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gep.a(0.0F, 5.0F, 0.0F));
      return get.a($$0, 32, 32);
   }

   public void a(gxd $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fmx.b, $$0.p, 1.0F);
      this.a($$0.c, fmx.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
