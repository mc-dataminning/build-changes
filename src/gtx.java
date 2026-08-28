public class gtx extends gth<cmb, gzx, gdl> {
   private static final aku a = aku.b("textures/entity/illager/ravager.png");

   public gtx(gsb.a $$0) {
      super($$0, new gdl($$0.a(gez.cv)), 1.1F);
   }

   public aku a(gzx $$0) {
      return a;
   }

   public gzx b() {
      return new gzx();
   }

   public void a(cmb $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.x() > 0.0F ? (float)$$0.x() - $$2 : 0.0F;
      $$1.b = (float)$$0.p() > 0.0F ? (float)$$0.p() - $$2 : 0.0F;
      if ($$0.gy() > 0) {
         $$1.c = ((float)(20 - $$0.gy()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
