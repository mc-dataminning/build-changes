public class fvy extends ftw<cad> {
   private static final aez a = new aez("textures/entity/illager/vindicator.png");

   public fvy(ftd.a $$0) {
      super($$0, new ffm<>($$0.a(fhw.bK)), 0.5F);
      this.a(new fxe<cad, ffm<cad>>(this, $$0.d()) {
         public void a(elj $$0, foa $$1, int $$2, cad $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.fW()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aez a(cad $$0) {
      return a;
   }
}
