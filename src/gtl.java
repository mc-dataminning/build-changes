import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gtl implements gsz {
   private final int a;
   private final List<bom.b<gsz>> b;
   private final gsz c;

   public gtl(List<bom.b<gsz>> $$0) {
      this.b = $$0;
      this.a = bon.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<ggd> a(@Nullable dtc $$0, @Nullable iw $$1, ayt $$2) {
      return bon.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gqy e() {
      return this.c.e();
   }

   @Override
   public ggp f() {
      return this.c.f();
   }

   @Override
   public ggn g() {
      return this.c.g();
   }

   public static class a {
      private final List<bom.b<gsz>> a = Lists.newArrayList();

      public gtl.a a(@Nullable gsz $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bom.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gsz a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gsz)(this.a.size() == 1 ? this.a.get(0).b() : new gtl(this.a));
         }
      }
   }
}
