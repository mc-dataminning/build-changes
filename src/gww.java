public class gww<T extends cov> extends gxm<T, hdc> {
   private static final alg a = alg.b("textures/entity/illager/evoker.png");

   public gww(gwt.a $$0) {
      super($$0, new ggz<>($$0.a(gjn.aV)), 0.5F);
      this.a(new haz<hdc, ggz<hdc>>(this) {
         public void a(fjy $$0, gqm $$1, int $$2, hdc $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alg a(hdc $$0) {
      return a;
   }

   public hdc b() {
      return new hdc();
   }

   public void a(T $$0, hdc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
   }
}
