import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gzu implements gzd {
   private final int a;
   private final List<bqb.b<gzd>> b;
   private final gzd c;

   public gzu(List<bqb.b<gzd>> $$0) {
      this.b = $$0;
      this.a = bqc.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gim> a(@Nullable duo $$0, @Nullable jj $$1, azl $$2) {
      return bqc.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gxb e() {
      return this.c.e();
   }

   @Override
   public giy f() {
      return this.c.f();
   }

   @Override
   public giw g() {
      return this.c.g();
   }

   public static class a {
      private final Builder<bqb.b<gzd>> a = ImmutableList.builder();

      public gzu.a a(@Nullable gzd $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bqb.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gzd a() {
         List<bqb.b<gzd>> $$0 = this.a.build();
         if ($$0.isEmpty()) {
            return null;
         } else {
            return (gzd)($$0.size() == 1 ? $$0.getFirst().b() : new gzu($$0));
         }
      }
   }
}
