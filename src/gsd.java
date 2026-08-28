import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gsd implements grr {
   private final int a;
   private final List<bot.b<grr>> b;
   private final grr c;

   public gsd(List<bot.b<grr>> $$0) {
      this.b = $$0;
      this.a = bou.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gfc> a(@Nullable dsl $$0, @Nullable jf $$1, ayo $$2) {
      return bou.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gpq e() {
      return this.c.e();
   }

   @Override
   public gfo f() {
      return this.c.f();
   }

   @Override
   public gfm g() {
      return this.c.g();
   }

   public static class a {
      private final List<bot.b<grr>> a = Lists.newArrayList();

      public gsd.a a(@Nullable grr $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bot.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public grr a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (grr)(this.a.size() == 1 ? this.a.get(0).b() : new gsd(this.a));
         }
      }
   }
}
