public class grz extends gsv<cmq, gyf, gbq> {
   private static final alz a = alz.b("textures/entity/ghast/ghast.png");
   private static final alz b = alz.b("textures/entity/ghast/ghast_shooting.png");

   public grz(grp.a $$0) {
      super($$0, new gbq($$0.a(gem.aO)), 1.5F);
   }

   public alz a(gyf $$0) {
      return $$0.a ? b : a;
   }

   public gyf b() {
      return new gyf();
   }

   public void a(cmq $$0, gyf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
