import com.google.common.collect.Lists;
import java.util.Collection;

public class gue implements gtu.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final fos c;
   private Collection<iu> d = Lists.newArrayList();

   public gue(fos $$0) {
      this.c = $$0;
   }

   public void a(Collection<iu> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(fjc $$0, gps $$1, double $$2, double $$3, double $$4) {
      iu $$5 = this.b().c();

      for (iu $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(fjc $$0, gps $$1, iu $$2) {
      gtu.a($$0, $$1, $$2, 1.0F, 0.0F, 0.0F, 0.15F);
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(fjc $$0, gps $$1, String $$2, iu $$3, int $$4) {
      double $$5 = (double)$$3.u() + 0.5;
      double $$6 = (double)$$3.v() + 1.3;
      double $$7 = (double)$$3.w() + 0.5;
      gtu.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private fnz b() {
      return this.c.j.k();
   }
}
