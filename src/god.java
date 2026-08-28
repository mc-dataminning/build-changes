import java.util.Arrays;

public class god extends goc<cky, gud> {
   private static final alc a = alc.b("textures/entity/illager/illusioner.png");

   public god(gnj.a $$0) {
      super($$0, new fxy<>($$0.a(gak.aZ)), 0.5F);
      this.a(new grp<gud, fxy<gud>>(this, $$0.b()) {
         public void a(fde $$0, ghg $$1, int $$2, gud $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.d().k = true;
   }

   public alc a(gud $$0) {
      return a;
   }

   public gud c() {
      return new gud();
   }

   public void a(cky $$0, gud $$1, float $$2) {
      super.a($$0, $$1, $$2);
      eys[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gz();
   }

   public void a(gud $$0, fde $$1, ghg $$2, int $$3) {
      if ($$0.u) {
         eys[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azd.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)azd.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azd.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gud $$0) {
      return true;
   }

   protected eyn a(cky $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
