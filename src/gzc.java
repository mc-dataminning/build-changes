import java.util.Arrays;

public class gzc extends gzb<cox, hfi> {
   private static final ali a = ali.b("textures/entity/illager/illusioner.png");

   public gzc(gyi.a $$0) {
      super($$0, new gip<>($$0.a(gld.bz)), 0.5F);
      this.a(new hco<hfi, gip<hfi>>(this) {
         public void a(flo $$0, gsa $$1, int $$2, hfi $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public ali a(hfi $$0) {
      return a;
   }

   public hfi b() {
      return new hfi();
   }

   public void a(cox $$0, hfi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ffq[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gB();
   }

   public void a(hfi $$0, flo $$1, gsa $$2, int $$3) {
      if ($$0.z) {
         ffq[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azo.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)azo.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azo.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(hfi $$0) {
      return true;
   }

   protected ffl a(cox $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
