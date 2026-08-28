public class gek extends gfq<hbl> {
   public gek(giu $$0) {
      super($$0, gqc::f);
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("back", giz.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), giw.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      giz $$2 = giz.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, giy.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, giw.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, giw.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gja.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(hbl $$0) {
      super.a($$0);
      if ($$0.c > 0.0F) {
         float $$1 = -azm.a($$0.c * 3.0F) * $$0.c;
         this.v.g += $$1 * (float) (Math.PI / 180.0);
      }
   }
}
