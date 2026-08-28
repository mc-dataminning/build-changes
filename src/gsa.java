public class gsa extends grw<gvh, fzi> {
   private final fzi a;

   public gsa(gpf<gvh, fzi> $$0, gah $$1) {
      super($$0);
      this.a = new fzi($$1.a(gak.ct));
   }

   public void a(fde $$0, ghg $$1, int $$2, gvh $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fdi $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(ghq.r(this.b($$3)));
         } else {
            $$7 = $$1.getBuffer(ghq.i(this.b($$3)));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gok.a($$3, 0.0F));
      }
   }
}
