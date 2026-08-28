import javax.annotation.Nullable;

public class gru<S extends guo, M extends fxo<S> & fwl> extends gsb<S, M> {
   private final gom a;

   public gru(gpk<S, M> $$0, gom $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fdi $$0, ghl $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cvp.c, buh.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cvp.b, buh.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable gzi $$1, cvs $$2, cvp $$3, buh $$4, fdi $$5, ghl $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == buh.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, gwx.d, $$1);
         $$5.b();
      }
   }
}
