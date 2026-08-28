import java.util.Arrays;

public class gze extends gzd<coz, hfk> {
   private static final alk a = alk.b("textures/entity/illager/illusioner.png");

   public gze(gyk.a $$0) {
      super($$0, new gir<>($$0.a(glf.bz)), 0.5F);
      this.a(new hcq<hfk, gir<hfk>>(this) {
         public void a(flq $$0, gsc $$1, int $$2, hfk $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public alk a(hfk $$0) {
      return a;
   }

   public hfk b() {
      return new hfk();
   }

   public void a(coz $$0, hfk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ffs[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gB();
   }

   public void a(hfk $$0, flq $$1, gsc $$2, int $$3) {
      if ($$0.z) {
         ffs[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azq.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)azq.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azq.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(hfk $$0) {
      return true;
   }

   protected ffn a(coz $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
