public class gry extends gsu<cmq, gye, gbp> {
   private static final alz a = alz.b("textures/entity/ghast/ghast.png");
   private static final alz b = alz.b("textures/entity/ghast/ghast_shooting.png");

   public gry(gro.a $$0) {
      super($$0, new gbp($$0.a(gel.aO)), 1.5F);
   }

   public alz a(gye $$0) {
      return $$0.a ? b : a;
   }

   public gye b() {
      return new gye();
   }

   public void a(cmq $$0, gye $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
