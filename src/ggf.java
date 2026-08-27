import com.google.common.collect.Lists;
import java.util.Collection;

public class ggf implements gfw.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final fdz c;
   private Collection<io> d = Lists.newArrayList();

   public ggf(fdz $$0) {
      this.c = $$0;
   }

   public void a(Collection<io> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(eys $$0, gck $$1, double $$2, double $$3, double $$4) {
      io $$5 = this.b().c();

      for (io $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(eys $$0, gck $$1, io $$2) {
      gfw.a($$0, $$1, $$2, 1.0F, 0.0F, 0.0F, 0.15F);
      int $$3 = -65536;
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(eys $$0, gck $$1, String $$2, io $$3, int $$4) {
      double $$5 = (double)$$3.u() + 0.5;
      double $$6 = (double)$$3.v() + 1.3;
      double $$7 = (double)$$3.w() + 0.5;
      gfw.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private fdk b() {
      return this.c.j.m();
   }
}
