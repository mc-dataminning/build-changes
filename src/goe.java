import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class goe implements gns {
   private final int a;
   private final List<bmr.b<gns>> b;
   private final gns c;

   public goe(List<bmr.b<gns>> $$0) {
      this.b = $$0;
      this.a = bms.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gbf> a(@Nullable dpi $$0, @Nullable ij $$1, axt $$2) {
      return bms.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gls e() {
      return this.c.e();
   }

   @Override
   public gbr f() {
      return this.c.f();
   }

   @Override
   public gbp g() {
      return this.c.g();
   }

   public static class a {
      private final List<bmr.b<gns>> a = Lists.newArrayList();

      public goe.a a(@Nullable gns $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bmr.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gns a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gns)(this.a.size() == 1 ? this.a.get(0).b() : new goe(this.a));
         }
      }
   }
}
