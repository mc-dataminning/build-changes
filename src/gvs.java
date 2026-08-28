import javax.annotation.Nullable;

public class gvs<S extends gyo, M extends gbh<S> & gab> extends gwa<S, M> {
   private final gsj a;

   public gvs(gti<S, M> $$0, gsj $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgl $$0, glg $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cxe.c, bvr.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cxe.b, bvr.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable hdi $$1, cxg $$2, cxe $$3, bvr $$4, fgl $$5, glg $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == bvr.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, hax.d, $$1);
         $$5.b();
      }
   }
}
