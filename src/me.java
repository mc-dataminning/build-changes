import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class me {
   private final dke a;
   final Map<me.b, dke> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   me(dke $$0) {
      this.a = $$0;
   }

   public dke a() {
      return this.a;
   }

   public Map<me.b, dke> b() {
      return this.b;
   }

   public dke a(me.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bbb.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bbb.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final me a;

      public a(dke $$0) {
         this.a = new me($$0);
      }

      public me a() {
         return this.a;
      }

      public me.a a(dke $$0) {
         this.a.b.put(me.b.a, $$0);
         return this;
      }

      public me.a b(dke $$0) {
         this.a.b.put(me.b.b, $$0);
         return this;
      }

      public me.a c(dke $$0) {
         this.a.b.put(me.b.j, $$0);
         return this;
      }

      public me.a d(dke $$0) {
         this.a.b.put(me.b.c, $$0);
         return this;
      }

      public me.a e(dke $$0) {
         this.a.b.put(me.b.d, $$0);
         return this;
      }

      public me.a f(dke $$0) {
         this.a.b.put(me.b.e, $$0);
         return this;
      }

      public me.a g(dke $$0) {
         this.a.b.put(me.b.f, $$0);
         return this;
      }

      public me.a h(dke $$0) {
         this.a.b.put(me.b.g, $$0);
         return this;
      }

      public me.a i(dke $$0) {
         this.a.b.put(me.b.h, $$0);
         return this;
      }

      public me.a j(dke $$0) {
         this.a.b.put(me.b.i, $$0);
         return this;
      }

      public me.a a(dke $$0, dke $$1) {
         this.a.b.put(me.b.k, $$0);
         this.a.b.put(me.b.r, $$1);
         return this;
      }

      public me.a k(dke $$0) {
         this.a.b.put(me.b.l, $$0);
         return this;
      }

      public me.a l(dke $$0) {
         this.a.b.put(me.b.m, $$0);
         return this;
      }

      public me.a m(dke $$0) {
         this.a.b.put(me.b.n, $$0);
         return this;
      }

      public me.a n(dke $$0) {
         this.a.b.put(me.b.o, $$0);
         return this;
      }

      public me.a o(dke $$0) {
         this.a.b.put(me.b.p, $$0);
         return this;
      }

      public me.a p(dke $$0) {
         this.a.b.put(me.b.q, $$0);
         return this;
      }

      public me.a b() {
         this.a.c = false;
         return this;
      }

      public me.a c() {
         this.a.d = false;
         return this;
      }

      public me.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public me.a b(String $$0) {
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
