import java.util.Arrays;

public class gqe extends gqd<clw, gwg> {
   private static final alj a = alj.b("textures/entity/illager/illusioner.png");

   public gqe(gpk.a $$0) {
      super($$0, new fzx<>($$0.a(gck.bj)), 0.5F);
      this.a(new gtr<gwg, fzx<gwg>>(this, $$0.b()) {
         public void a(fer $$0, gjg $$1, int $$2, gwg $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public alj a(gwg $$0) {
      return a;
   }

   public gwg b() {
      return new gwg();
   }

   public void a(clw $$0, gwg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ezy[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gw();
   }

   public void a(gwg $$0, fer $$1, gjg $$2, int $$3) {
      if ($$0.u) {
         ezy[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azm.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)azm.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azm.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gwg $$0) {
      return true;
   }

   protected ezt a(clw $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
