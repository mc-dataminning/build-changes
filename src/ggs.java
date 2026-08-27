import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ggs implements ggg {
   private final int a;
   private final List<bih.b<ggg>> b;
   private final ggg c;

   public ggs(List<bih.b<ggg>> $$0) {
      this.b = $$0;
      this.a = bii.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<ftw> a(@Nullable dja $$0, @Nullable ic $$1, aup $$2) {
      return bii.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gef e() {
      return this.c.e();
   }

   @Override
   public fui f() {
      return this.c.f();
   }

   @Override
   public fug g() {
      return this.c.g();
   }

   public static class a {
      private final List<bih.b<ggg>> a = Lists.newArrayList();

      public ggs.a a(@Nullable ggg $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bih.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public ggg a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (ggg)(this.a.size() == 1 ? this.a.get(0).b() : new ggs(this.a));
         }
      }
   }
}
