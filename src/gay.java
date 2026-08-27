import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gay implements gam {
   private final int a;
   private final List<bfc.b<gam>> b;
   private final gam c;

   public gay(List<bfc.b<gam>> $$0) {
      this.b = $$0;
      this.a = bfd.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<foh> a(@Nullable dfa $$0, @Nullable ha $$1, aru $$2) {
      return bfd.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public fyl e() {
      return this.c.e();
   }

   @Override
   public fou f() {
      return this.c.f();
   }

   @Override
   public fos g() {
      return this.c.g();
   }

   public static class a {
      private final List<bfc.b<gam>> a = Lists.newArrayList();

      public gay.a a(@Nullable gam $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bfc.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gam a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gam)(this.a.size() == 1 ? this.a.get(0).b() : new gay(this.a));
         }
      }
   }
}
