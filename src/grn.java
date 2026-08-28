import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grn implements grb {
   private final int a;
   private final List<bph.b<grb>> b;
   private final grb c;

   public grn(List<bph.b<grb>> $$0) {
      this.b = $$0;
      this.a = bpi.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gem> a(@Nullable dsd $$0, @Nullable je $$1, azh $$2) {
      return bpi.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gpa e() {
      return this.c.e();
   }

   @Override
   public gey f() {
      return this.c.f();
   }

   @Override
   public gew g() {
      return this.c.g();
   }

   public static class a {
      private final List<bph.b<grb>> a = Lists.newArrayList();

      public grn.a a(@Nullable grb $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bph.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public grb a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (grb)(this.a.size() == 1 ? this.a.get(0).b() : new grn(this.a));
         }
      }
   }
}
