import javax.annotation.Nullable;

public class gxb<S extends gyy, M extends gby<S>> extends gwq<S, M> {
   private final gbu a;
   private final gbu b;
   private final gwa c;

   public gxb(gty<S, M> $$0, gew $$1, gwa $$2) {
      super($$0);
      this.a = new gbu($$1.a(gez.aF));
      this.b = new gbu($$1.a(gez.aG));
      this.c = $$2;
   }

   public void a(ffs $$0, glv $$1, int $$2, S $$3, float $$4, float $$5) {
      cwn $$6 = $$3.W;
      des $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         aku $$8 = a($$3);
         gbu $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hgr.d.c, $$7.c().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static aku a(gyy $$0) {
      if ($$0 instanceof gzt $$1) {
         hfo $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.ay) {
            return $$2.c();
         }
      }

      return null;
   }
}
