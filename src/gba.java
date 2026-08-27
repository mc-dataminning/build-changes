public class gba extends fyy<ccy> {
   private static final ahd a = new ahd("textures/entity/illager/vindicator.png");

   public gba(fyf.a $$0) {
      super($$0, new fkd<>($$0.a(fmo.bN)), 0.5F);
      this.a(new gcj<ccy, fkd<ccy>>(this, $$0.d()) {
         public void a(ept $$0, fsz $$1, int $$2, ccy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.fW()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ahd a(ccy $$0) {
      return a;
   }
}
