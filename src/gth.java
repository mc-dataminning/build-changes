public class gth extends gsr<cmt, gzf, gcu> {
   private static final alp a = alp.b("textures/entity/illager/ravager.png");

   public gth(grl.a $$0) {
      super($$0, new gcu($$0.a(gei.cv)), 1.1F);
   }

   public alp a(gzf $$0) {
      return a;
   }

   public gzf b() {
      return new gzf();
   }

   public void a(cmt $$0, gzf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.x() > 0.0F ? (float)$$0.x() - $$2 : 0.0F;
      $$1.b = (float)$$0.p() > 0.0F ? (float)$$0.p() - $$2 : 0.0F;
      if ($$0.gx() > 0) {
         $$1.c = ((float)(20 - $$0.gx()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
