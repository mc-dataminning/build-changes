public class gff extends gfy<hcb> {
   private static final float c = 2.0F;
   private static final float d = 2.5F;
   public static final gjl a = gjl.scaling(0.45F);
   protected final gjc b;

   public gff(gjc $$0) {
      super($$0);
      gjc $$1 = $$0.b("body");
      this.b = $$1.b("head");
   }

   public static gji a() {
      return gji.a(b(), 128, 128);
   }

   protected static gjk b() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("body", gjh.c().a(0, 25).a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F), gje.a(0.0F, 4.0F, 9.5F));
      $$2.a("hump", gjh.c().a(74, 0).a(-4.5F, -5.0F, -5.5F, 9.0F, 5.0F, 11.0F), gje.a(0.0F, -12.0F, -10.0F));
      $$2.a("tail", gjh.c().a(122, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F), gje.a(0.0F, -9.0F, 3.5F));
      gjm $$3 = $$2.a(
         "head",
         gjh.c()
            .a(60, 24)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F)
            .a(21, 0)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F)
            .a(50, 0)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F),
         gje.a(0.0F, -3.0F, -19.5F)
      );
      $$3.a("left_ear", gjh.c().a(45, 0).a(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gje.a(2.5F, -21.0F, -9.5F));
      $$3.a("right_ear", gjh.c().a(67, 0).a(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), gje.a(-2.5F, -21.0F, -9.5F));
      $$1.a("left_hind_leg", gjh.c().a(58, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gje.a(4.9F, 1.0F, 9.5F));
      $$1.a("right_hind_leg", gjh.c().a(94, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gje.a(-4.9F, 1.0F, 9.5F));
      $$1.a("left_front_leg", gjh.c().a(0, 0).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gje.a(4.9F, 1.0F, -10.5F));
      $$1.a("right_front_leg", gjh.c().a(0, 26).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), gje.a(-4.9F, 1.0F, -10.5F));
      return $$0;
   }

   public void a(hcb $$0) {
      super.a($$0);
      this.a($$0, $$0.aa, $$0.ab);
      this.a(fpt.a, $$0.ad, $$0.ae, 2.0F, 2.5F);
      this.a($$0.d, fpt.b, $$0.u, 1.0F);
      this.a($$0.e, fpt.c, $$0.u, 1.0F);
      this.a($$0.f, fpt.d, $$0.u, 1.0F);
      this.a($$0.g, fpt.f, $$0.u, 1.0F);
      this.a($$0.h, fpt.e, $$0.u, 1.0F);
   }

   private void a(hcb $$0, float $$1, float $$2) {
      $$1 = azm.a($$1, -30.0F, 30.0F);
      $$2 = azm.a($$2, -25.0F, 45.0F);
      if ($$0.c > 0.0F) {
         float $$3 = 45.0F * $$0.c / 55.0F;
         $$2 = azm.a($$2 + $$3, -25.0F, 70.0F);
      }

      this.b.f = $$1 * (float) (Math.PI / 180.0);
      this.b.e = $$2 * (float) (Math.PI / 180.0);
   }
}
