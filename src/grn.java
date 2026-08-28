import com.google.common.collect.Sets;
import java.util.Set;

public class grn implements gqy.a {
   private static final int a = 60;
   private final Set<kk> b = Sets.newHashSet();

   grn() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(kk $$0) {
      this.b.add($$0);
   }

   public void b(kk $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fgr $$0, gmx $$1, double $$2, double $$3, double $$4) {
      ji $$5 = ji.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fgr $$0, gmx $$1, kk $$2) {
      gqy.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
