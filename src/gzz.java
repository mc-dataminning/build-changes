import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gzz implements gzi {
   private final int a;
   private final List<bqe.b<gzi>> b;
   private final gzi c;

   public gzz(List<bqe.b<gzi>> $$0) {
      this.b = $$0;
      this.a = bqf.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gir> a(@Nullable dus $$0, @Nullable jk $$1, azn $$2) {
      return bqf.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gxg e() {
      return this.c.e();
   }

   @Override
   public gjd f() {
      return this.c.f();
   }

   @Override
   public gjb g() {
      return this.c.g();
   }

   public static class a {
      private final Builder<bqe.b<gzi>> a = ImmutableList.builder();

      public gzz.a a(@Nullable gzi $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bqe.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gzi a() {
         List<bqe.b<gzi>> $$0 = this.a.build();
         if ($$0.isEmpty()) {
            return null;
         } else {
            return (gzi)($$0.size() == 1 ? $$0.getFirst().b() : new gzz($$0));
         }
      }
   }
}
