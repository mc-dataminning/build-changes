public class fxe extends fwb<gth> {
   private final gal e = this.c.b("left_chest");
   private final gal f = this.c.b("right_chest");

   public fxe(gal $$0) {
      super($$0);
   }

   public static gar b() {
      gat $$0 = fwb.a(gap.a);
      a($$0.a());
      return gar.a($$0, 64, 64);
   }

   public static gar c() {
      gat $$0 = fwb.c(gap.a);
      a($$0.a());
      return gar.a(fwb.b.apply($$0), 64, 64);
   }

   private static void a(gav $$0) {
      gav $$1 = $$0.b("body");
      gaq $$2 = gaq.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gan.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gan.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gav $$3 = $$0.b("head_parts").b("head");
      gaq $$4 = gaq.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gan.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gan.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gth $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
