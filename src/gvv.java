public class gvv extends gxf<cnp, hce, gfo<hce>> {
   private static final alg a = alg.b("textures/entity/enderman/enderman.png");
   private final azv j = azv.a();

   public gvv(gvz.a $$0) {
      super($$0, new gfo<>($$0.a(git.aP)), 0.5F);
      this.a(new gzw(this));
      this.a(new gzo(this, $$0.d()));
   }

   public fei a(hce $$0) {
      fei $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alg b(hce $$0) {
      return a;
   }

   public hce a() {
      return new hce();
   }

   public void a(cnp $$0, hce $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwq.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
