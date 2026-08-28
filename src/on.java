import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class on implements oh {
   private final oi b;
   private final cxx c;
   private final cty d;
   private final cyg e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cxr.a<?> j;

   private on(oi $$0, cxx $$1, dcf $$2, cyg $$3, float $$4, int $$5, cxr.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cxr> on a(cyg $$0, oi $$1, dcf $$2, float $$3, int $$4, cyo<T> $$5, cxr.a<T> $$6) {
      return new on($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static on a(cyg $$0, oi $$1, dcf $$2, float $$3, int $$4) {
      return new on($$1, cxx.a, $$2, $$0, $$3, $$4, cxw::new);
   }

   public static on b(cyg $$0, oi $$1, dcf $$2, float $$3, int $$4) {
      return new on($$1, c($$2), $$2, $$0, $$3, $$4, cxu::new);
   }

   public static on c(cyg $$0, oi $$1, dcf $$2, float $$3, int $$4) {
      return new on($$1, b($$2), $$2, $$0, $$3, $$4, cza::new);
   }

   public static on d(cyg $$0, oi $$1, dcf $$2, float $$3, int $$4) {
      return new on($$1, cxx.a, $$2, $$0, $$3, $$4, czf::new);
   }

   public on b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public on b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cty a() {
      return this.d;
   }

   @Override
   public void a(oj $$0, akk $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cxr $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cud(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cxx b(dcf $$0) {
      if ($$0.r().p().b(kn.v)) {
         return cxx.a;
      } else {
         return $$0.r() instanceof csc ? cxx.b : cxx.c;
      }
   }

   private static cxx c(dcf $$0) {
      return $$0.r() instanceof csc ? cxx.b : cxx.c;
   }

   private static cxx a(cyo<? extends cxr> $$0, dcf $$1) {
      if ($$0 == cyo.p) {
         return b($$1);
      } else if ($$0 == cyo.q) {
         return c($$1);
      } else if ($$0 != cyo.r && $$0 != cyo.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cxx.a;
      }
   }

   private void a(akk $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
