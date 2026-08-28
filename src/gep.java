public class gep extends gfq<hbn> {
   private final giu a;
   private final giu b;
   private final giu c;
   private final giu d;
   private final giu e;
   private final giu f;
   private final giu g;

   public gep(giu $$0) {
      super($$0, gqc::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("body", giz.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), giw.a(0.0F, 17.0F, 0.0F));
      gje $$3 = $$1.a("head", giz.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), giw.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", giz.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), giw.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", giz.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), giw.a(1.1F, -3.0F, 0.0F));
      gje $$4 = $$2.a("right_wing", giz.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), giw.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", giz.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), giw.a(-2.0F, 0.0F, 0.0F));
      gje $$5 = $$2.a("left_wing", giz.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), giw.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", giz.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), giw.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", giz.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), giw.a(0.0F, 5.0F, 0.0F));
      return gja.a($$0, 32, 32);
   }

   public void a(hbn $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, fpk.b, $$0.u, 1.0F);
      this.a($$0.c, fpk.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
