import javax.annotation.Nullable;

public class gsf<S extends gva, M extends fxz<S> & fww> extends gsm<S, M> {
   private final gox a;

   public gsf(gpv<S, M> $$0, gox $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fdt $$0, ghw $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cvv.c, bup.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cvv.b, bup.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable gzu $$1, cvx $$2, cvv $$3, bup $$4, fdt $$5, ghw $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == bup.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, gxj.d, $$1);
         $$5.b();
      }
   }
}
