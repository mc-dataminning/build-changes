import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gsb implements grp {
   private final int a;
   private final List<bos.b<grp>> b;
   private final grp c;

   public gsb(List<bos.b<grp>> $$0) {
      this.b = $$0;
      this.a = bot.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gfa> a(@Nullable dsk $$0, @Nullable jf $$1, ayo $$2) {
      return bot.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gpo e() {
      return this.c.e();
   }

   @Override
   public gfm f() {
      return this.c.f();
   }

   @Override
   public gfk g() {
      return this.c.g();
   }

   public static class a {
      private final List<bos.b<grp>> a = Lists.newArrayList();

      public gsb.a a(@Nullable grp $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bos.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public grp a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (grp)(this.a.size() == 1 ? this.a.get(0).b() : new gsb(this.a));
         }
      }
   }
}
