public class fxo extends fxk<gtv> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal i;
   private final gal j;
   private final gal k;
   private final gal l;
   private final gal m;
   private final gal n;

   public fxo(gal $$0) {
      this.d = $$0.b("root");
      this.e = this.d.b("body");
      this.f = this.e.b("head");
      this.g = this.f.b("eyes");
      this.i = this.e.b("tongue");
      this.j = this.e.b("left_arm");
      this.k = this.e.b("right_arm");
      this.l = this.d.b("left_leg");
      this.m = this.d.b("right_leg");
      this.n = this.e.b("croaking_body");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("root", gaq.c(), gan.a(0.0F, 24.0F, 0.0F));
      gav $$3 = $$2.a(
         "body", gaq.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gan.a(0.0F, -2.0F, 4.0F)
      );
      gav $$4 = $$3.a(
         "head", gaq.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gan.a(0.0F, -2.0F, -1.0F)
      );
      gav $$5 = $$4.a("eyes", gaq.c(), gan.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gaq.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gan.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gaq.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gan.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gaq.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gap(-0.1F)), gan.a(0.0F, -1.0F, -5.0F));
      gav $$6 = $$3.a("tongue", gaq.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gan.a(0.0F, -1.01F, 1.0F));
      gav $$7 = $$3.a("left_arm", gaq.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gan.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gaq.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gan.a(0.0F, 3.0F, -1.0F));
      gav $$8 = $$3.a("right_arm", gaq.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gan.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gaq.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gan.a(0.0F, 3.0F, 0.0F));
      gav $$9 = $$2.a("left_leg", gaq.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gan.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gaq.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gan.a(2.0F, 3.0F, 0.0F));
      gav $$10 = $$2.a("right_leg", gaq.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gan.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gaq.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gan.a(-2.0F, 3.0F, 0.0F));
      return gar.a($$0, 48, 48);
   }

   public void a(gtv $$0) {
      this.a().e().forEach(gal::c);
      this.a($$0.b, fjh.c, $$0.p);
      this.a($$0.c, fjh.a, $$0.p);
      this.a($$0.d, fjh.d, $$0.p);
      if ($$0.a) {
         this.a(fjh.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fjh.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fjh.f, $$0.p);
      this.n.k = $$0.c.b();
   }

   @Override
   public gal a() {
      return this.d;
   }
}
