public class god extends gme<cmh> {
   private static final ale a = ale.b("textures/entity/hoglin/hoglin.png");

   public god(gno.a $$0) {
      super($$0, gap.aM, gap.aN, 0.7F);
   }

   public ale a(gue $$0) {
      return a;
   }

   public void a(cmh $$0, gue $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.y();
   }

   protected boolean b(gue $$0) {
      return super.a($$0) || $$0.b;
   }
}
