import javax.annotation.Nullable;

public class gtg<S extends gwb, M extends fza<S> & fxx> extends gtn<S, M> {
   private final gpy a;

   public gtg(gqw<S, M> $$0, gpy $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fek $$0, gix $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cwd.c, buy.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cwd.b, buy.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable hav $$1, cwf $$2, cwd $$3, buy $$4, fek $$5, gix $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == buy.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, gyk.d, $$1);
         $$5.b();
      }
   }
}
