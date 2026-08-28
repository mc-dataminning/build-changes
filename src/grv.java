import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grv implements grj {
   private final int a;
   private final List<bop.b<grj>> b;
   private final grj c;

   public grv(List<bop.b<grj>> $$0) {
      this.b = $$0;
      this.a = boq.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<geu> a(@Nullable dsh $$0, @Nullable jf $$1, aym $$2) {
      return boq.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gpi e() {
      return this.c.e();
   }

   @Override
   public gfg f() {
      return this.c.f();
   }

   @Override
   public gfe g() {
      return this.c.g();
   }

   public static class a {
      private final List<bop.b<grj>> a = Lists.newArrayList();

      public grv.a a(@Nullable grj $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bop.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public grj a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (grj)(this.a.size() == 1 ? this.a.get(0).b() : new grv(this.a));
         }
      }
   }
}
