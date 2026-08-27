import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gqi implements gpw {
   private final int a;
   private final List<boi.b<gpw>> b;
   private final gpw c;

   public gqi(List<boi.b<gpw>> $$0) {
      this.b = $$0;
      this.a = boj.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gdh> a(@Nullable drd $$0, @Nullable it $$1, aym $$2) {
      return boj.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gnv e() {
      return this.c.e();
   }

   @Override
   public gdt f() {
      return this.c.f();
   }

   @Override
   public gdr g() {
      return this.c.g();
   }

   public static class a {
      private final List<boi.b<gpw>> a = Lists.newArrayList();

      public gqi.a a(@Nullable gpw $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(boi.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gpw a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gpw)(this.a.size() == 1 ? this.a.get(0).b() : new gqi(this.a));
         }
      }
   }
}
