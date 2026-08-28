public class gsg<T extends cmh> extends gsw<T, gym> {
   private static final akv a = akv.b("textures/entity/illager/evoker.png");

   public gsg(gsd.a $$0) {
      super($$0, new gco<>($$0.a(gfb.aL)), 0.5F);
      this.a(new gwk<gym, gco<gym>>(this) {
         public void a(fft $$0, glx $$1, int $$2, gym $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public akv a(gym $$0) {
      return a;
   }

   public gym b() {
      return new gym();
   }

   public void a(T $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
   }
}
