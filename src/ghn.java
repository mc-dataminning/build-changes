import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ghn implements ghb {
   private final int a;
   private final List<bio.b<ghb>> b;
   private final ghb c;

   public ghn(List<bio.b<ghb>> $$0) {
      this.b = $$0;
      this.a = bip.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fuq> a(@Nullable djp $$0, @Nullable ic $$1, auw $$2) {
      return bip.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gfb e() {
      return this.c.e();
   }

   @Override
   public fvc f() {
      return this.c.f();
   }

   @Override
   public fva g() {
      return this.c.g();
   }

   public static class a {
      private final List<bio.b<ghb>> a = Lists.newArrayList();

      public ghn.a a(@Nullable ghb $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bio.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public ghb a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (ghb)(this.a.size() == 1 ? this.a.get(0).b() : new ghn(this.a));
         }
      }
   }
}
