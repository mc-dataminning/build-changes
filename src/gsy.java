import java.util.Arrays;

public class gsy extends gsx<clw, gzd> {
   private static final akv a = akv.b("textures/entity/illager/illusioner.png");

   public gsy(gse.a $$0) {
      super($$0, new gcp<>($$0.a(gfc.bn)), 0.5F);
      this.a(new gwl<gzd, gcp<gzd>>(this) {
         public void a(ffu $$0, gly $$1, int $$2, gzd $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public akv a(gzd $$0) {
      return a;
   }

   public gzd b() {
      return new gzd();
   }

   public void a(clw $$0, gzd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fba[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gB();
   }

   public void a(gzd $$0, ffu $$1, gly $$2, int $$3) {
      if ($$0.z) {
         fba[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)ayz.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)ayz.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)ayz.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gzd $$0) {
      return true;
   }

   protected fav a(clw $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
