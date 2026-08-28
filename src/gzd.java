import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gzd implements gym {
   private final int a;
   private final List<bpw.b<gym>> b;
   private final gym c;

   public gzd(List<bpw.b<gym>> $$0) {
      this.b = $$0;
      this.a = bpx.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<ghx> a(@Nullable dua $$0, @Nullable jj $$1, azk $$2) {
      return bpx.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gwk e() {
      return this.c.e();
   }

   @Override
   public gij f() {
      return this.c.f();
   }

   @Override
   public gih g() {
      return this.c.g();
   }

   public static class a {
      private final Builder<bpw.b<gym>> a = ImmutableList.builder();

      public gzd.a a(@Nullable gym $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpw.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gym a() {
         List<bpw.b<gym>> $$0 = this.a.build();
         if ($$0.isEmpty()) {
            return null;
         } else {
            return (gym)($$0.size() == 1 ? $$0.getFirst().b() : new gzd($$0));
         }
      }
   }
}
