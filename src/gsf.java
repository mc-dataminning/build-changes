import java.util.Arrays;

public class gsf extends gse<cmm, gyi> {
   private static final alp a = alp.b("textures/entity/illager/illusioner.png");

   public gsf(grl.a $$0) {
      super($$0, new gbv<>($$0.a(gei.bn)), 0.5F);
      this.a(new gvs<gyi, gbv<gyi>>(this, $$0.b()) {
         public void a(fgl $$0, glg $$1, int $$2, gyi $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public alp a(gyi $$0) {
      return a;
   }

   public gyi b() {
      return new gyi();
   }

   public void a(cmm $$0, gyi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fbr[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gx();
   }

   public void a(gyi $$0, fgl $$1, glg $$2, int $$3) {
      if ($$0.u) {
         fbr[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azu.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)azu.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azu.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gyi $$0) {
      return true;
   }

   protected fbm a(cmm $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
