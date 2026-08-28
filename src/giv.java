import com.google.common.collect.Lists;
import java.util.Collection;

public class giv implements gim.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final fgo c;
   private Collection<jd> d = Lists.newArrayList();

   public giv(fgo $$0) {
      this.c = $$0;
   }

   public void a(Collection<jd> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4) {
      jd $$5 = this.b().c();

      for (jd $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(fbi $$0, gez $$1, jd $$2) {
      gim.a($$0, $$1, $$2, 1.0F, 0.0F, 0.0F, 0.15F);
      int $$3 = -65536;
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(fbi $$0, gez $$1, String $$2, jd $$3, int $$4) {
      double $$5 = (double)$$3.u() + 0.5;
      double $$6 = (double)$$3.v() + 1.3;
      double $$7 = (double)$$3.w() + 0.5;
      gim.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private ffy b() {
      return this.c.j.l();
   }
}
