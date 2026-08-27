import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gbt implements gbh {
   private final int a;
   private final List<bfm.b<gbh>> b;
   private final gbh c;

   public gbt(List<bfm.b<gbh>> $$0) {
      this.b = $$0;
      this.a = bfn.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fpd> a(@Nullable dfl $$0, @Nullable hc $$1, ase $$2) {
      return bfn.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public fzg e() {
      return this.c.e();
   }

   @Override
   public fpp f() {
      return this.c.f();
   }

   @Override
   public fpn g() {
      return this.c.g();
   }

   public static class a {
      private final List<bfm.b<gbh>> a = Lists.newArrayList();

      public gbt.a a(@Nullable gbh $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bfm.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gbh a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gbh)(this.a.size() == 1 ? this.a.get(0).b() : new gbt(this.a));
         }
      }
   }
}
