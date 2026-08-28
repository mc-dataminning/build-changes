public class gvd<S extends gyo, M extends gbh<S> & gds> extends gwa<S, M> {
   private final gsj a;

   public gvd(gti<S, M> $$0, gsj $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgl $$0, glg $$1, int $$2, S $$3, float $$4, float $$5) {
      hdi $$6 = $$3.b();
      if ($$6 != null) {
         $$0.a();
         this.a($$3, $$0);
         cxg $$7 = $$3.aX_();
         this.a.a($$7, cxe.h, false, $$0, $$1, $$2, hax.d, $$6);
         $$0.b();
      }
   }

   protected void a(S $$0, fgl $$1) {
      this.d().a($$1);
      $$1.a(a.b.rotation(0.75F));
      $$1.b(1.07F, 1.07F, 1.07F);
      $$1.a(0.0F, 0.13F, -0.34F);
      $$1.a(a.b.rotation((float) Math.PI));
   }
}
