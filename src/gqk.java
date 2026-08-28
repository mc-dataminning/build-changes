import com.google.common.collect.Lists;
import java.util.Collection;

public class gqk implements gqa.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final flk c;
   private Collection<ji> d = Lists.newArrayList();

   public gqk(flk $$0) {
      this.c = $$0;
   }

   public void a(Collection<ji> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(ffv $$0, glz $$1, double $$2, double $$3, double $$4) {
      ji $$5 = this.b().c();

      for (ji $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(ffv $$0, glz $$1, ji $$2) {
      gqa.a($$0, $$1, $$2, 1.0F, 0.0F, 0.0F, 0.15F);
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(ffv $$0, glz $$1, String $$2, ji $$3, int $$4) {
      double $$5 = (double)$$3.u() + 0.5;
      double $$6 = (double)$$3.v() + 1.3;
      double $$7 = (double)$$3.w() + 0.5;
      gqa.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private fks b() {
      return this.c.j.k();
   }
}
