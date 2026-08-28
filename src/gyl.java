public class gyl<T extends cpj> extends gzb<T, hes> {
   private static final ali a = ali.b("textures/entity/illager/evoker.png");

   public gyl(gyi.a $$0) {
      super($$0, new gip<>($$0.a(gld.aV)), 0.5F);
      this.a(new hco<hes, gip<hes>>(this) {
         public void a(flo $$0, gsa $$1, int $$2, hes $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ali a(hes $$0) {
      return a;
   }

   public hes b() {
      return new hes();
   }

   public void a(T $$0, hes $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
   }
}
