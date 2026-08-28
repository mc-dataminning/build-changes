import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class on implements oh {
   private final oi b;
   private final cxw c;
   private final ctx d;
   private final cyf e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cxq.a<?> j;

   private on(oi $$0, cxw $$1, dce $$2, cyf $$3, float $$4, int $$5, cxq.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cxq> on a(cyf $$0, oi $$1, dce $$2, float $$3, int $$4, cyn<T> $$5, cxq.a<T> $$6) {
      return new on($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static on a(cyf $$0, oi $$1, dce $$2, float $$3, int $$4) {
      return new on($$1, cxw.a, $$2, $$0, $$3, $$4, cxv::new);
   }

   public static on b(cyf $$0, oi $$1, dce $$2, float $$3, int $$4) {
      return new on($$1, c($$2), $$2, $$0, $$3, $$4, cxt::new);
   }

   public static on c(cyf $$0, oi $$1, dce $$2, float $$3, int $$4) {
      return new on($$1, b($$2), $$2, $$0, $$3, $$4, cyz::new);
   }

   public static on d(cyf $$0, oi $$1, dce $$2, float $$3, int $$4) {
      return new on($$1, cxw.a, $$2, $$0, $$3, $$4, cze::new);
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
   public ctx a() {
      return this.d;
   }

   @Override
   public void a(oj $$0, akk $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cxq $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cuc(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cxw b(dce $$0) {
      if ($$0.r().p().b(kn.v)) {
         return cxw.a;
      } else {
         return $$0.r() instanceof csb ? cxw.b : cxw.c;
      }
   }

   private static cxw c(dce $$0) {
      return $$0.r() instanceof csb ? cxw.b : cxw.c;
   }

   private static cxw a(cyn<? extends cxq> $$0, dce $$1) {
      if ($$0 == cyn.p) {
         return b($$1);
      } else if ($$0 == cyn.q) {
         return c($$1);
      } else if ($$0 != cyn.r && $$0 != cyn.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cxw.a;
      }
   }

   private void a(akk $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
