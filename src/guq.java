public class guq extends gsv<cnm, haf, gea> {
   private static final alz a = alz.b("textures/entity/witch.png");

   public guq(grp.a $$0) {
      super($$0, new gea($$0.a(gem.dt)), 0.5F);
      this.a(new gwq(this, $$0.b()));
   }

   public alz a(haf $$0) {
      return a;
   }

   public haf b() {
      return new haf();
   }

   public void a(cnm $$0, haf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar();
      $$1.b = !$$0.eZ().f();
   }
}
