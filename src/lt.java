import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class lt {
   private final dey a;
   final Map<lt.b, dey> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   lt(dey $$0) {
      this.a = $$0;
   }

   public dey a() {
      return this.a;
   }

   public Map<lt.b, dey> b() {
      return this.b;
   }

   public dey a(lt.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return azu.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return azu.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final lt a;

      public a(dey $$0) {
         this.a = new lt($$0);
      }

      public lt a() {
         return this.a;
      }

      public lt.a a(dey $$0) {
         this.a.b.put(lt.b.a, $$0);
         return this;
      }

      public lt.a b(dey $$0) {
         this.a.b.put(lt.b.b, $$0);
         return this;
      }

      public lt.a c(dey $$0) {
         this.a.b.put(lt.b.j, $$0);
         return this;
      }

      public lt.a d(dey $$0) {
         this.a.b.put(lt.b.c, $$0);
         return this;
      }

      public lt.a e(dey $$0) {
         this.a.b.put(lt.b.d, $$0);
         return this;
      }

      public lt.a f(dey $$0) {
         this.a.b.put(lt.b.e, $$0);
         return this;
      }

      public lt.a g(dey $$0) {
         this.a.b.put(lt.b.f, $$0);
         return this;
      }

      public lt.a h(dey $$0) {
         this.a.b.put(lt.b.g, $$0);
         return this;
      }

      public lt.a i(dey $$0) {
         this.a.b.put(lt.b.h, $$0);
         return this;
      }

      public lt.a j(dey $$0) {
         this.a.b.put(lt.b.i, $$0);
         return this;
      }

      public lt.a a(dey $$0, dey $$1) {
         this.a.b.put(lt.b.k, $$0);
         this.a.b.put(lt.b.r, $$1);
         return this;
      }

      public lt.a k(dey $$0) {
         this.a.b.put(lt.b.l, $$0);
         return this;
      }

      public lt.a l(dey $$0) {
         this.a.b.put(lt.b.m, $$0);
         return this;
      }

      public lt.a m(dey $$0) {
         this.a.b.put(lt.b.n, $$0);
         return this;
      }

      public lt.a n(dey $$0) {
         this.a.b.put(lt.b.o, $$0);
         return this;
      }

      public lt.a o(dey $$0) {
         this.a.b.put(lt.b.p, $$0);
         return this;
      }

      public lt.a p(dey $$0) {
         this.a.b.put(lt.b.q, $$0);
         return this;
      }

      public lt.a b() {
         this.a.c = false;
         return this;
      }

      public lt.a c() {
         this.a.d = false;
         return this;
      }

      public lt.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public lt.a b(String $$0) {
         this.a.f = $$0;
         return this;
      }
   }

   public static enum b {
      a("button"),
      b("chiseled"),
      c("cracked"),
      d("cut"),
      e("door"),
      f("fence"),
      g("fence"),
      h("fence_gate"),
      i("fence_gate"),
      j("mosaic"),
      k("sign"),
      l("slab"),
      m("stairs"),
      n("pressure_plate"),
      o("polished"),
      p("trapdoor"),
      q("wall"),
      r("wall_sign");

      private final String s;

      private b(final String $$0) {
         this.s = $$0;
      }

      public String a() {
         return this.s;
      }
   }
}
