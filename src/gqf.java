public class gqf extends gpq<clw, gwc, fzx> {
   private static final ali a = ali.b("textures/entity/illager/ravager.png");

   public gqf(gok.a $$0) {
      super($$0, new fzx($$0.a(gbl.bZ)), 1.1F);
   }

   public ali a(gwc $$0) {
      return a;
   }

   public gwc c() {
      return new gwc();
   }

   public void a(clw $$0, gwc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.gu() > 0.0F ? (float)$$0.gu() - $$2 : 0.0F;
      $$1.b = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      if ($$0.gE() > 0) {
         $$1.c = ((float)(20 - $$0.gE()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
