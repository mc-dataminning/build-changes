import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gem implements gea {
   private final int a;
   private final List<bhn.b<gea>> b;
   private final gea c;

   public gem(List<bhn.b<gea>> $$0) {
      this.b = $$0;
      this.a = bho.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<frw> a(@Nullable dhn $$0, @Nullable ib $$1, atw $$2) {
      return bho.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public gbz e() {
      return this.c.e();
   }

   @Override
   public fsi f() {
      return this.c.f();
   }

   @Override
   public fsg g() {
      return this.c.g();
   }

   public static class a {
      private final List<bhn.b<gea>> a = Lists.newArrayList();

      public gem.a a(@Nullable gea $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bhn.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gea a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gea)(this.a.size() == 1 ? this.a.get(0).b() : new gem(this.a));
         }
      }
   }
}
