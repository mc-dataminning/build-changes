import javax.annotation.Nullable;

public class gsq<S extends gvl, M extends fyk<S> & fxh> extends gsx<S, M> {
   private final gpi a;

   public gsq(gqg<S, M> $$0, gpi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(feb $$0, gih $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cvz.c, buu.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cvz.b, buu.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable haf $$1, cwb $$2, cvz $$3, buu $$4, feb $$5, gih $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == buu.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, gxu.d, $$1);
         $$5.b();
      }
   }
}
