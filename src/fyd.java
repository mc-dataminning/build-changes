public class fyd extends fza<gun> {
   private final gcc a;
   private final gcc b;
   private final gcc c;
   private final gcc d;
   private final gcc e;
   private final gcc f;
   private final gcc g;

   public fyd(gcc $$0) {
      super($$0, gjh::e);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      gcm $$2 = $$1.a("body", gch.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gce.a(0.0F, 17.0F, 0.0F));
      gcm $$3 = $$1.a("head", gch.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gce.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gch.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gce.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gch.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gce.a(1.1F, -3.0F, 0.0F));
      gcm $$4 = $$2.a("right_wing", gch.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gce.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gch.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gce.a(-2.0F, 0.0F, 0.0F));
      gcm $$5 = $$2.a("left_wing", gch.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gce.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gch.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gce.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gch.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gce.a(0.0F, 5.0F, 0.0F));
      return gci.a($$0, 32, 32);
   }

   public void a(gun $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fkq.b, $$0.p, 1.0F);
      this.a($$0.c, fkq.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
