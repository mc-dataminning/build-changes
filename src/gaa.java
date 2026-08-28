import java.util.Set;

public class gaa extends fxk<gvz> {
   public static final gau a = new fwm(Set.of("head"));
   private static final String b = "real_head";
   private static final String c = "upper_body";
   private static final String d = "real_tail";
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal i;
   private final gal j;
   private final gal k;
   private final gal l;
   private final gal m;
   private final gal n;
   private final gal o;
   private final gal p;
   private static final int q = 8;

   public gaa(gal $$0) {
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

   public static gat a(gap $$0) {
      gat $$1 = new gat();
      gav $$2 = $$1.a();
      float $$3 = 13.5F;
      gav $$4 = $$2.a("head", gaq.c(), gan.a(-1.0F, 13.5F, -7.0F));
      $$4.a(
         "real_head",
         gaq.c()
            .a(0, 0)
            .a(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, $$0)
            .a(16, 14)
            .a(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(16, 14)
            .a(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(0, 10)
            .a(-0.5F, -0.001F, -5.0F, 3.0F, 3.0F, 4.0F, $$0),
         gan.a
      );
      $$2.a("body", gaq.c().a(18, 14).a(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, $$0), gan.a(0.0F, 14.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("upper_body", gaq.c().a(21, 0).a(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, $$0), gan.a(-1.0F, 14.0F, -3.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gaq $$5 = gaq.c().a(0, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0);
      $$2.a("right_hind_leg", $$5, gan.a(-2.5F, 16.0F, 7.0F));
      $$2.a("left_hind_leg", $$5, gan.a(0.5F, 16.0F, 7.0F));
      $$2.a("right_front_leg", $$5, gan.a(-2.5F, 16.0F, -4.0F));
      $$2.a("left_front_leg", $$5, gan.a(0.5F, 16.0F, -4.0F));
      gav $$6 = $$2.a("tail", gaq.c(), gan.a(-1.0F, 12.0F, 8.0F, (float) (Math.PI / 5), 0.0F, 0.0F));
      $$6.a("real_tail", gaq.c().a(9, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0), gan.a);
      return $$1;
   }

   public void a(gvz $$0) {
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
         this.n.f = azd.b($$1 * 0.6662F) * 1.4F * $$2;
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
         this.j.e = azd.b($$1 * 0.6662F) * 1.4F * $$2;
         this.k.e = azd.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.l.e = azd.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.m.e = azd.b($$1 * 0.6662F) * 1.4F * $$2;
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
   public gal a() {
      return this.e;
   }
}
