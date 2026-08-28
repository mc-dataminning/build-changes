import java.util.Arrays;

public class gnm extends gnl<ckt, gtm> {
   private static final alb a = alb.b("textures/entity/illager/illusioner.png");

   public gnm(gms.a $$0) {
      super($$0, new fxo<>($$0.a(gaa.aZ)), 0.5F);
      this.a(new gqy<gtm, fxo<gtm>>(this, $$0.b()) {
         public void a(fcu $$0, ggv $$1, int $$2, gtm $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.d().k = true;
   }

   public alb a(gtm $$0) {
      return a;
   }

   public gtm c() {
      return new gtm();
   }

   public void a(ckt $$0, gtm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      eye[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gy();
   }

   public void a(gtm $$0, fcu $$1, ggv $$2, int $$3) {
      if ($$0.u) {
         eye[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azc.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)azc.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azc.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gtm $$0) {
      return true;
   }

   protected exz a(ckt $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
