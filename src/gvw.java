import javax.annotation.Nullable;

public class gvw<S extends gys, M extends gbl<S> & gah> extends gwe<S, M> {
   private final gsn a;

   public gvw(gtm<S, M> $$0, gsn $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgr $$0, glk $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cxm.c, bvz.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cxm.b, bvz.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable hdm $$1, cxo $$2, cxm $$3, bvz $$4, fgr $$5, glk $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == bvz.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, hbb.d, $$1);
         $$5.b();
      }
   }
}
