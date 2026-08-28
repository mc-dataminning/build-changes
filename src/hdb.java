public class hdb extends hcw<hgl, gjz> {
   private final gjz a;

   public hdb(haf<hgl, gjz> $$0, gla $$1) {
      super($$0);
      this.a = new gjz($$1.a(gld.dh));
   }

   public void a(flo $$0, gsa $$1, int $$2, hgl $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         flr $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gsl.s(ham.a));
         } else {
            $$7 = $$1.getBuffer(gsl.j(ham.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gzj.a($$3, 0.0F));
      }
   }
}
