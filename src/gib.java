public class gib extends gkb<ckx, fth<ckx>> {
   private static final ale a = new ale("textures/entity/breeze/breeze.png");

   public gib(giv.a $$0) {
      super($$0, new fth<>($$0.a(fwx.s)), 0.5F);
      this.a(new gmg(this));
      this.a(new gmf(this));
   }

   public void a(ckx $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      fth<ckx> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(ckx $$0) {
      return a;
   }

   public static fth<ckx> a(fth<ckx> $$0, fwy... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fwy $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
