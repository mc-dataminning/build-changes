public class gse<T extends cmg> extends gsu<T, gyk> {
   private static final aku a = aku.b("textures/entity/illager/evoker.png");

   public gse(gsb.a $$0) {
      super($$0, new gcm<>($$0.a(gez.aL)), 0.5F);
      this.a(new gwi<gyk, gcm<gyk>>(this) {
         public void a(ffs $$0, glv $$1, int $$2, gyk $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public aku a(gyk $$0) {
      return a;
   }

   public gyk b() {
      return new gyk();
   }

   public void a(T $$0, gyk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }
}
