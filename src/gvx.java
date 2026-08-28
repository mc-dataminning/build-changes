import javax.annotation.Nullable;

public class gvx<S extends gyt, M extends gbm<S> & gai> extends gwf<S, M> {
   private final gso a;

   public gvx(gtn<S, M> $$0, gso $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgs $$0, gll $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cxn.c, bwa.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cxn.b, bwa.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable hdn $$1, cxp $$2, cxn $$3, bwa $$4, fgs $$5, gll $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == bwa.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, hbc.d, $$1);
         $$5.b();
      }
   }
}
