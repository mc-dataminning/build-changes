public class gwu extends gwq<hae, gdw> {
   private final gdw a;

   public gwu(gty<hae, gdw> $$0, gew $$1) {
      super($$0);
      this.a = new gdw($$1.a(gez.cP));
   }

   public void a(ffs $$0, glv $$1, int $$2, hae $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         ffw $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gmf.s(guf.a));
         } else {
            $$7 = $$1.getBuffer(gmf.j(guf.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gtc.a($$3, 0.0F));
      }
   }
}
