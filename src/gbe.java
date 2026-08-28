public class gbe extends gaa<gxp> {
   private final gem e = this.c.b("left_chest");
   private final gem f = this.c.b("right_chest");

   public gbe(gem $$0) {
      super($$0);
   }

   public static ges a() {
      geu $$0 = gaa.a(geq.a);
      a($$0.a());
      return ges.a($$0, 64, 64);
   }

   public static ges b() {
      geu $$0 = gaa.c(geq.a);
      a($$0.a());
      return ges.a(gaa.b.apply($$0), 64, 64);
   }

   private static void a(gew $$0) {
      gew $$1 = $$0.b("body");
      ger $$2 = ger.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, geo.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, geo.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gew $$3 = $$0.b("head_parts").b("head");
      ger $$4 = ger.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, geo.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, geo.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gxp $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
