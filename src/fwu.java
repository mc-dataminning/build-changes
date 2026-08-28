public class fwu extends fvr<gsq> {
   private final gab e = this.c.b("left_chest");
   private final gab f = this.c.b("right_chest");

   public fwu(gab $$0) {
      super($$0);
   }

   public static gah b() {
      gaj $$0 = fvr.a(gaf.a);
      a($$0.a());
      return gah.a($$0, 64, 64);
   }

   public static gah c() {
      gaj $$0 = fvr.c(gaf.a);
      a($$0.a());
      return gah.a(fvr.b.apply($$0), 64, 64);
   }

   private static void a(gal $$0) {
      gal $$1 = $$0.b("body");
      gag $$2 = gag.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gad.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gad.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gal $$3 = $$0.b("head_parts").b("head");
      gag $$4 = gag.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gad.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gad.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gsq $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
