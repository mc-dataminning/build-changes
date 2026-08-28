public class giu extends gku<ckn, ftz<ckn>> {
   private static final akk a = new akk("textures/entity/breeze/breeze.png");

   public giu(gjo.a $$0) {
      super($$0, new ftz<>($$0.a(fxp.s)), 0.5F);
      this.a(new gmz(this));
      this.a(new gmy(this));
   }

   public void a(ckn $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      ftz<ckn> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(ckn $$0) {
      return a;
   }

   public static ftz<ckn> a(ftz<ckn> $$0, fxq... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fxq $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
