public class gsa extends gsw<cmr, gyg, gbr> {
   private static final alz a = alz.b("textures/entity/ghast/ghast.png");
   private static final alz b = alz.b("textures/entity/ghast/ghast_shooting.png");

   public gsa(grq.a $$0) {
      super($$0, new gbr($$0.a(gen.aO)), 1.5F);
   }

   public alz a(gyg $$0) {
      return $$0.a ? b : a;
   }

   public gyg b() {
      return new gyg();
   }

   public void a(cmr $$0, gyg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
