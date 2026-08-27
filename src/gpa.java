import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gpa implements goo {
   private final int a;
   private final List<bnc.b<goo>> b;
   private final goo c;

   public gpa(List<bnc.b<goo>> $$0) {
      this.b = $$0;
      this.a = bnd.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gcb> a(@Nullable dpy $$0, @Nullable ir $$1, ayd $$2) {
      return bnd.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gmo e() {
      return this.c.e();
   }

   @Override
   public gcn f() {
      return this.c.f();
   }

   @Override
   public gcl g() {
      return this.c.g();
   }

   public static class a {
      private final List<bnc.b<goo>> a = Lists.newArrayList();

      public gpa.a a(@Nullable goo $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bnc.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public goo a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (goo)(this.a.size() == 1 ? this.a.get(0).b() : new gpa(this.a));
         }
      }
   }
}
