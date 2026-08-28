public class gnh extends gli<clz> {
   private static final alb a = alb.b("textures/entity/hoglin/hoglin.png");

   public gnh(gms.a $$0) {
      super($$0, gaa.aM, gaa.aN, 0.7F);
   }

   public alb a(gti $$0) {
      return a;
   }

   public void a(clz $$0, gti $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.y();
   }

   protected boolean b(gti $$0) {
      return super.a($$0) || $$0.b;
   }
}
