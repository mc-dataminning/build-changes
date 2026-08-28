import java.util.Set;

public class fzq extends fxa<gvi> {
   public static final gak a = new fwc(Set.of("head"));
   private static final String b = "real_head";
   private static final String c = "upper_body";
   private static final String d = "real_tail";
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;
   private final gab m;
   private final gab n;
   private final gab o;
   private final gab p;
   private static final int q = 8;

   public fzq(gab $$0) {
      this.e = $$0;
      this.f = $$0.b("head");
      this.g = this.f.b("real_head");
      this.i = $$0.b("body");
      this.p = $$0.b("upper_body");
      this.j = $$0.b("right_hind_leg");
      this.k = $$0.b("left_hind_leg");
      this.l = $$0.b("right_front_leg");
      this.m = $$0.b("left_front_leg");
      this.n = $$0.b("tail");
      this.o = this.n.b("real_tail");
   }

   public static gaj a(gaf $$0) {
      gaj $$1 = new gaj();
      gal $$2 = $$1.a();
      float $$3 = 13.5F;
      gal $$4 = $$2.a("head", gag.c(), gad.a(-1.0F, 13.5F, -7.0F));
      $$4.a(
         "real_head",
         gag.c()
            .a(0, 0)
            .a(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, $$0)
            .a(16, 14)
            .a(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(16, 14)
            .a(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(0, 10)
            .a(-0.5F, -0.001F, -5.0F, 3.0F, 3.0F, 4.0F, $$0),
         gad.a
      );
      $$2.a("body", gag.c().a(18, 14).a(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, $$0), gad.a(0.0F, 14.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("upper_body", gag.c().a(21, 0).a(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, $$0), gad.a(-1.0F, 14.0F, -3.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gag $$5 = gag.c().a(0, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0);
      $$2.a("right_hind_leg", $$5, gad.a(-2.5F, 16.0F, 7.0F));
      $$2.a("left_hind_leg", $$5, gad.a(0.5F, 16.0F, 7.0F));
      $$2.a("right_front_leg", $$5, gad.a(-2.5F, 16.0F, -4.0F));
      $$2.a("left_front_leg", $$5, gad.a(0.5F, 16.0F, -4.0F));
      gal $$6 = $$2.a("tail", gag.c(), gad.a(-1.0F, 12.0F, 8.0F, (float) (Math.PI / 5), 0.0F, 0.0F));
      $$6.a("real_tail", gag.c().a(9, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0), gad.a);
      return $$1;
   }

   public void a(gvi $$0) {
      this.i.c();
      this.p.c();
      this.n.c();
      this.j.c();
      this.k.c();
      this.l.c();
      this.m.c();
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      if ($$0.a) {
         this.n.f = 0.0F;
      } else {
         this.n.f = azc.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      if ($$0.b) {
         float $$3 = $$0.ab;
         this.p.c += 2.0F * $$3;
         this.p.e = (float) (Math.PI * 2.0 / 5.0);
         this.p.f = 0.0F;
         this.i.c += 4.0F * $$3;
         this.i.d -= 2.0F * $$3;
         this.i.e = (float) (Math.PI / 4);
         this.n.c += 9.0F * $$3;
         this.n.d -= 2.0F * $$3;
         this.j.c += 6.7F * $$3;
         this.j.d -= 5.0F * $$3;
         this.j.e = (float) (Math.PI * 3.0 / 2.0);
         this.k.c += 6.7F * $$3;
         this.k.d -= 5.0F * $$3;
         this.k.e = (float) (Math.PI * 3.0 / 2.0);
         this.l.e = 5.811947F;
         this.l.b += 0.01F * $$3;
         this.l.c += 1.0F * $$3;
         this.m.e = 5.811947F;
         this.m.b -= 0.01F * $$3;
         this.m.c += 1.0F * $$3;
      } else {
         this.j.e = azc.b($$1 * 0.6662F) * 1.4F * $$2;
         this.k.e = azc.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.l.e = azc.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.m.e = azc.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      this.g.g = $$0.d + $$0.a(0.0F);
      this.p.g = $$0.a(-0.08F);
      this.i.g = $$0.a(-0.16F);
      this.o.g = $$0.a(-0.2F);
      this.f.e = $$0.V * (float) (Math.PI / 180.0);
      this.f.f = $$0.U * (float) (Math.PI / 180.0);
      this.n.e = $$0.c;
   }

   @Override
   public gab a() {
      return this.e;
   }
}
