public class gqk extends gsv<cjc, gwy, gae> {
   private static final alz a = alz.b("textures/entity/allay/allay.png");

   public gqk(grp.a $$0) {
      super($$0, new gae($$0.a(gem.c)), 0.4F);
      this.a(new gvw<>(this, $$0.b()));
   }

   public alz a(gwy $$0) {
      return a;
   }

   public gwy a() {
      return new gwy();
   }

   public void a(cjc $$0, gwy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
      $$1.b = $$0.go();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cjc $$0, jh $$1) {
      return 15;
   }
}
