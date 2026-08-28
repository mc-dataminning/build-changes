public class gwy extends gwu<hai, gea> {
   private final gea a;

   public gwy(guc<hai, gea> $$0, gfa $$1) {
      super($$0);
      this.a = new gea($$1.a(gfd.cP));
   }

   public void a(ffv $$0, glz $$1, int $$2, hai $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         ffz $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gmj.s(guj.a));
         } else {
            $$7 = $$1.getBuffer(gmj.j(guj.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gtg.a($$3, 0.0F));
      }
   }
}
