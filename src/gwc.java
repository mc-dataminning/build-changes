public class gwc extends gvy<gzk, gdd> {
   private final gdd a;

   public gwc(gtg<gzk, gdd> $$0, ged $$1) {
      super($$0);
      this.a = new gdd($$1.a(geg.cM));
   }

   public void a(fgl $$0, gle $$1, int $$2, gzk $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fgp $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(glo.r(gtn.a));
         } else {
            $$7 = $$1.getBuffer(glo.i(gtn.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gsk.a($$3, 0.0F));
      }
   }
}
