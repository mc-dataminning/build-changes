import java.util.Set;

public class fxk extends fxa<gti> {
   public static final gak a = new fwc(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F, Set.of("head"));
   private static final float b = 0.87266463F;
   private static final float c = (float) (-Math.PI / 9);
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;
   private final gab m;
   private final gab n;

   public fxk(gab $$0) {
      this.d = $$0;
      this.i = $$0.b("body");
      this.n = this.i.b("mane");
      this.e = $$0.b("head");
      this.f = this.e.b("right_ear");
      this.g = this.e.b("left_ear");
      this.j = $$0.b("right_front_leg");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_hind_leg");
      this.m = $$0.b("left_hind_leg");
   }

   private static gaj d() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("body", gag.c().a(1, 1).a(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F), gad.a(0.0F, 7.0F, 0.0F));
      $$2.a("mane", gag.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new gaf(0.001F)), gad.a(0.0F, -14.0F, -7.0F));
      gal $$3 = $$1.a("head", gag.c().a(61, 1).a(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F), gad.a(0.0F, 2.0F, -12.0F, 0.87266463F, 0.0F, 0.0F));
      $$3.a("right_ear", gag.c().a(1, 1).a(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), gad.a(-6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (-Math.PI * 2.0 / 9.0)));
      $$3.a("left_ear", gag.c().a(1, 6).a(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), gad.a(6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (Math.PI * 2.0 / 9.0)));
      $$3.a("right_horn", gag.c().a(10, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), gad.a(-7.0F, 2.0F, -12.0F));
      $$3.a("left_horn", gag.c().a(1, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), gad.a(7.0F, 2.0F, -12.0F));
      int $$4 = 14;
      int $$5 = 11;
      $$1.a("right_front_leg", gag.c().a(66, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), gad.a(-4.0F, 10.0F, -8.5F));
      $$1.a("left_front_leg", gag.c().a(41, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), gad.a(4.0F, 10.0F, -8.5F));
      $$1.a("right_hind_leg", gag.c().a(21, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), gad.a(-5.0F, 13.0F, 10.0F));
      $$1.a("left_hind_leg", gag.c().a(0, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), gad.a(5.0F, 13.0F, 10.0F));
      return $$0;
   }

   public static gah b() {
      gaj $$0 = d();
      return gah.a($$0, 128, 64);
   }

   public static gah c() {
      gaj $$0 = d();
      gal $$1 = $$0.a().b("body");
      $$1.a("mane", gag.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new gaf(0.001F)), gad.a(0.0F, -14.0F, -3.0F));
      return gah.a($$0, 128, 64).a(a);
   }

   @Override
   public gab a() {
      return this.d;
   }

   public void a(gti $$0) {
      this.e.c();
      this.n.c();
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.f.g = (float) (-Math.PI * 2.0 / 9.0) - $$1 * azc.a($$2);
      this.g.g = (float) (Math.PI * 2.0 / 9.0) + $$1 * azc.a($$2);
      this.e.f = $$0.U * (float) (Math.PI / 180.0);
      float $$3 = 1.0F - (float)azc.a(10 - 2 * $$0.a) / 10.0F;
      this.e.e = azc.h($$3, 0.87266463F, (float) (-Math.PI / 9));
      if ($$0.ae) {
         this.e.c += $$3 * 2.5F;
      }

      float $$4 = 1.2F;
      this.j.e = azc.b($$2) * 1.2F * $$1;
      this.k.e = azc.b($$2 + (float) Math.PI) * 1.2F * $$1;
      this.l.e = this.k.e;
      this.m.e = this.j.e;
   }
}
