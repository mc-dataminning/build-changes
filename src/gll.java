import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gll implements gkz {
   private final int a;
   private final List<blo.b<gkz>> b;
   private final gkz c;

   public gll(List<blo.b<gkz>> $$0) {
      this.b = $$0;
      this.a = blp.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fyn> a(@Nullable dmz $$0, @Nullable ih $$1, axd $$2) {
      return blp.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public giz e() {
      return this.c.e();
   }

   @Override
   public fyz f() {
      return this.c.f();
   }

   @Override
   public fyx g() {
      return this.c.g();
   }

   public static class a {
      private final List<blo.b<gkz>> a = Lists.newArrayList();

      public gll.a a(@Nullable gkz $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(blo.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gkz a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gkz)(this.a.size() == 1 ? this.a.get(0).b() : new gll(this.a));
         }
      }
   }
}
