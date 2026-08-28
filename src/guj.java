public class guj extends gqk<ciy, hab, gdv> {
   private static final alz a = alz.b("textures/entity/turtle/big_sea_turtle.png");

   public guj(grq.a $$0) {
      super($$0, new gdv($$0.a(gen.dl)), new gdv($$0.a(gen.dm)), 0.7F);
   }

   protected float a(hab $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public hab b() {
      return new hab();
   }

   public void a(ciy $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public alz b(hab $$0) {
      return a;
   }
}
