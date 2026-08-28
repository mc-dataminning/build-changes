public class gxb<T extends coy> extends gxr<T, hdi> {
   private static final alg a = alg.b("textures/entity/illager/evoker.png");

   public gxb(gwy.a $$0) {
      super($$0, new ghe<>($$0.a(gjs.aV)), 0.5F);
      this.a(new hbe<hdi, ghe<hdi>>(this) {
         public void a(fkd $$0, gqr $$1, int $$2, hdi $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alg a(hdi $$0) {
      return a;
   }

   public hdi b() {
      return new hdi();
   }

   public void a(T $$0, hdi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }
}
