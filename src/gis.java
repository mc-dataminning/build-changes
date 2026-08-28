public class gis extends gks<ckm, ftx<ckm>> {
   private static final akk a = new akk("textures/entity/breeze/breeze.png");

   public gis(gjm.a $$0) {
      super($$0, new ftx<>($$0.a(fxn.s)), 0.5F);
      this.a(new gmx(this));
      this.a(new gmw(this));
   }

   public void a(ckm $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      ftx<ckm> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(ckm $$0) {
      return a;
   }

   public static ftx<ckm> a(ftx<ckm> $$0, fxo... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fxo $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
