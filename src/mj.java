import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class mj {
   private final dmf a;
   final Map<mj.b, dmf> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   mj(dmf $$0) {
      this.a = $$0;
   }

   public dmf a() {
      return this.a;
   }

   public Map<mj.b, dmf> b() {
      return this.b;
   }

   public dmf a(mj.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bal.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bal.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final mj a;

      public a(dmf $$0) {
         this.a = new mj($$0);
      }

      public mj a() {
         return this.a;
      }

      public mj.a a(dmf $$0) {
         this.a.b.put(mj.b.a, $$0);
         return this;
      }

      public mj.a b(dmf $$0) {
         this.a.b.put(mj.b.b, $$0);
         return this;
      }

      public mj.a c(dmf $$0) {
         this.a.b.put(mj.b.j, $$0);
         return this;
      }

      public mj.a d(dmf $$0) {
         this.a.b.put(mj.b.c, $$0);
         return this;
      }

      public mj.a e(dmf $$0) {
         this.a.b.put(mj.b.d, $$0);
         return this;
      }

      public mj.a f(dmf $$0) {
         this.a.b.put(mj.b.e, $$0);
         return this;
      }

      public mj.a g(dmf $$0) {
         this.a.b.put(mj.b.f, $$0);
         return this;
      }

      public mj.a h(dmf $$0) {
         this.a.b.put(mj.b.g, $$0);
         return this;
      }

      public mj.a i(dmf $$0) {
         this.a.b.put(mj.b.h, $$0);
         return this;
      }

      public mj.a j(dmf $$0) {
         this.a.b.put(mj.b.i, $$0);
         return this;
      }

      public mj.a a(dmf $$0, dmf $$1) {
         this.a.b.put(mj.b.k, $$0);
         this.a.b.put(mj.b.r, $$1);
         return this;
      }

      public mj.a k(dmf $$0) {
         this.a.b.put(mj.b.l, $$0);
         return this;
      }

      public mj.a l(dmf $$0) {
         this.a.b.put(mj.b.m, $$0);
         return this;
      }

      public mj.a m(dmf $$0) {
         this.a.b.put(mj.b.n, $$0);
         return this;
      }

      public mj.a n(dmf $$0) {
         this.a.b.put(mj.b.o, $$0);
         return this;
      }

      public mj.a o(dmf $$0) {
         this.a.b.put(mj.b.p, $$0);
         return this;
      }

      public mj.a p(dmf $$0) {
         this.a.b.put(mj.b.q, $$0);
         return this;
      }

      public mj.a b() {
         this.a.c = false;
         return this;
      }

      public mj.a c() {
         this.a.d = false;
         return this;
      }

      public mj.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public mj.a b(String $$0) {
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
