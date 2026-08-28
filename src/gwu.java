public class gwu extends gwf<haj, ged> {
   private static final alz a = alz.b("textures/entity/wolf/wolf_collar.png");

   public gwu(gtn<haj, ged> $$0) {
      super($$0);
   }

   public void a(fgs $$0, gll $$1, int $$2, haj $$3, float $$4, float $$5) {
      cwm $$6 = $$3.h;
      if ($$6 != null && !$$3.u) {
         int $$7 = $$6.d();
         fgw $$8 = $$1.getBuffer(glv.g(a));
         this.d().a($$0, $$8, $$2, hbc.d, $$7);
      }
   }
}
