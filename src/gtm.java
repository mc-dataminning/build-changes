import javax.annotation.Nullable;

public class gtm<S extends gwo, M extends fza<S> & fxx & fzj> extends gtg<S, M> {
   private final gpy a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gtm(gqw<S, M> $$0, gpy $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   protected void a(S $$0, @Nullable hav $$1, cwf $$2, cwd $$3, buy $$4, fek $$5, gix $$6, int $$7) {
      if ($$1 != null) {
         bsg $$8 = $$4 == $$0.ap ? bsg.a : bsg.b;
         if ($$0.M && $$0.H == $$8 && $$0.C < 1.0E-5F && $$2.a(cwj.ro)) {
            this.a($$1, $$2, $$4, $$5, $$6, $$7);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(hav $$0, cwf $$1, buy $$2, fek $$3, gix $$4, int $$5) {
      $$3.a();
      this.d().e().a($$3);
      gcc $$6 = this.d().b();
      float $$7 = $$6.e;
      $$6.e = azn.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gss.a($$3, gss.a.a);
      boolean $$8 = $$2 == buy.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$1, cwd.f, false, $$3, $$4, $$5, gyk.d, $$0);
      $$3.b();
   }
}
