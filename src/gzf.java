public class gzf extends gxn<cqu, hex, gil> {
   private static final alg a = alg.b("textures/entity/wandering_trader.png");

   public gzf(gwh.a $$0) {
      super($$0, new gil($$0.a(gjb.dM)), 0.5F);
      this.a(new haa<>(this, $$0.f()));
      this.a(new gzz<>(this));
   }

   public alg a(hex $$0) {
      return a;
   }

   public hex b() {
      return new hex();
   }

   public void a(cqu $$0, hex $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdc.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}
