public class gsi<T extends cmj> extends gsy<T, gyo> {
   private static final akv a = akv.b("textures/entity/illager/evoker.png");

   public gsi(gsf.a $$0) {
      super($$0, new gcq<>($$0.a(gfd.aL)), 0.5F);
      this.a(new gwm<gyo, gcq<gyo>>(this) {
         public void a(ffv $$0, glz $$1, int $$2, gyo $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public akv a(gyo $$0) {
      return a;
   }

   public gyo b() {
      return new gyo();
   }

   public void a(T $$0, gyo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
   }
}
