import java.util.Arrays;

public class gwe extends gwd<cnr, hci> {
   private static final ale a = ale.b("textures/entity/illager/illusioner.png");

   public gwe(gvk.a $$0) {
      super($$0, new gfs<>($$0.a(gif.bv)), 0.5F);
      this.a(new gzq<hci, gfs<hci>>(this) {
         public void a(fiq $$0, gpd $$1, int $$2, hci $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.g.c().k = true;
   }

   public ale a(hci $$0) {
      return a;
   }

   public hci b() {
      return new hci();
   }

   public void a(cnr $$0, hci $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fdw[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gx();
   }

   public void a(hci $$0, fiq $$1, gpd $$2, int $$3) {
      if ($$0.z) {
         fdw[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azk.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)azk.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azk.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(hci $$0) {
      return true;
   }

   protected fdr a(cnr $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
