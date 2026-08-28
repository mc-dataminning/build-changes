import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pf implements oz {
   private final pa b;
   private final dbp c;
   private final cxk d;
   private final dbz e;
   private final float f;
   private final int g;
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dbj.a<?> j;

   private pf(pa $$0, dbp $$1, dhg $$2, dbz $$3, float $$4, int $$5, dbj.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dbj> pf a(dbz $$0, pa $$1, dhg $$2, float $$3, int $$4, dcn<T> $$5, dbj.a<T> $$6) {
      return new pf($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static pf a(dbz $$0, pa $$1, dhg $$2, float $$3, int $$4) {
      return new pf($$1, dbp.a, $$2, $$0, $$3, $$4, dbo::new);
   }

   public static pf b(dbz $$0, pa $$1, dhg $$2, float $$3, int $$4) {
      return new pf($$1, c($$2), $$2, $$0, $$3, $$4, dbm::new);
   }

   public static pf c(dbz $$0, pa $$1, dhg $$2, float $$3, int $$4) {
      return new pf($$1, b($$2), $$2, $$0, $$3, $$4, dcx::new);
   }

   public static pf d(dbz $$0, pa $$1, dhg $$2, float $$3, int $$4) {
      return new pf($$1, dbp.a, $$2, $$0, $$3, $$4, ddc::new);
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
   public cxk a() {
      return this.d;
   }

   @Override
   public void a(pb $$0, aly<dcd<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.h.forEach($$2::a);
      dbj $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cxo(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dbp b(dhg $$0) {
      if ($$0.j().g().b(ku.w)) {
         return dbp.a;
      } else {
         return $$0.j() instanceof cvu ? dbp.b : dbp.c;
      }
   }

   private static dbp c(dhg $$0) {
      return $$0.j() instanceof cvu ? dbp.b : dbp.c;
   }

   private static dbp a(dcn<? extends dbj> $$0, dhg $$1) {
      if ($$0 == dcn.o) {
         return b($$1);
      } else if ($$0 == dcn.p) {
         return c($$1);
      } else if ($$0 != dcn.q && $$0 != dcn.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dbp.a;
      }
   }

   private void a(aly<dcd<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
