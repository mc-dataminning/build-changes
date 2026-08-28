public class fwg extends fxk<gsr> {
   public static final gau a = gau.scaling(0.6F);
   private static final float b = 25.0F;
   private static final float c = 22.5F;
   private static final float d = 16.5F;
   private static final float e = 2.5F;
   private static final String f = "head_cube";
   private static final String g = "right_ear_cube";
   private static final String i = "left_ear_cube";
   private final gal j;
   private final gal k;
   private final gal l;
   private final gal m;
   private final gal n;
   private final gal o;
   private final gal p;

   public fwg(gal $$0) {
      this.j = $$0;
      this.k = $$0.b("body");
      this.l = $$0.b("right_hind_leg");
      this.m = $$0.b("left_hind_leg");
      this.o = this.k.b("head");
      this.p = this.k.b("tail");
      this.n = $$0.b("cube");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a(
         "body",
         gaq.c().a(0, 20).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new gap(0.3F)).a(0, 40).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new gap(0.0F)),
         gan.a(0.0F, 21.0F, 4.0F)
      );
      $$2.a("tail", gaq.c().a(44, 53).a(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new gap(0.0F)), gan.a(0.0F, -3.0F, 1.0F, 0.5061F, 0.0F, 0.0F));
      gav $$3 = $$2.a("head", gaq.c(), gan.a(0.0F, -2.0F, -11.0F));
      $$3.a("head_cube", gaq.c().a(43, 15).a(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gap(0.0F)), gan.a(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
      gav $$4 = $$3.a("right_ear", gaq.c(), gan.a(-1.0F, -1.0F, 0.0F));
      $$4.a("right_ear_cube", gaq.c().a(43, 10).a(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new gap(0.0F)), gan.a(-0.5F, 0.0F, -0.6F, 0.1886F, -0.3864F, -0.0718F));
      gav $$5 = $$3.a("left_ear", gaq.c(), gan.a(1.0F, -2.0F, 0.0F));
      $$5.a("left_ear_cube", gaq.c().a(47, 10).a(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new gap(0.0F)), gan.a(0.5F, 1.0F, -0.6F, 0.1886F, 0.3864F, 0.0718F));
      $$1.a("right_hind_leg", gaq.c().a(51, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gap(0.0F)), gan.a(-2.0F, 21.0F, 4.0F));
      $$1.a("left_hind_leg", gaq.c().a(42, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gap(0.0F)), gan.a(2.0F, 21.0F, 4.0F));
      $$1.a("right_front_leg", gaq.c().a(51, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gap(0.0F)), gan.a(-2.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", gaq.c().a(42, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gap(0.0F)), gan.a(2.0F, 21.0F, -4.0F));
      $$1.a("cube", gaq.c().a(0, 0).a(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new gap(0.0F)), gan.a(0.0F, 24.0F, 0.0F));
      return gar.a($$0, 64, 64);
   }

   @Override
   public gal a() {
      return this.j;
   }

   public void a(gsr $$0) {
      this.a().e().forEach(gal::c);
      if ($$0.a) {
         this.k.l = true;
         this.m.k = false;
         this.l.k = false;
         this.p.k = false;
         this.n.k = true;
      } else {
         this.k.l = false;
         this.m.k = true;
         this.l.k = true;
         this.p.k = true;
         this.n.k = false;
         this.o.e = azd.a($$0.V, -22.5F, 25.0F) * (float) (Math.PI / 180.0);
         this.o.f = azd.a($$0.U, -32.5F, 32.5F) * (float) (Math.PI / 180.0);
      }

      this.a(fjd.b, $$0.X, $$0.Y, 16.5F, 2.5F);
      this.a($$0.b, fjd.d, $$0.p, 1.0F);
      this.a($$0.c, fjd.a, $$0.p, 1.0F);
      this.a($$0.d, fjd.c, $$0.p, 1.0F);
   }
}
