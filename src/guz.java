import java.util.Arrays;

public class guz extends guy<cnh, hbd> {
   private static final ald a = ald.b("textures/entity/illager/illusioner.png");

   public guz(guf.a $$0) {
      super($$0, new gep<>($$0.a(ghc.bv)), 0.5F);
      this.a(new gyl<hbd, gep<hbd>>(this) {
         public void a(fho $$0, gny $$1, int $$2, hbd $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public ald a(hbd $$0) {
      return a;
   }

   public hbd b() {
      return new hbd();
   }

   public void a(cnh $$0, hbd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fcu[] $$3 = $$0.K($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gx();
   }

   public void a(hbd $$0, fho $$1, gny $$2, int $$3) {
      if ($$0.z) {
         fcu[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azk.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)azk.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azk.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(hbd $$0) {
      return true;
   }

   protected fcp a(cnh $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
