public class gxh extends gws<haz, ger> {
   private static final akv a = akv.b("textures/entity/wolf/wolf_collar.png");

   public gxh(gua<haz, ger> $$0) {
      super($$0);
   }

   public void a(fft $$0, glx $$1, int $$2, haz $$3, float $$4, float $$5) {
      cvl $$6 = $$3.h;
      if ($$6 != null && !$$3.z) {
         int $$7 = $$6.d();
         ffx $$8 = $$1.getBuffer(gmh.g(a));
         this.d().a($$0, $$8, $$2, heh.d, $$7);
      }
   }
}
