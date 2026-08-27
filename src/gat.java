import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gat implements gah {
   private final int a;
   private final List<bfa.b<gah>> b;
   private final gah c;

   public gat(List<bfa.b<gah>> $$0) {
      this.b = $$0;
      this.a = bfb.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<foc> a(@Nullable dey $$0, @Nullable hb $$1, art $$2) {
      return bfb.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public fyg e() {
      return this.c.e();
   }

   @Override
   public foo f() {
      return this.c.f();
   }

   @Override
   public fom g() {
      return this.c.g();
   }

   public static class a {
      private final List<bfa.b<gah>> a = Lists.newArrayList();

      public gat.a a(@Nullable gah $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bfa.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gah a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gah)(this.a.size() == 1 ? this.a.get(0).b() : new gat(this.a));
         }
      }
   }
}
