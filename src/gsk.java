import java.util.Arrays;

public class gsk extends gsj<cmv, gyn> {
   private static final alz a = alz.b("textures/entity/illager/illusioner.png");

   public gsk(grq.a $$0) {
      super($$0, new gca<>($$0.a(gen.bk)), 0.5F);
      this.a(new gvx<gyn, gca<gyn>>(this, $$0.b()) {
         public void a(fgs $$0, gll $$1, int $$2, gyn $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public alz a(gyn $$0) {
      return a;
   }

   public gyn b() {
      return new gyn();
   }

   public void a(cmv $$0, gyn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fby[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gx();
   }

   public void a(gyn $$0, fgs $$1, gll $$2, int $$3) {
      if ($$0.u) {
         fby[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)bae.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)bae.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)bae.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gyn $$0) {
      return true;
   }

   protected fbt a(cmv $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
