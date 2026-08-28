import javax.annotation.Nullable;

public class gsw<S extends gvy, M extends fyk<S> & fxh & fyt> extends gsq<S, M> {
   private final gpi a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gsw(gqg<S, M> $$0, gpi $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable haf $$1, cwb $$2, cvz $$3, buu $$4, feb $$5, gih $$6, int $$7) {
      if ($$1 != null) {
         bsc $$8 = $$4 == $$0.ap ? bsc.a : bsc.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cwf.qY)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(haf $$0, cwb $$1, buu $$2, feb $$3, gih $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      gbm $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = azk.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gsc.a($$3, gsc.a.a);
      boolean $$8 = $$2 == buu.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cvz.f, false, $$3, $$4, $$5, gxu.d, $$0);
      $$3.b();
   }
}
