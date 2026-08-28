import com.google.common.collect.Sets;
import java.util.Set;

public class git implements gig.a {
   private static final int a = 60;
   private final Set<kf> b = Sets.newHashSet();

   git() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(kf $$0) {
      this.b.add($$0);
   }

   public void b(kf $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fbc $$0, get $$1, double $$2, double $$3, double $$4) {
      jd $$5 = jd.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fbc $$0, get $$1, kf $$2) {
      gig.a($$0, $$1, $$2.q(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
