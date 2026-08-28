public class gsf<T extends cmh> extends gsv<T, gyl> {
   private static final aku a = aku.b("textures/entity/illager/evoker.png");

   public gsf(gsc.a $$0) {
      super($$0, new gco<>($$0.a(gfb.aL)), 0.5F);
      this.a(new gwj<gyl, gco<gyl>>(this) {
         public void a(ffu $$0, glx $$1, int $$2, gyl $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public aku a(gyl $$0) {
      return a;
   }

   public gyl b() {
      return new gyl();
   }

   public void a(T $$0, gyl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }
}
