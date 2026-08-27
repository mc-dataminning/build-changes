import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gbm implements gba {
   private final int a;
   private final List<bff.b<gba>> b;
   private final gba c;

   public gbm(List<bff.b<gba>> $$0) {
      this.b = $$0;
      this.a = bfg.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fow> a(@Nullable dfe $$0, @Nullable hc $$1, arx $$2) {
      return bfg.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public fyz e() {
      return this.c.e();
   }

   @Override
   public fpi f() {
      return this.c.f();
   }

   @Override
   public fpg g() {
      return this.c.g();
   }

   public static class a {
      private final List<bff.b<gba>> a = Lists.newArrayList();

      public gbm.a a(@Nullable gba $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bff.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gba a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gba)(this.a.size() == 1 ? this.a.get(0).b() : new gbm(this.a));
         }
      }
   }
}
