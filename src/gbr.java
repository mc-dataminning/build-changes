import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gbr implements gbf {
   private final int a;
   private final List<bfk.b<gbf>> b;
   private final gbf c;

   public gbr(List<bfk.b<gbf>> $$0) {
      this.b = $$0;
      this.a = bfl.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fpb> a(@Nullable dfj $$0, @Nullable ha $$1, asc $$2) {
      return bfl.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public fze e() {
      return this.c.e();
   }

   @Override
   public fpn f() {
      return this.c.f();
   }

   @Override
   public fpl g() {
      return this.c.g();
   }

   public static class a {
      private final List<bfk.b<gbf>> a = Lists.newArrayList();

      public gbr.a a(@Nullable gbf $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bfk.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gbf a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gbf)(this.a.size() == 1 ? this.a.get(0).b() : new gbr(this.a));
         }
      }
   }
}
