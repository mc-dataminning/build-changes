import javax.annotation.Nullable;

public class grp<S extends guj, M extends fxk<S> & fwh> extends grw<S, M> {
   private final goh a;

   public grp(gpf<S, M> $$0, goh $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fde $$0, ghg $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cvm.c, bue.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cvm.b, bue.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable gzd $$1, cvp $$2, cvm $$3, bue $$4, fde $$5, ghg $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == bue.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, gws.d, $$1);
         $$5.b();
      }
   }
}
