import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gbn implements gbb {
   private final int a;
   private final List<bfq.b<gbb>> b;
   private final gbb c;

   public gbn(List<bfq.b<gbb>> $$0) {
      this.b = $$0;
      this.a = bfr.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fox> a(@Nullable dfd $$0, @Nullable ha $$1, ash $$2) {
      return bfr.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public fza e() {
      return this.c.e();
   }

   @Override
   public fpj f() {
      return this.c.f();
   }

   @Override
   public fph g() {
      return this.c.g();
   }

   public static class a {
      private final List<bfq.b<gbb>> a = Lists.newArrayList();

      public gbn.a a(@Nullable gbb $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bfq.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gbb a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gbb)(this.a.size() == 1 ? this.a.get(0).b() : new gbn(this.a));
         }
      }
   }
}
