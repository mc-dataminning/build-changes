import javax.annotation.Nullable;

public class gxe<S extends gzb, M extends gcb<S>> extends gwt<S, M> {
   private final gbx a;
   private final gbx b;
   private final gwd c;

   public gxe(gub<S, M> $$0, gez $$1, gwd $$2) {
      super($$0);
      this.a = new gbx($$1.a(gfc.aF));
      this.b = new gbx($$1.a(gfc.aG));
      this.c = $$2;
   }

   public void a(ffu $$0, gly $$1, int $$2, S $$3, float $$4, float $$5) {
      cwp $$6 = $$3.W;
      deu $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         akv $$8 = a($$3);
         gbx $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hgy.d.c, $$7.c().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static akv a(gzb $$0) {
      if ($$0 instanceof gzw $$1) {
         hfu $$2 = $$1.a;
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
