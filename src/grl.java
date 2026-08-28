import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class grl implements gqz {
   private final int a;
   private final List<bpf.b<gqz>> b;
   private final gqz c;

   public grl(List<bpf.b<gqz>> $$0) {
      this.b = $$0;
      this.a = bpg.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<gek> a(@Nullable dsb $$0, @Nullable je $$1, azg $$2) {
      return bpg.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public goy e() {
      return this.c.e();
   }

   @Override
   public gew f() {
      return this.c.f();
   }

   @Override
   public geu g() {
      return this.c.g();
   }

   public static class a {
      private final List<bpf.b<gqz>> a = Lists.newArrayList();

      public grl.a a(@Nullable gqz $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bpf.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gqz a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gqz)(this.a.size() == 1 ? this.a.get(0).b() : new grl(this.a));
         }
      }
   }
}
