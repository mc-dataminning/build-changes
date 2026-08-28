import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grm implements gra {
   private final int a;
   private final List<bpg.b<gra>> b;
   private final gra c;

   public grm(List<bpg.b<gra>> $$0) {
      this.b = $$0;
      this.a = bph.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gel> a(@Nullable dsc $$0, @Nullable je $$1, azh $$2) {
      return bph.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public goz e() {
      return this.c.e();
   }

   @Override
   public gex f() {
      return this.c.f();
   }

   @Override
   public gev g() {
      return this.c.g();
   }

   public static class a {
      private final List<bpg.b<gra>> a = Lists.newArrayList();

      public grm.a a(@Nullable gra $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpg.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gra a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gra)(this.a.size() == 1 ? this.a.get(0).b() : new grm(this.a));
         }
      }
   }
}
