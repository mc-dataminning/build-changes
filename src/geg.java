public class geg extends gfq<hbi> {
   public static final gjd a = gjd.scaling(0.6F);
   private static final float b = 25.0F;
   private static final float c = 22.5F;
   private static final float d = 16.5F;
   private static final float e = 2.5F;
   private static final String f = "head_cube";
   private static final String g = "right_ear_cube";
   private static final String i = "left_ear_cube";
   private final giu j;
   private final giu k;
   private final giu l;
   private final giu m;
   private final giu n;
   private final giu o;

   public geg(giu $$0) {
      super($$0);
      this.j = $$0.b("body");
      this.k = $$0.b("right_hind_leg");
      this.l = $$0.b("left_hind_leg");
      this.n = this.j.b("head");
      this.o = this.j.b("tail");
      this.m = $$0.b("cube");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a(
         "body",
         giz.c().a(0, 20).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new giy(0.3F)).a(0, 40).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new giy(0.0F)),
         giw.a(0.0F, 21.0F, 4.0F)
      );
      $$2.a("tail", giz.c().a(44, 53).a(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new giy(0.0F)), giw.a(0.0F, -3.0F, 1.0F, 0.5061F, 0.0F, 0.0F));
      gje $$3 = $$2.a("head", giz.c(), giw.a(0.0F, -2.0F, -11.0F));
      $$3.a("head_cube", giz.c().a(43, 15).a(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new giy(0.0F)), giw.a(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
      gje $$4 = $$3.a("right_ear", giz.c(), giw.a(-1.0F, -1.0F, 0.0F));
      $$4.a("right_ear_cube", giz.c().a(43, 10).a(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new giy(0.0F)), giw.a(-0.5F, 0.0F, -0.6F, 0.1886F, -0.3864F, -0.0718F));
      gje $$5 = $$3.a("left_ear", giz.c(), giw.a(1.0F, -2.0F, 0.0F));
      $$5.a("left_ear_cube", giz.c().a(47, 10).a(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new giy(0.0F)), giw.a(0.5F, 1.0F, -0.6F, 0.1886F, 0.3864F, 0.0718F));
      $$1.a("right_hind_leg", giz.c().a(51, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new giy(0.0F)), giw.a(-2.0F, 21.0F, 4.0F));
      $$1.a("left_hind_leg", giz.c().a(42, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new giy(0.0F)), giw.a(2.0F, 21.0F, 4.0F));
      $$1.a("right_front_leg", giz.c().a(51, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new giy(0.0F)), giw.a(-2.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", giz.c().a(42, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new giy(0.0F)), giw.a(2.0F, 21.0F, -4.0F));
      $$1.a("cube", giz.c().a(0, 0).a(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new giy(0.0F)), giw.a(0.0F, 24.0F, 0.0F));
      return gja.a($$0, 64, 64);
   }

   public void a(hbi $$0) {
      super.a($$0);
      if ($$0.a) {
         this.j.l = true;
         this.l.k = false;
         this.k.k = false;
         this.o.k = false;
         this.m.k = true;
      } else {
         this.j.l = false;
         this.l.k = true;
         this.k.k = true;
         this.o.k = true;
         this.m.k = false;
         this.n.e = azm.a($$0.ab, -22.5F, 25.0F) * (float) (Math.PI / 180.0);
         this.n.f = azm.a($$0.aa, -32.5F, 32.5F) * (float) (Math.PI / 180.0);
      }

      this.a(fpj.b, $$0.ad, $$0.ae, 16.5F, 2.5F);
      this.a($$0.b, fpj.d, $$0.u, 1.0F);
      this.a($$0.c, fpj.a, $$0.u, 1.0F);
      this.a($$0.d, fpj.c, $$0.u, 1.0F);
   }
}
