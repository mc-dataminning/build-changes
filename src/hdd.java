public class hdd extends hcy<hgn, gkb> {
   private final gkb a;

   public hdd(hah<hgn, gkb> $$0, glc $$1) {
      super($$0);
      this.a = new gkb($$1.a(glf.dh));
   }

   public void a(flq $$0, gsc $$1, int $$2, hgn $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         flt $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gsn.s(hao.a));
         } else {
            $$7 = $$1.getBuffer(gsn.j(hao.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gzl.a($$3, 0.0F));
      }
   }
}
