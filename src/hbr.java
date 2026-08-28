public class hbr extends hbm<hfb, gio> {
   private final gio a;

   public hbr(gyv<hfb, gio> $$0, gjp $$1) {
      super($$0);
      this.a = new gio($$1.a(gjs.dh));
   }

   public void a(fkd $$0, gqr $$1, int $$2, hfb $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         fkh $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(grc.s(gzc.a));
         } else {
            $$7 = $$1.getBuffer(grc.j(gzc.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gxz.a($$3, 0.0F));
      }
   }
}
