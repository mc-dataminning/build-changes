public class ggd extends gid<cjj, frk<cjj>> {
   private static final akh a = new akh("textures/entity/breeze/breeze.png");

   public ggd(ggx.a $$0) {
      super($$0, new frk<>($$0.a(fva.s)), 0.5F);
      this.a(new gkh(this));
      this.a(new gkg(this));
   }

   public void a(cjj $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      frk<cjj> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akh a(cjj $$0) {
      return a;
   }

   public static frk<cjj> a(frk<cjj> $$0, fvb... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fvb $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
