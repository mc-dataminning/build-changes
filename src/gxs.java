import java.util.Arrays;

public class gxs extends gxr<col, hdy> {
   private static final alg a = alg.b("textures/entity/illager/illusioner.png");

   public gxs(gwy.a $$0) {
      super($$0, new ghe<>($$0.a(gjs.bz)), 0.5F);
      this.a(new hbe<hdy, ghe<hdy>>(this) {
         public void a(fkd $$0, gqr $$1, int $$2, hdy $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public alg a(hdy $$0) {
      return a;
   }

   public hdy b() {
      return new hdy();
   }

   public void a(col $$0, hdy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ffc[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gA();
   }

   public void a(hdy $$0, fkd $$1, gqr $$2, int $$3) {
      if ($$0.z) {
         ffc[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azm.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)azm.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azm.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(hdy $$0) {
      return true;
   }

   protected fex a(col $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
