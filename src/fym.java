public class fym extends fzj<guy> {
   private final gcl a;
   private final gcl b;
   private final gcl c;
   private final gcl d;
   private final gcl e;
   private final gcl f;
   private final gcl g;

   public fym(gcl $$0) {
      super($$0, gjq::e);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      gcv $$2 = $$1.a("body", gcq.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gcn.a(0.0F, 17.0F, 0.0F));
      gcv $$3 = $$1.a("head", gcq.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gcn.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gcq.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gcn.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gcq.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gcn.a(1.1F, -3.0F, 0.0F));
      gcv $$4 = $$2.a("right_wing", gcq.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gcn.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gcq.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gcn.a(-2.0F, 0.0F, 0.0F));
      gcv $$5 = $$2.a("left_wing", gcq.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gcn.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gcq.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gcn.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gcq.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gcn.a(0.0F, 5.0F, 0.0F));
      return gcr.a($$0, 32, 32);
   }

   public void a(guy $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fkx.b, $$0.p, 1.0F);
      this.a($$0.c, fkx.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
