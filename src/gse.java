public class gse extends gqe<coe> {
   private static final alz a = alz.b("textures/entity/hoglin/hoglin.png");

   public gse(grp.a $$0) {
      super($$0, gem.aX, gem.aY, 0.7F);
   }

   public alz a(gyi $$0) {
      return a;
   }

   public void a(coe $$0, gyi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.go();
   }

   protected boolean b(gyi $$0) {
      return super.a($$0) || $$0.b;
   }
}
