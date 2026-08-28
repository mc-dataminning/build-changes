import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gsx implements gsk {
   private final int a;
   private final List<bpd.b<gsk>> b;
   private final gsk c;

   public gsx(List<bpd.b<gsk>> $$0) {
      this.b = $$0;
      this.a = bpe.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gfu> a(@Nullable dtc $$0, @Nullable ji $$1, ayw $$2) {
      return bpe.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gqj e() {
      return this.c.e();
   }

   @Override
   public ggg f() {
      return this.c.f();
   }

   @Override
   public gge g() {
      return this.c.g();
   }

   public static class a {
      private final List<bpd.b<gsk>> a = Lists.newArrayList();

      public gsx.a a(@Nullable gsk $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpd.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gsk a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gsk)(this.a.size() == 1 ? this.a.get(0).b() : new gsx(this.a));
         }
      }
   }
}
