public class gqj extends gsu<cjc, gwx, gad> {
   private static final alz a = alz.b("textures/entity/allay/allay.png");

   public gqj(gro.a $$0) {
      super($$0, new gad($$0.a(gel.c)), 0.4F);
      this.a(new gvv<>(this, $$0.b()));
   }

   public alz a(gwx $$0) {
      return a;
   }

   public gwx a() {
      return new gwx();
   }

   public void a(cjc $$0, gwx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
      $$1.b = $$0.gm();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cjc $$0, jh $$1) {
      return 15;
   }
}
