public class gui extends gqj<cix, haa, gdu> {
   private static final alz a = alz.b("textures/entity/turtle/big_sea_turtle.png");

   public gui(grp.a $$0) {
      super($$0, new gdu($$0.a(gem.dl)), new gdu($$0.a(gem.dm)), 0.7F);
   }

   protected float a(haa $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public haa b() {
      return new haa();
   }

   public void a(cix $$0, haa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public alz b(haa $$0) {
      return a;
   }
}
