import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class my implements ms {
   private final mt b;
   private final cpa c;
   private final cmc d;
   private final cpi e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cou.a<?> j;

   private my(mt $$0, cpa $$1, csx $$2, cpi $$3, float $$4, int $$5, cou.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cou> my a(cpi $$0, mt $$1, csx $$2, float $$3, int $$4, cpp<T> $$5, cou.a<T> $$6) {
      return new my($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static my a(cpi $$0, mt $$1, csx $$2, float $$3, int $$4) {
      return new my($$1, cpa.a, $$2, $$0, $$3, $$4, coz::new);
   }

   public static my b(cpi $$0, mt $$1, csx $$2, float $$3, int $$4) {
      return new my($$1, c($$2), $$2, $$0, $$3, $$4, cox::new);
   }

   public static my c(cpi $$0, mt $$1, csx $$2, float $$3, int $$4) {
      return new my($$1, b($$2), $$2, $$0, $$3, $$4, cqa::new);
   }

   public static my d(cpi $$0, mt $$1, csx $$2, float $$3, int $$4) {
      return new my($$1, cpa.a, $$2, $$0, $$3, $$4, cqe::new);
   }

   public my b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public my b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cmc a() {
      return this.d;
   }

   @Override
   public void a(mu $$0, agt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cou $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cmh(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cpa b(csx $$0) {
      if ($$0.k().u()) {
         return cpa.a;
      } else {
         return $$0.k() instanceof cka ? cpa.b : cpa.c;
      }
   }

   private static cpa c(csx $$0) {
      return $$0.k() instanceof cka ? cpa.b : cpa.c;
   }

   private static cpa a(cpp<? extends cou> $$0, csx $$1) {
      if ($$0 == cpp.p) {
         return b($$1);
      } else if ($$0 == cpp.q) {
         return c($$1);
      } else if ($$0 != cpp.r && $$0 != cpp.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cpa.a;
      }
   }

   private void a(agt $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
