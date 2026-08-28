public class gxi extends gwt<hba, ges> {
   private static final akv a = akv.b("textures/entity/wolf/wolf_collar.png");

   public gxi(gub<hba, ges> $$0) {
      super($$0);
   }

   public void a(ffu $$0, gly $$1, int $$2, hba $$3, float $$4, float $$5) {
      cvm $$6 = $$3.h;
      if ($$6 != null && !$$3.z) {
         int $$7 = $$6.d();
         ffy $$8 = $$1.getBuffer(gmi.g(a));
         this.d().a($$0, $$8, $$2, hei.d, $$7);
      }
   }
}
