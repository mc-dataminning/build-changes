import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gss implements gsg {
   private final int a;
   private final List<bpc.b<gsg>> b;
   private final gsg c;

   public gss(List<bpc.b<gsg>> $$0) {
      this.b = $$0;
      this.a = bpd.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gfq> a(@Nullable dta $$0, @Nullable ji $$1, ayv $$2) {
      return bpd.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gqf e() {
      return this.c.e();
   }

   @Override
   public ggc f() {
      return this.c.f();
   }

   @Override
   public gga g() {
      return this.c.g();
   }

   public static class a {
      private final List<bpc.b<gsg>> a = Lists.newArrayList();

      public gss.a a(@Nullable gsg $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpc.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gsg a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gsg)(this.a.size() == 1 ? this.a.get(0).b() : new gss(this.a));
         }
      }
   }
}
