import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gkl implements gjz {
   private final int a;
   private final List<bkx.b<gjz>> b;
   private final gjz c;

   public gkl(List<bkx.b<gjz>> $$0) {
      this.b = $$0;
      this.a = bky.a($$0);
      this.c = $$0.get(0).b();
   }

   @Override
   public List<fxn> a(@Nullable dme $$0, @Nullable ih $$1, awt $$2) {
      return bky.a(this.b, Math.abs((int)$$2.g()) % this.a).map($$3 -> $$3.b().a($$0, $$1, $$2)).orElse(Collections.emptyList());
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
   public ghz e() {
      return this.c.e();
   }

   @Override
   public fxz f() {
      return this.c.f();
   }

   @Override
   public fxx g() {
      return this.c.g();
   }

   public static class a {
      private final List<bkx.b<gjz>> a = Lists.newArrayList();

      public gkl.a a(@Nullable gjz $$0, int $$1) {
         if ($$0 != null) {
            this.a.add(bkx.a($$0, $$1));
         }

         return this;
      }

      @Nullable
      public gjz a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            return (gjz)(this.a.size() == 1 ? this.a.get(0).b() : new gkl(this.a));
         }
      }
   }
}
