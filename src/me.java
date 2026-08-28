import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class me {
   private final dkm a;
   final Map<me.b, dkm> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   me(dkm $$0) {
      this.a = $$0;
   }

   public dkm a() {
      return this.a;
   }

   public Map<me.b, dkm> b() {
      return this.b;
   }

   public dkm a(me.b $$0) {
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

      public a(dkm $$0) {
         this.a = new me($$0);
      }

      public me a() {
         return this.a;
      }

      public me.a a(dkm $$0) {
         this.a.b.put(me.b.a, $$0);
         return this;
      }

      public me.a b(dkm $$0) {
         this.a.b.put(me.b.b, $$0);
         return this;
      }

      public me.a c(dkm $$0) {
         this.a.b.put(me.b.j, $$0);
         return this;
      }

      public me.a d(dkm $$0) {
         this.a.b.put(me.b.c, $$0);
         return this;
      }

      public me.a e(dkm $$0) {
         this.a.b.put(me.b.d, $$0);
         return this;
      }

      public me.a f(dkm $$0) {
         this.a.b.put(me.b.e, $$0);
         return this;
      }

      public me.a g(dkm $$0) {
         this.a.b.put(me.b.f, $$0);
         return this;
      }

      public me.a h(dkm $$0) {
         this.a.b.put(me.b.g, $$0);
         return this;
      }

      public me.a i(dkm $$0) {
         this.a.b.put(me.b.h, $$0);
         return this;
      }

      public me.a j(dkm $$0) {
         this.a.b.put(me.b.i, $$0);
         return this;
      }

      public me.a a(dkm $$0, dkm $$1) {
         this.a.b.put(me.b.k, $$0);
         this.a.b.put(me.b.r, $$1);
         return this;
      }

      public me.a k(dkm $$0) {
         this.a.b.put(me.b.l, $$0);
         return this;
      }

      public me.a l(dkm $$0) {
         this.a.b.put(me.b.m, $$0);
         return this;
      }

      public me.a m(dkm $$0) {
         this.a.b.put(me.b.n, $$0);
         return this;
      }

      public me.a n(dkm $$0) {
         this.a.b.put(me.b.o, $$0);
         return this;
      }

      public me.a o(dkm $$0) {
         this.a.b.put(me.b.p, $$0);
         return this;
      }

      public me.a p(dkm $$0) {
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
