import com.google.common.collect.Lists;
import java.util.Collection;

public class glv implements gll.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final fip c;
   private Collection<jf> d = Lists.newArrayList();

   public glv(fip $$0) {
      this.c = $$0;
   }

   public void a(Collection<jf> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      jf $$5 = this.b().c();

      for (jf $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(fdi $$0, ghl $$1, jf $$2) {
      gll.a($$0, $$1, $$2, 1.0F, 0.0F, 0.0F, 0.15F);
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(fdi $$0, ghl $$1, String $$2, jf $$3, int $$4) {
      double $$5 = (double)$$3.u() + 0.5;
      double $$6 = (double)$$3.v() + 1.3;
      double $$7 = (double)$$3.w() + 0.5;
      gll.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private fhy b() {
      return this.c.j.k();
   }
}
