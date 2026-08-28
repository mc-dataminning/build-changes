import com.google.common.collect.Lists;
import java.util.Collection;

public class gum implements guc.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final foz c;
   private Collection<iu> d = Lists.newArrayList();

   public gum(foz $$0) {
      this.c = $$0;
   }

   public void a(Collection<iu> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(fjj $$0, gqa $$1, double $$2, double $$3, double $$4) {
      iu $$5 = this.b().c();

      for (iu $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(fjj $$0, gqa $$1, iu $$2) {
      guc.a($$0, $$1, $$2, 1.0F, 0.0F, 0.0F, 0.15F);
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(fjj $$0, gqa $$1, String $$2, iu $$3, int $$4) {
      double $$5 = (double)$$3.u() + 0.5;
      double $$6 = (double)$$3.v() + 1.3;
      double $$7 = (double)$$3.w() + 0.5;
      guc.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private fog b() {
      return this.c.j.k();
   }
}
