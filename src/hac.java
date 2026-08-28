public class hac extends gzy<hdl, ghc> {
   private final ghc a;

   public hac(gxh<hdl, ghc> $$0, gic $$1) {
      super($$0);
      this.a = new ghc($$1.a(gif.db));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hdl $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         fiu $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gpn.s(gxo.a));
         } else {
            $$7 = $$1.getBuffer(gpn.j(gxo.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gwl.a($$3, 0.0F));
      }
   }
}
