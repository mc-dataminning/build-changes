public class hcc extends hbm<hfu, gji> {
   private static final alg a = alg.b("textures/entity/wolf/wolf_collar.png");

   public hcc(gyv<hfu, gji> $$0) {
      super($$0);
   }

   public void a(fkd $$0, gqr $$1, int $$2, hfu $$3, float $$4, float $$5) {
      cyl $$6 = $$3.h;
      if ($$6 != null && !$$3.z) {
         int $$7 = $$6.d();
         fkh $$8 = $$1.getBuffer(grc.g(a));
         this.d().a($$0, $$8, $$2, hjg.d, $$7);
      }
   }
}
