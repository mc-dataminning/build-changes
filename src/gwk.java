public class gwk<T extends coo> extends gxa<T, hcq> {
   private static final alg a = alg.b("textures/entity/illager/evoker.png");

   public gwk(gwh.a $$0) {
      super($$0, new ggn<>($$0.a(gjb.aV)), 0.5F);
      this.a(new han<hcq, ggn<hcq>>(this) {
         public void a(fjj $$0, gqa $$1, int $$2, hcq $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alg a(hcq $$0) {
      return a;
   }

   public hcq b() {
      return new hcq();
   }

   public void a(T $$0, hcq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }
}
