public class gry extends gpy<coa> {
   private static final alz a = alz.b("textures/entity/hoglin/hoglin.png");

   public gry(grj.a $$0) {
      super($$0, geg.aX, geg.aY, 0.7F);
   }

   public alz a(gyc $$0) {
      return a;
   }

   public void a(coa $$0, gyc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gm();
   }

   protected boolean b(gyc $$0) {
      return super.a($$0) || $$0.b;
   }
}
