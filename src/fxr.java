public class fxr extends fxz<gtv> {
   private final gbb a;
   private final gbb b;
   private final gbb c;
   private final gbb d;
   private final gbb e;
   private static final int f = 6;

   public fxr(gbb $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.c = $$0.b("right_hind_leg");
      this.b = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.d = $$0.b("left_front_leg");
   }

   public static gbh a(gbf $$0) {
      gbj $$1 = new gbj();
      gbl $$2 = $$1.a();
      $$2.a("head", gbg.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gbd.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", gbg.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gbd.a(0.0F, 6.0F, 0.0F));
      gbg $$3 = gbg.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, gbd.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, gbd.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, gbd.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, gbd.a(2.0F, 18.0F, -4.0F));
      return gbh.a($$1, 64, 32);
   }

   public void a(gtv $$0) {
      super.a($$0);
      this.a.f = $$0.U * (float) (Math.PI / 180.0);
      this.a.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.b.e = azj.b($$2 * 0.6662F) * 1.4F * $$1;
      this.c.e = azj.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.d.e = azj.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = azj.b($$2 * 0.6662F) * 1.4F * $$1;
   }
}
