import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ggy implements ggm {
   private final int a;
   private final List<bim.b<ggm>> b;
   private final ggm c;

   public ggy(List<bim.b<ggm>> $$0) {
      this.b = $$0;
      this.a = bin.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fud> a(@Nullable djg $$0, @Nullable ic $$1, auu $$2) {
      return bin.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gem e() {
      return this.c.e();
   }

   @Override
   public fup f() {
      return this.c.f();
   }

   @Override
   public fun g() {
      return this.c.g();
   }

   public static class a {
      private final List<bim.b<ggm>> a = Lists.newArrayList();

      public ggy.a a(@Nullable ggm $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bim.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public ggm a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (ggm)(this.a.size() == 1 ? this.a.get(0).b() : new ggy(this.a));
         }
      }
   }
}
