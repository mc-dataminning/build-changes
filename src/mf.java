import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class mf {
   private final djm a;
   final Map<mf.b, djm> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   mf(djm $$0) {
      this.a = $$0;
   }

   public djm a() {
      return this.a;
   }

   public Map<mf.b, djm> b() {
      return this.b;
   }

   public djm a(mf.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return azw.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return azw.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final mf a;

      public a(djm $$0) {
         this.a = new mf($$0);
      }

      public mf a() {
         return this.a;
      }

      public mf.a a(djm $$0) {
         this.a.b.put(mf.b.a, $$0);
         return this;
      }

      public mf.a b(djm $$0) {
         this.a.b.put(mf.b.b, $$0);
         return this;
      }

      public mf.a c(djm $$0) {
         this.a.b.put(mf.b.j, $$0);
         return this;
      }

      public mf.a d(djm $$0) {
         this.a.b.put(mf.b.c, $$0);
         return this;
      }

      public mf.a e(djm $$0) {
         this.a.b.put(mf.b.d, $$0);
         return this;
      }

      public mf.a f(djm $$0) {
         this.a.b.put(mf.b.e, $$0);
         return this;
      }

      public mf.a g(djm $$0) {
         this.a.b.put(mf.b.f, $$0);
         return this;
      }

      public mf.a h(djm $$0) {
         this.a.b.put(mf.b.g, $$0);
         return this;
      }

      public mf.a i(djm $$0) {
         this.a.b.put(mf.b.h, $$0);
         return this;
      }

      public mf.a j(djm $$0) {
         this.a.b.put(mf.b.i, $$0);
         return this;
      }

      public mf.a a(djm $$0, djm $$1) {
         this.a.b.put(mf.b.k, $$0);
         this.a.b.put(mf.b.r, $$1);
         return this;
      }

      public mf.a k(djm $$0) {
         this.a.b.put(mf.b.l, $$0);
         return this;
      }

      public mf.a l(djm $$0) {
         this.a.b.put(mf.b.m, $$0);
         return this;
      }

      public mf.a m(djm $$0) {
         this.a.b.put(mf.b.n, $$0);
         return this;
      }

      public mf.a n(djm $$0) {
         this.a.b.put(mf.b.o, $$0);
         return this;
      }

      public mf.a o(djm $$0) {
         this.a.b.put(mf.b.p, $$0);
         return this;
      }

      public mf.a p(djm $$0) {
         this.a.b.put(mf.b.q, $$0);
         return this;
      }

      public mf.a b() {
         this.a.c = false;
         return this;
      }

      public mf.a c() {
         this.a.d = false;
         return this;
      }

      public mf.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public mf.a b(String $$0) {
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
