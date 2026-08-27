public class gfw extends gdu<cgp> {
   private static final ajh a = new ajh("textures/entity/illager/vindicator.png");

   public gfw(gdb.a $$0) {
      super($$0, new fot<>($$0.a(fre.bQ)), 0.5F);
      this.a(new ghf<cgp, fot<cgp>>(this, $$0.d()) {
         public void a(eub $$0, fxs $$1, int $$2, cgp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gf()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ajh a(cgp $$0) {
      return a;
   }
}
