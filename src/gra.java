public class gra extends gtl<cif, gxo, gat> {
   private static final akv a = akv.b("textures/entity/allay/allay.png");

   public gra(gsf.a $$0) {
      super($$0, new gat($$0.a(gfd.c)), 0.4F);
      this.a(new gwm<>(this));
   }

   public akv a(gxo $$0) {
      return a;
   }

   public gxo a() {
      return new gxo();
   }

   public void a(cif $$0, gxo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxq.a($$0, $$1, this.i);
      $$1.a = $$0.x();
      $$1.b = $$0.gs();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cif $$0, ji $$1) {
      return 15;
   }
}
