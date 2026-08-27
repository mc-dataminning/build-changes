import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gnv implements gnj {
   private final int a;
   private final List<bmm.b<gnj>> b;
   private final gnj c;

   public gnv(List<bmm.b<gnj>> $$0) {
      this.b = $$0;
      this.a = bmn.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gaw> a(@Nullable doz $$0, @Nullable ih $$1, axr $$2) {
      return bmn.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public glj e() {
      return this.c.e();
   }

   @Override
   public gbi f() {
      return this.c.f();
   }

   @Override
   public gbg g() {
      return this.c.g();
   }

   public static class a {
      private final List<bmm.b<gnj>> a = Lists.newArrayList();

      public gnv.a a(@Nullable gnj $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bmm.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gnj a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gnj)(this.a.size() == 1 ? this.a.get(0).b() : new gnv(this.a));
         }
      }
   }
}
