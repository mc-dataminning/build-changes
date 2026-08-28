public class gim extends gkm<ckj, ftr<ckj>> {
   private static final akk a = new akk("textures/entity/breeze/breeze.png");

   public gim(gjg.a $$0) {
      super($$0, new ftr<>($$0.a(fxh.s)), 0.5F);
      this.a(new gmr(this));
      this.a(new gmq(this));
   }

   public void a(ckj $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      ftr<ckj> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(ckj $$0) {
      return a;
   }

   public static ftr<ckj> a(ftr<ckj> $$0, fxi... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fxi $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
