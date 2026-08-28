import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class mk {
   private final dnc a;
   final Map<mk.b, dnc> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   mk(dnc $$0) {
      this.a = $$0;
   }

   public dnc a() {
      return this.a;
   }

   public Map<mk.b, dnc> b() {
      return this.b;
   }

   public dnc a(mk.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return ban.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return ban.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final mk a;

      public a(dnc $$0) {
         this.a = new mk($$0);
      }

      public mk a() {
         return this.a;
      }

      public mk.a a(dnc $$0) {
         this.a.b.put(mk.b.a, $$0);
         return this;
      }

      public mk.a b(dnc $$0) {
         this.a.b.put(mk.b.b, $$0);
         return this;
      }

      public mk.a c(dnc $$0) {
         this.a.b.put(mk.b.j, $$0);
         return this;
      }

      public mk.a d(dnc $$0) {
         this.a.b.put(mk.b.c, $$0);
         return this;
      }

      public mk.a e(dnc $$0) {
         this.a.b.put(mk.b.d, $$0);
         return this;
      }

      public mk.a f(dnc $$0) {
         this.a.b.put(mk.b.e, $$0);
         return this;
      }

      public mk.a g(dnc $$0) {
         this.a.b.put(mk.b.f, $$0);
         return this;
      }

      public mk.a h(dnc $$0) {
         this.a.b.put(mk.b.g, $$0);
         return this;
      }

      public mk.a i(dnc $$0) {
         this.a.b.put(mk.b.h, $$0);
         return this;
      }

      public mk.a j(dnc $$0) {
         this.a.b.put(mk.b.i, $$0);
         return this;
      }

      public mk.a a(dnc $$0, dnc $$1) {
         this.a.b.put(mk.b.k, $$0);
         this.a.b.put(mk.b.r, $$1);
         return this;
      }

      public mk.a k(dnc $$0) {
         this.a.b.put(mk.b.l, $$0);
         return this;
      }

      public mk.a l(dnc $$0) {
         this.a.b.put(mk.b.m, $$0);
         return this;
      }

      public mk.a m(dnc $$0) {
         this.a.b.put(mk.b.n, $$0);
         return this;
      }

      public mk.a n(dnc $$0) {
         this.a.b.put(mk.b.o, $$0);
         return this;
      }

      public mk.a o(dnc $$0) {
         this.a.b.put(mk.b.p, $$0);
         return this;
      }

      public mk.a p(dnc $$0) {
         this.a.b.put(mk.b.q, $$0);
         return this;
      }

      public mk.a b() {
         this.a.c = false;
         return this;
      }

      public mk.a c() {
         this.a.d = false;
         return this;
      }

      public mk.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public mk.a b(String $$0) {
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
