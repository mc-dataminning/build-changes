public class gra extends gqy<cih, gxo, gau> {
   private static final akv a = akv.b("textures/entity/armadillo.png");

   public gra(gse.a $$0) {
      super($$0, new gau($$0.a(gfc.d)), new gau($$0.a(gfc.e)), 0.4F);
   }

   public akv a(gxo $$0) {
      return a;
   }

   public gxo a() {
      return new gxo();
   }

   public void a(cih $$0, gxo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
      $$1.d.a($$0.ce);
      $$1.b.a($$0.cc);
      $$1.c.a($$0.cd);
   }
}
