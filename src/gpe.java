public class gpe extends gop<clf, gva, fyx> {
   private static final alc a = alc.b("textures/entity/illager/ravager.png");

   public gpe(gnj.a $$0) {
      super($$0, new fyx($$0.a(gak.bZ)), 1.1F);
   }

   public alc a(gva $$0) {
      return a;
   }

   public gva c() {
      return new gva();
   }

   public void a(clf $$0, gva $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.gp() > 0.0F ? (float)$$0.gp() - $$2 : 0.0F;
      $$1.b = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      if ($$0.gz() > 0) {
         $$1.c = ((float)(20 - $$0.gz()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
