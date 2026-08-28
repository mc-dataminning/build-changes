public class gpj extends gou<cli, gvf, fzb> {
   private static final ale a = ale.b("textures/entity/illager/ravager.png");

   public gpj(gno.a $$0) {
      super($$0, new fzb($$0.a(gap.bZ)), 1.1F);
   }

   public ale a(gvf $$0) {
      return a;
   }

   public gvf c() {
      return new gvf();
   }

   public void a(cli $$0, gvf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.go() > 0.0F ? (float)$$0.go() - $$2 : 0.0F;
      $$1.b = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      if ($$0.gy() > 0) {
         $$1.c = ((float)(20 - $$0.gy()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
