public class gqy extends gtj<cid, gxm, gar> {
   private static final akv a = akv.b("textures/entity/allay/allay.png");

   public gqy(gsd.a $$0) {
      super($$0, new gar($$0.a(gfb.c)), 0.4F);
      this.a(new gwk<>(this));
   }

   public akv a(gxm $$0) {
      return a;
   }

   public gxm a() {
      return new gxm();
   }

   public void a(cid $$0, gxm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxo.a($$0, $$1, this.i);
      $$1.a = $$0.x();
      $$1.b = $$0.gs();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cid $$0, ji $$1) {
      return 15;
   }
}
