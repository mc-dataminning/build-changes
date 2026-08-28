import javax.annotation.Nullable;

public class gxf<S extends gzc, M extends gcc<S>> extends gwu<S, M> {
   private final gby a;
   private final gby b;
   private final gwe c;

   public gxf(guc<S, M> $$0, gfa $$1, gwe $$2) {
      super($$0);
      this.a = new gby($$1.a(gfd.aF));
      this.b = new gby($$1.a(gfd.aG));
      this.c = $$2;
   }

   public void a(ffv $$0, glz $$1, int $$2, S $$3, float $$4, float $$5) {
      cwq $$6 = $$3.W;
      dev $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         akv $$8 = a($$3);
         gby $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hgz.d.c, $$7.c().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static akv a(gzc $$0) {
      if ($$0 instanceof gzx $$1) {
         hfv $$2 = $$1.a;
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
