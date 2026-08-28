import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class lt {
   private final dex a;
   final Map<lt.b, dex> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   lt(dex $$0) {
      this.a = $$0;
   }

   public dex a() {
      return this.a;
   }

   public Map<lt.b, dex> b() {
      return this.b;
   }

   public dex a(lt.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return azt.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return azt.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final lt a;

      public a(dex $$0) {
         this.a = new lt($$0);
      }

      public lt a() {
         return this.a;
      }

      public lt.a a(dex $$0) {
         this.a.b.put(lt.b.a, $$0);
         return this;
      }

      public lt.a b(dex $$0) {
         this.a.b.put(lt.b.b, $$0);
         return this;
      }

      public lt.a c(dex $$0) {
         this.a.b.put(lt.b.j, $$0);
         return this;
      }

      public lt.a d(dex $$0) {
         this.a.b.put(lt.b.c, $$0);
         return this;
      }

      public lt.a e(dex $$0) {
         this.a.b.put(lt.b.d, $$0);
         return this;
      }

      public lt.a f(dex $$0) {
         this.a.b.put(lt.b.e, $$0);
         return this;
      }

      public lt.a g(dex $$0) {
         this.a.b.put(lt.b.f, $$0);
         return this;
      }

      public lt.a h(dex $$0) {
         this.a.b.put(lt.b.g, $$0);
         return this;
      }

      public lt.a i(dex $$0) {
         this.a.b.put(lt.b.h, $$0);
         return this;
      }

      public lt.a j(dex $$0) {
         this.a.b.put(lt.b.i, $$0);
         return this;
      }

      public lt.a a(dex $$0, dex $$1) {
         this.a.b.put(lt.b.k, $$0);
         this.a.b.put(lt.b.r, $$1);
         return this;
      }

      public lt.a k(dex $$0) {
         this.a.b.put(lt.b.l, $$0);
         return this;
      }

      public lt.a l(dex $$0) {
         this.a.b.put(lt.b.m, $$0);
         return this;
      }

      public lt.a m(dex $$0) {
         this.a.b.put(lt.b.n, $$0);
         return this;
      }

      public lt.a n(dex $$0) {
         this.a.b.put(lt.b.o, $$0);
         return this;
      }

      public lt.a o(dex $$0) {
         this.a.b.put(lt.b.p, $$0);
         return this;
      }

      public lt.a p(dex $$0) {
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
