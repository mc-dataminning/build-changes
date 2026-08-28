public class gyn<T extends cpl> extends gzd<T, heu> {
   private static final alk a = alk.b("textures/entity/illager/evoker.png");

   public gyn(gyk.a $$0) {
      super($$0, new gir<>($$0.a(glf.aV)), 0.5F);
      this.a(new hcq<heu, gir<heu>>(this) {
         public void a(flq $$0, gsc $$1, int $$2, heu $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alk a(heu $$0) {
      return a;
   }

   public heu b() {
      return new heu();
   }

   public void a(T $$0, heu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
   }
}
