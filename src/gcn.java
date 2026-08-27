import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gcn implements gcb {
   private final int a;
   private final List<bgn.b<gcb>> b;
   private final gcb c;

   public gcn(List<bgn.b<gcb>> $$0) {
      this.b = $$0;
      this.a = bgo.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fpx> a(@Nullable dgb $$0, @Nullable hx $$1, ate $$2) {
      return bgo.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
   }

   @Override
   public boolean a() {
      return this.c.a();
   }

   @Override
   public boolean b() {
      return this.c.b();
   }

   @Override
   public boolean c() {
      return this.c.c();
   }

   @Override
   public boolean d() {
      return this.c.d();
   }

   @Override
   public gaa e() {
      return this.c.e();
   }

   @Override
   public fqj f() {
      return this.c.f();
   }

   @Override
   public fqh g() {
      return this.c.g();
   }

   public static class a {
      private final List<bgn.b<gcb>> a = Lists.newArrayList();

      public gcn.a a(@Nullable gcb $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bgn.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gcb a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gcb)(this.a.size() == 1 ? this.a.get(0).b() : new gcn(this.a));
         }
      }
   }
}
