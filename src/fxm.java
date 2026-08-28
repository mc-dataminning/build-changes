import java.util.Set;

public class fxm<T extends gtr> extends fxk<T> {
   public static final gau b = new fwm(true, 10.0F, 4.0F, Set.of("head"));
   public static final gau c = gau.scaling(0.8F);
   private static final float a = 0.0F;
   private static final float q = 16.0F;
   private static final float r = -9.0F;
   protected static final float d = 18.0F;
   protected static final float e = 5.0F;
   protected static final float f = 14.1F;
   private static final float s = -5.0F;
   private static final String t = "tail1";
   private static final String u = "tail2";
   protected final gal g;
   protected final gal i;
   protected final gal j;
   protected final gal k;
   protected final gal l;
   protected final gal m;
   protected final gal n;
   protected final gal o;
   protected final gal p;

   public fxm(gal $$0) {
      this.g = $$0;
      this.o = $$0.b("head");
      this.p = $$0.b("body");
      this.m = $$0.b("tail1");
      this.n = $$0.b("tail2");
      this.i = $$0.b("left_hind_leg");
      this.j = $$0.b("right_hind_leg");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_front_leg");
   }

   public static gat a(gap $$0) {
      gat $$1 = new gat();
      gav $$2 = $$1.a();
      gap $$3 = new gap(-0.02F);
      $$2.a(
         "head",
         gaq.c()
            .a("main", -2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, $$0)
            .a("nose", -1.5F, -0.001F, -4.0F, 3, 2, 2, $$0, 0, 24)
            .a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 0, 10)
            .a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, $$0, 6, 10),
         gan.a(0.0F, 15.0F, -9.0F)
      );
      $$2.a("body", gaq.c().a(20, 0).a(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, $$0), gan.a(0.0F, 12.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("tail1", gaq.c().a(0, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$0), gan.a(0.0F, 15.0F, 8.0F, 0.9F, 0.0F, 0.0F));
      $$2.a("tail2", gaq.c().a(4, 15).a(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, $$3), gan.a(0.0F, 20.0F, 14.0F));
      gaq $$4 = gaq.c().a(8, 13).a(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, $$0);
      $$2.a("left_hind_leg", $$4, gan.a(1.1F, 18.0F, 5.0F));
      $$2.a("right_hind_leg", $$4, gan.a(-1.1F, 18.0F, 5.0F));
      gaq $$5 = gaq.c().a(40, 0).a(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, $$0);
      $$2.a("left_front_leg", $$5, gan.a(1.2F, 14.1F, -5.0F));
      $$2.a("right_front_leg", $$5, gan.a(-1.2F, 14.1F, -5.0F));
      return $$1;
   }

   public void a(T $$0) {
      this.p.c();
      this.o.c();
      this.m.c();
      this.n.c();
      this.k.c();
      this.l.c();
      this.i.c();
      this.j.c();
      if ($$0.d) {
         this.p.c++;
         this.o.c += 2.0F;
         this.m.c++;
         this.n.c += -4.0F;
         this.n.d += 2.0F;
         this.m.e = (float) (Math.PI / 2);
         this.n.e = (float) (Math.PI / 2);
      } else if ($$0.e) {
         this.n.c = this.m.c;
         this.n.d += 2.0F;
         this.m.e = (float) (Math.PI / 2);
         this.n.e = (float) (Math.PI / 2);
      }

      this.o.e = $$0.V * (float) (Math.PI / 180.0);
      this.o.f = $$0.U * (float) (Math.PI / 180.0);
      if (!$$0.f) {
         this.p.e = (float) (Math.PI / 2);
         float $$1 = $$0.Y;
         float $$2 = $$0.X;
         if ($$0.e) {
            this.i.e = azd.b($$2 * 0.6662F) * $$1;
            this.j.e = azd.b($$2 * 0.6662F + 0.3F) * $$1;
            this.k.e = azd.b($$2 * 0.6662F + (float) Math.PI + 0.3F) * $$1;
            this.l.e = azd.b($$2 * 0.6662F + (float) Math.PI) * $$1;
            this.n.e = 1.7278761F + (float) (Math.PI / 10) * azd.b($$2) * $$1;
         } else {
            this.i.e = azd.b($$2 * 0.6662F) * $$1;
            this.j.e = azd.b($$2 * 0.6662F + (float) Math.PI) * $$1;
            this.k.e = azd.b($$2 * 0.6662F + (float) Math.PI) * $$1;
            this.l.e = azd.b($$2 * 0.6662F) * $$1;
            if (!$$0.d) {
               this.n.e = 1.7278761F + (float) (Math.PI / 4) * azd.b($$2) * $$1;
            } else {
               this.n.e = 1.7278761F + 0.47123894F * azd.b($$2) * $$1;
            }
         }
      }

      float $$3 = $$0.ab;
      if ($$0.f) {
         this.p.e = (float) (Math.PI / 4);
         this.p.c += -4.0F * $$3;
         this.p.d += 5.0F * $$3;
         this.o.c += -3.3F * $$3;
         this.o.d += 1.0F * $$3;
         this.m.c += 8.0F * $$3;
         this.m.d += -2.0F * $$3;
         this.n.c += 2.0F * $$3;
         this.n.d += -0.8F * $$3;
         this.m.e = 1.7278761F;
         this.n.e = 2.670354F;
         this.k.e = (float) (-Math.PI / 20);
         this.k.c += 2.0F * $$3;
         this.k.d -= 2.0F * $$3;
         this.l.e = (float) (-Math.PI / 20);
         this.l.c += 2.0F * $$3;
         this.l.d -= 2.0F * $$3;
         this.i.e = (float) (-Math.PI / 2);
         this.i.c += 3.0F * $$3;
         this.i.d -= 4.0F * $$3;
         this.j.e = (float) (-Math.PI / 2);
         this.j.c += 3.0F * $$3;
         this.j.d -= 4.0F * $$3;
      }

      if ($$0.g > 0.0F) {
         this.o.g = azd.i($$0.g, this.o.g, -1.2707963F);
         this.o.f = azd.i($$0.g, this.o.f, 1.2707963F);
         this.k.e = -1.2707963F;
         this.l.e = -0.47079635F;
         this.l.g = -0.2F;
         this.l.b += $$3;
         this.i.e = -0.4F;
         this.j.e = 0.5F;
         this.j.g = -0.5F;
         this.j.b += 0.8F * $$3;
         this.j.c += 2.0F * $$3;
         this.m.e = azd.i($$0.h, this.m.e, 0.8F);
         this.n.e = azd.i($$0.h, this.n.e, -0.4F);
      }

      if ($$0.i > 0.0F) {
         this.o.e = azd.i($$0.i, this.o.e, -0.58177644F);
      }
   }

   @Override
   public gal a() {
      return this.g;
   }
}
