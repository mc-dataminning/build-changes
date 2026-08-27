import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gpl implements goz {
   private final int a;
   private final List<bny.b<goz>> b;
   private final goz c;

   public gpl(List<bny.b<goz>> $$0) {
      this.b = $$0;
      this.a = bnz.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gcl> a(@Nullable dqh $$0, @Nullable is $$1, ayg $$2) {
      return bnz.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gmy e() {
      return this.c.e();
   }

   @Override
   public gcx f() {
      return this.c.f();
   }

   @Override
   public gcv g() {
      return this.c.g();
   }

   public static class a {
      private final List<bny.b<goz>> a = Lists.newArrayList();

      public gpl.a a(@Nullable goz $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bny.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public goz a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (goz)(this.a.size() == 1 ? this.a.get(0).b() : new gpl(this.a));
         }
      }
   }
}
