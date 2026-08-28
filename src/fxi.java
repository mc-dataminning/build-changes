public class fxi extends fwf<gtm> {
   private final gaq e = this.c.b("left_chest");
   private final gaq f = this.c.b("right_chest");

   public fxi(gaq $$0) {
      super($$0);
   }

   public static gaw a() {
      gay $$0 = fwf.a(gau.a);
      a($$0.a());
      return gaw.a($$0, 64, 64);
   }

   public static gaw b() {
      gay $$0 = fwf.c(gau.a);
      a($$0.a());
      return gaw.a(fwf.b.apply($$0), 64, 64);
   }

   private static void a(gba $$0) {
      gba $$1 = $$0.b("body");
      gav $$2 = gav.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gas.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gas.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gba $$3 = $$0.b("head_parts").b("head");
      gav $$4 = gav.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gas.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gas.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gtm $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
