import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gro implements grc {
   private final int a;
   private final List<bpi.b<grc>> b;
   private final grc c;

   public gro(List<bpi.b<grc>> $$0) {
      this.b = $$0;
      this.a = bpj.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gen> a(@Nullable dse $$0, @Nullable je $$1, azh $$2) {
      return bpj.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gpb e() {
      return this.c.e();
   }

   @Override
   public gez f() {
      return this.c.f();
   }

   @Override
   public gex g() {
      return this.c.g();
   }

   public static class a {
      private final List<bpi.b<grc>> a = Lists.newArrayList();

      public gro.a a(@Nullable grc $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpi.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public grc a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (grc)(this.a.size() == 1 ? this.a.get(0).b() : new gro(this.a));
         }
      }
   }
}
