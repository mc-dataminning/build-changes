import java.util.Arrays;

public class gwt extends gws<cnx, hcy> {
   private static final alg a = alg.b("textures/entity/illager/illusioner.png");

   public gwt(gvz.a $$0) {
      super($$0, new ggf<>($$0.a(git.bx)), 0.5F);
      this.a(new haf<hcy, ggf<hcy>>(this) {
         public void a(fjc $$0, gps $$1, int $$2, hcy $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public alg a(hcy $$0) {
      return a;
   }

   public hcy b() {
      return new hcy();
   }

   public void a(cnx $$0, hcy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fei[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gx();
   }

   public void a(hcy $$0, fjc $$1, gps $$2, int $$3) {
      if ($$0.z) {
         fei[] $$4 = $$0.a;

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

   protected boolean b(hcy $$0) {
      return true;
   }

   protected fed a(cnx $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
