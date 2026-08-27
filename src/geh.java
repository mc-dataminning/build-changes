import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class geh implements gdv {
   private final int a;
   private final List<bhj.b<gdv>> b;
   private final gdv c;

   public geh(List<bhj.b<gdv>> $$0) {
      this.b = $$0;
      this.a = bhk.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<frr> a(@Nullable dhi $$0, @Nullable hx $$1, ats $$2) {
      return bhk.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gbu e() {
      return this.c.e();
   }

   @Override
   public fsd f() {
      return this.c.f();
   }

   @Override
   public fsb g() {
      return this.c.g();
   }

   public static class a {
      private final List<bhj.b<gdv>> a = Lists.newArrayList();

      public geh.a a(@Nullable gdv $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bhj.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gdv a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gdv)(this.a.size() == 1 ? this.a.get(0).b() : new geh(this.a));
         }
      }
   }
}
