public class gfv extends gfq<hcp> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final giu d = this.v.b("body");
   private final giu e = this.d.b("head");
   private final giu f = this.e.b("eyes");
   private final giu g = this.d.b("tongue");
   private final giu i = this.d.b("left_arm");
   private final giu j = this.d.b("right_arm");
   private final giu k = this.v.b("left_leg");
   private final giu l = this.v.b("right_leg");
   private final giu m = this.d.b("croaking_body");

   public gfv(giu $$0) {
      super($$0.b("root"));
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("root", giz.c(), giw.a(0.0F, 24.0F, 0.0F));
      gje $$3 = $$2.a(
         "body", giz.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), giw.a(0.0F, -2.0F, 4.0F)
      );
      gje $$4 = $$3.a(
         "head", giz.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), giw.a(0.0F, -2.0F, -1.0F)
      );
      gje $$5 = $$4.a("eyes", giz.c(), giw.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", giz.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), giw.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", giz.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), giw.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", giz.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new giy(-0.1F)), giw.a(0.0F, -1.0F, -5.0F));
      gje $$6 = $$3.a("tongue", giz.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), giw.a(0.0F, -1.01F, 1.0F));
      gje $$7 = $$3.a("left_arm", giz.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), giw.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", giz.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), giw.a(0.0F, 3.0F, -1.0F));
      gje $$8 = $$3.a("right_arm", giz.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), giw.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", giz.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), giw.a(0.0F, 3.0F, 0.0F));
      gje $$9 = $$2.a("left_leg", giz.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), giw.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", giz.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), giw.a(2.0F, 3.0F, 0.0F));
      gje $$10 = $$2.a("right_leg", giz.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), giw.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", giz.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), giw.a(-2.0F, 3.0F, 0.0F));
      return gja.a($$0, 48, 48);
   }

   public void a(hcp $$0) {
      super.a($$0);
      this.a($$0.b, fpo.c, $$0.u);
      this.a($$0.c, fpo.a, $$0.u);
      this.a($$0.d, fpo.d, $$0.u);
      if ($$0.a) {
         this.a(fpo.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fpo.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fpo.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
