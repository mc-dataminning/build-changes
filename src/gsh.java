public class gsh<T extends cmi> extends gsx<T, gyn> {
   private static final akv a = akv.b("textures/entity/illager/evoker.png");

   public gsh(gse.a $$0) {
      super($$0, new gcp<>($$0.a(gfc.aL)), 0.5F);
      this.a(new gwl<gyn, gcp<gyn>>(this) {
         public void a(ffu $$0, gly $$1, int $$2, gyn $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public akv a(gyn $$0) {
      return a;
   }

   public gyn b() {
      return new gyn();
   }

   public void a(T $$0, gyn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
   }
}
