import javax.annotation.Nullable;

public class gtr<S extends gwm, M extends fzj<S> & fyg> extends gty<S, M> {
   private final gqi a;

   public gtr(grh<S, M> $$0, gqi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fer $$0, gjg $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.aq, $$3.ar, cwk.c, bvb.b, $$0, $$1, $$2);
      this.a($$3, $$3.as, $$3.at, cwk.b, bvb.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, @Nullable hbg $$1, cwm $$2, cwk $$3, bvb $$4, fer $$5, gjg $$6, int $$7) {
      if ($$1 != null && !$$2.f()) {
         $$5.a();
         this.d().a($$4, $$5);
         $$5.a(a.b.rotationDegrees(-90.0F));
         $$5.a(a.d.rotationDegrees(180.0F));
         boolean $$8 = $$4 == bvb.a;
         $$5.a((float)($$8 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$2, $$3, $$8, $$5, $$6, $$7, gyv.d, $$1);
         $$5.b();
      }
   }
}
