public class gxw extends gxs<hbg, gey> {
   private final gey a;

   public gxw(gva<hbg, gey> $$0, gfy $$1) {
      super($$0);
      this.a = new gey($$1.a(ggb.cR));
   }

   public void a(fgr $$0, gmx $$1, int $$2, hbg $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         fgv $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gnh.s(gvh.a));
         } else {
            $$7 = $$1.getBuffer(gnh.j(gvh.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gue.a($$3, 0.0F));
      }
   }
}
