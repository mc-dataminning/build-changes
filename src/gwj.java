public class gwj extends gwf<gzr, gdk> {
   private final gdk a;

   public gwj(gtn<gzr, gdk> $$0, gek $$1) {
      super($$0);
      this.a = new gdk($$1.a(gen.cM));
   }

   public void a(fgs $$0, gll $$1, int $$2, gzr $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fgw $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(glv.s(gtu.a));
         } else {
            $$7 = $$1.getBuffer(glv.j(gtu.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gsr.a($$3, 0.0F));
      }
   }
}
