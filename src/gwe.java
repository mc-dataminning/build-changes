public class gwe extends gwa<gzm, gdf> {
   private final gdf a;

   public gwe(gti<gzm, gdf> $$0, gef $$1) {
      super($$0);
      this.a = new gdf($$1.a(gei.cP));
   }

   public void a(fgl $$0, glg $$1, int $$2, gzm $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fgp $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(glq.s(gtp.a));
         } else {
            $$7 = $$1.getBuffer(glq.j(gtp.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gsm.a($$3, 0.0F));
      }
   }
}
