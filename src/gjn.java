import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gjn implements gjb {
   private final int a;
   private final List<bki.b<gjb>> b;
   private final gjb c;

   public gjn(List<bki.b<gjb>> $$0) {
      this.b = $$0;
      this.a = bkj.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fwq> a(@Nullable dlj $$0, @Nullable ie $$1, awp $$2) {
      return bkj.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public ghb e() {
      return this.c.e();
   }

   @Override
   public fxc f() {
      return this.c.f();
   }

   @Override
   public fxa g() {
      return this.c.g();
   }

   public static class a {
      private final List<bki.b<gjb>> a = Lists.newArrayList();

      public gjn.a a(@Nullable gjb $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bki.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gjb a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gjb)(this.a.size() == 1 ? this.a.get(0).b() : new gjn(this.a));
         }
      }
   }
}
