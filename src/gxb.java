import java.util.Arrays;

public class gxb extends gxa<cob, hdg> {
   private static final alg a = alg.b("textures/entity/illager/illusioner.png");

   public gxb(gwh.a $$0) {
      super($$0, new ggn<>($$0.a(gjb.bz)), 0.5F);
      this.a(new han<hdg, ggn<hdg>>(this) {
         public void a(fjj $$0, gqa $$1, int $$2, hdg $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public alg a(hdg $$0) {
      return a;
   }

   public hdg b() {
      return new hdg();
   }

   public void a(cob $$0, hdg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      feq[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gy();
   }

   public void a(hdg $$0, fjj $$1, gqa $$2, int $$3) {
      if ($$0.z) {
         feq[] $$4 = $$0.a;

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

   protected boolean b(hdg $$0) {
      return true;
   }

   protected fel a(cob $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
