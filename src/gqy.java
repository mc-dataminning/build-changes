import javax.annotation.Nullable;

public class gqy<S extends gts, M extends fxa<S> & fvx> extends grf<S, M> {
   private final gnq a;

   public gqy(goo<S, M> $$0, gnq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fcu $$0, ggv $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cvi.c, btz.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cvi.b, btz.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable gym $$1, cvl $$2, cvi $$3, btz $$4, fcu $$5, ggv $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == btz.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, gwb.d, $$1);
         $$5.b();
      }
   }
}
