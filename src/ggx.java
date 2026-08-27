import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ggx implements ggl {
   private final int a;
   private final List<bim.b<ggl>> b;
   private final ggl c;

   public ggx(List<bim.b<ggl>> $$0) {
      this.b = $$0;
      this.a = bin.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fuc> a(@Nullable djg $$0, @Nullable ic $$1, auu $$2) {
      return bin.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gel e() {
      return this.c.e();
   }

   @Override
   public fuo f() {
      return this.c.f();
   }

   @Override
   public fum g() {
      return this.c.g();
   }

   public static class a {
      private final List<bim.b<ggl>> a = Lists.newArrayList();

      public ggx.a a(@Nullable ggl $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bim.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public ggl a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (ggl)(this.a.size() == 1 ? this.a.get(0).b() : new ggx(this.a));
         }
      }
   }
}
