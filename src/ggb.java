import java.util.Set;

public class ggb extends gfq<hct> {
   public static final gjd a = new gem(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F, Set.of("head"));
   private static final float b = 0.87266463F;
   private static final float c = (float) (-Math.PI / 9);
   private final giu d;
   private final giu e;
   private final giu f;
   private final giu g;
   private final giu i;
   private final giu j;
   private final giu k;
   private final giu l;
   private final giu m;

   public ggb(giu $$0) {
      super($$0);
      this.g = $$0.b("body");
      this.m = this.g.b("mane");
      this.d = $$0.b("head");
      this.e = this.d.b("right_ear");
      this.f = this.d.b("left_ear");
      this.i = $$0.b("right_front_leg");
      this.j = $$0.b("left_front_leg");
      this.k = $$0.b("right_hind_leg");
      this.l = $$0.b("left_hind_leg");
   }

   private static gjc c() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("body", giz.c().a(1, 1).a(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F), giw.a(0.0F, 7.0F, 0.0F));
      $$2.a("mane", giz.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new giy(0.001F)), giw.a(0.0F, -14.0F, -7.0F));
      gje $$3 = $$1.a("head", giz.c().a(61, 1).a(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F), giw.a(0.0F, 2.0F, -12.0F, 0.87266463F, 0.0F, 0.0F));
      $$3.a("right_ear", giz.c().a(1, 1).a(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), giw.a(-6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (-Math.PI * 2.0 / 9.0)));
      $$3.a("left_ear", giz.c().a(1, 6).a(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), giw.a(6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (Math.PI * 2.0 / 9.0)));
      $$3.a("right_horn", giz.c().a(10, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), giw.a(-7.0F, 2.0F, -12.0F));
      $$3.a("left_horn", giz.c().a(1, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), giw.a(7.0F, 2.0F, -12.0F));
      int $$4 = 14;
      int $$5 = 11;
      $$1.a("right_front_leg", giz.c().a(66, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), giw.a(-4.0F, 10.0F, -8.5F));
      $$1.a("left_front_leg", giz.c().a(41, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), giw.a(4.0F, 10.0F, -8.5F));
      $$1.a("right_hind_leg", giz.c().a(21, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), giw.a(-5.0F, 13.0F, 10.0F));
      $$1.a("left_hind_leg", giz.c().a(0, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), giw.a(5.0F, 13.0F, 10.0F));
      return $$0;
   }

   public static gja a() {
      gjc $$0 = c();
      return gja.a($$0, 128, 64);
   }

   public static gja b() {
      gjc $$0 = c();
      gje $$1 = $$0.a().b("body");
      $$1.a("mane", giz.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new giy(0.001F)), giw.a(0.0F, -14.0F, -3.0F));
      return gja.a($$0, 128, 64).a(a);
   }

   public void a(hct $$0) {
      super.a($$0);
      float $$1 = $$0.ae;
      float $$2 = $$0.ad;
      this.e.g = (float) (-Math.PI * 2.0 / 9.0) - $$1 * azm.a($$2);
      this.f.g = (float) (Math.PI * 2.0 / 9.0) + $$1 * azm.a($$2);
      this.d.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$3 = 1.0F - (float)azm.a(10 - 2 * $$0.a) / 10.0F;
      this.d.e = azm.h($$3, 0.87266463F, (float) (-Math.PI / 9));
      if ($$0.aj) {
         this.d.c += $$3 * 2.5F;
      }

      float $$4 = 1.2F;
      this.i.e = azm.b($$2) * 1.2F * $$1;
      this.j.e = azm.b($$2 + (float) Math.PI) * 1.2F * $$1;
      this.k.e = this.j.e;
      this.l.e = this.i.e;
   }
}
