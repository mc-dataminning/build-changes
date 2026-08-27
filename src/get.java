public class get extends gcr<cfv> {
   private static final ajc a = new ajc("textures/entity/illager/vindicator.png");

   public get(gby.a $$0) {
      super($$0, new fns<>($$0.a(fqe.bM)), 0.5F);
      this.a(new ggc<cfv, fns<cfv>>(this, $$0.d()) {
         public void a(etd $$0, fwq $$1, int $$2, cfv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gd()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ajc a(cfv $$0) {
      return a;
   }
}
