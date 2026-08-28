public class gwx extends gwt<hah, gdz> {
   private final gdz a;

   public gwx(gub<hah, gdz> $$0, gez $$1) {
      super($$0);
      this.a = new gdz($$1.a(gfc.cP));
   }

   public void a(ffu $$0, gly $$1, int $$2, hah $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         ffy $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gmi.s(gui.a));
         } else {
            $$7 = $$1.getBuffer(gmi.j(gui.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gtf.a($$3, 0.0F));
      }
   }
}
