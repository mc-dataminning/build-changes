import javax.annotation.Nullable;

public class hdk<S extends hfi, M extends gic<S>> extends hcy<S, M> {
   private final ghy a;
   private final ghy b;
   private final hcj c;

   public hdk(hah<S, M> $$0, glc $$1, hcj $$2) {
      super($$0);
      this.a = new ghy($$1.a(glf.aP));
      this.b = new ghy($$1.a(glf.aQ));
      this.c = $$2;
   }

   public void a(flq $$0, gsc $$1, int $$2, S $$3, float $$4, float $$5) {
      daa $$6 = $$3.W;
      dij $$7 = $$6.a(kl.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         alk $$8 = a($$3);
         ghy $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hni.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alk a(hfi $$0) {
      if ($$0 instanceof hgd $$1) {
         hme $$2 = $$1.a;
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
