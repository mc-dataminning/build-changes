import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pf implements oz {
   private final pa b;
   private final dbq c;
   private final cxl d;
   private final dca e;
   private final float f;
   private final int g;
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dbk.a<?> j;

   private pf(pa $$0, dbq $$1, dhh $$2, dca $$3, float $$4, int $$5, dbk.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dbk> pf a(dca $$0, pa $$1, dhh $$2, float $$3, int $$4, dco<T> $$5, dbk.a<T> $$6) {
      return new pf($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static pf a(dca $$0, pa $$1, dhh $$2, float $$3, int $$4) {
      return new pf($$1, dbq.a, $$2, $$0, $$3, $$4, dbp::new);
   }

   public static pf b(dca $$0, pa $$1, dhh $$2, float $$3, int $$4) {
      return new pf($$1, c($$2), $$2, $$0, $$3, $$4, dbn::new);
   }

   public static pf c(dca $$0, pa $$1, dhh $$2, float $$3, int $$4) {
      return new pf($$1, b($$2), $$2, $$0, $$3, $$4, dcy::new);
   }

   public static pf d(dca $$0, pa $$1, dhh $$2, float $$3, int $$4) {
      return new pf($$1, dbq.a, $$2, $$0, $$3, $$4, ddd::new);
   }

   public pf b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public pf b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cxl a() {
      return this.d;
   }

   @Override
   public void a(pb $$0, aly<dce<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.h.forEach($$2::a);
      dbk $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cxp(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dbq b(dhh $$0) {
      if ($$0.j().g().b(ku.w)) {
         return dbq.a;
      } else {
         return $$0.j() instanceof cvv ? dbq.b : dbq.c;
      }
   }

   private static dbq c(dhh $$0) {
      return $$0.j() instanceof cvv ? dbq.b : dbq.c;
   }

   private static dbq a(dco<? extends dbk> $$0, dhh $$1) {
      if ($$0 == dco.o) {
         return b($$1);
      } else if ($$0 == dco.p) {
         return c($$1);
      } else if ($$0 != dco.q && $$0 != dco.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dbq.a;
      }
   }

   private void a(aly<dce<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
