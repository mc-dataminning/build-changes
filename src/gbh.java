import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gbh implements gav {
   private final int a;
   private final List<bfc.b<gav>> b;
   private final gav c;

   public gbh(List<bfc.b<gav>> $$0) {
      this.b = $$0;
      this.a = bfd.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<foq> a(@Nullable dez $$0, @Nullable ha $$1, aru $$2) {
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
   public fyu e() {
      return this.c.e();
   }

   @Override
   public fpd f() {
      return this.c.f();
   }

   @Override
   public fpb g() {
      return this.c.g();
   }

   public static class a {
      private final List<bfc.b<gav>> a = Lists.newArrayList();

      public gbh.a a(@Nullable gav $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bfc.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gav a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gav)(this.a.size() == 1 ? this.a.get(0).b() : new gbh(this.a));
         }
      }
   }
}
