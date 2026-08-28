public class gpu extends gpf<clr, gvr, fzm> {
   private static final alh a = alh.b("textures/entity/illager/ravager.png");

   public gpu(gnz.a $$0) {
      super($$0, new fzm($$0.a(gba.bZ)), 1.1F);
   }

   public alh a(gvr $$0) {
      return a;
   }

   public gvr c() {
      return new gvr();
   }

   public void a(clr $$0, gvr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.gv() > 0.0F ? (float)$$0.gv() - $$2 : 0.0F;
      $$1.b = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      if ($$0.gF() > 0) {
         $$1.c = ((float)(20 - $$0.gF()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
