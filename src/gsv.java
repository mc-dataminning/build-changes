import java.util.Arrays;

public class gsv extends gsu<clu, gza> {
   private static final aku a = aku.b("textures/entity/illager/illusioner.png");

   public gsv(gsb.a $$0) {
      super($$0, new gcm<>($$0.a(gez.bn)), 0.5F);
      this.a(new gwi<gza, gcm<gza>>(this) {
         public void a(ffs $$0, glv $$1, int $$2, gza $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public aku a(gza $$0) {
      return a;
   }

   public gza b() {
      return new gza();
   }

   public void a(clu $$0, gza $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fay[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gy();
   }

   public void a(gza $$0, ffs $$1, glv $$2, int $$3) {
      if ($$0.z) {
         fay[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)ayy.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)ayy.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)ayy.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gza $$0) {
      return true;
   }

   protected fat a(clu $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
