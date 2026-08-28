import javax.annotation.Nullable;

public class gvq<S extends gym, M extends gbf<S> & gab> extends gvy<S, M> {
   private final gsh a;

   public gvq(gtg<S, M> $$0, gsh $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgl $$0, gle $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cxi.c, bvv.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cxi.b, bvv.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable hdg $$1, cxk $$2, cxi $$3, bvv $$4, fgl $$5, gle $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == bvv.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, hav.d, $$1);
         $$5.b();
      }
   }
}
