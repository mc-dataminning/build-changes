import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oz implements ot {
   private final ou b;
   private final dac c;
   private final cvx d;
   private final dal e;
   private final float f;
   private final int g;
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final czw.a<?> j;

   private oz(ou $$0, dac $$1, dfa $$2, dal $$3, float $$4, int $$5, czw.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends czw> oz a(dal $$0, ou $$1, dfa $$2, float $$3, int $$4, dau<T> $$5, czw.a<T> $$6) {
      return new oz($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oz a(dal $$0, ou $$1, dfa $$2, float $$3, int $$4) {
      return new oz($$1, dac.a, $$2, $$0, $$3, $$4, dab::new);
   }

   public static oz b(dal $$0, ou $$1, dfa $$2, float $$3, int $$4) {
      return new oz($$1, c($$2), $$2, $$0, $$3, $$4, czz::new);
   }

   public static oz c(dal $$0, ou $$1, dfa $$2, float $$3, int $$4) {
      return new oz($$1, b($$2), $$2, $$0, $$3, $$4, dbg::new);
   }

   public static oz d(dal $$0, ou $$1, dfa $$2, float $$3, int $$4) {
      return new oz($$1, dac.a, $$2, $$0, $$3, $$4, dbl::new);
   }

   public oz b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oz b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cvx a() {
      return this.d;
   }

   @Override
   public void a(ov $$0, ali $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.h.forEach($$2::a);
      czw $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cwb(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static dac b(dfa $$0) {
      if ($$0.j().g().b(ku.w)) {
         return dac.a;
      } else {
         return $$0.j() instanceof cuh ? dac.b : dac.c;
      }
   }

   private static dac c(dfa $$0) {
      return $$0.j() instanceof cuh ? dac.b : dac.c;
   }

   private static dac a(dau<? extends czw> $$0, dfa $$1) {
      if ($$0 == dau.o) {
         return b($$1);
      } else if ($$0 == dau.p) {
         return c($$1);
      } else if ($$0 != dau.q && $$0 != dau.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dac.a;
      }
   }

   private void a(ali $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
