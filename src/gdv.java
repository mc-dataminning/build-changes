public class gdv extends gbt<cfg> {
   private static final aiy a = new aiy("textures/entity/illager/vindicator.png");

   public gdv(gba.a $$0) {
      super($$0, new fmw<>($$0.a(fpi.bM)), 0.5F);
      this.a(new gfe<cfg, fmw<cfg>>(this, $$0.d()) {
         public void a(esh $$0, fvt $$1, int $$2, cfg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.fY()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aiy a(cfg $$0) {
      return a;
   }
}
