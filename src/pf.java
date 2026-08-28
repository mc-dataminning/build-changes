import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pf implements oz {
   private final pa b;
   private final dbm c;
   private final cxg d;
   private final dbv e;
   private final float f;
   private final int g;
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dbf.a<?> j;

   private pf(pa $$0, dbm $$1, dgz $$2, dbv $$3, float $$4, int $$5, dbf.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dbf> pf a(dbv $$0, pa $$1, dgz $$2, float $$3, int $$4, dci<T> $$5, dbf.a<T> $$6) {
      return new pf($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static pf a(dbv $$0, pa $$1, dgz $$2, float $$3, int $$4) {
      return new pf($$1, dbm.a, $$2, $$0, $$3, $$4, dbl::new);
   }

   public static pf b(dbv $$0, pa $$1, dgz $$2, float $$3, int $$4) {
      return new pf($$1, c($$2), $$2, $$0, $$3, $$4, dbj::new);
   }

   public static pf c(dbv $$0, pa $$1, dgz $$2, float $$3, int $$4) {
      return new pf($$1, b($$2), $$2, $$0, $$3, $$4, dcs::new);
   }

   public static pf d(dbv $$0, pa $$1, dgz $$2, float $$3, int $$4) {
      return new pf($$1, dbm.a, $$2, $$0, $$3, $$4, dcx::new);
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
   public cxg a() {
      return this.d;
   }

   @Override
   public void a(pb $$0, aly<dbz<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.h.forEach($$2::a);
      dbf $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cxk(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dbm b(dgz $$0) {
      if ($$0.j().g().b(ku.w)) {
         return dbm.a;
      } else {
         return $$0.j() instanceof cvq ? dbm.b : dbm.c;
      }
   }

   private static dbm c(dgz $$0) {
      return $$0.j() instanceof cvq ? dbm.b : dbm.c;
   }

   private static dbm a(dci<? extends dbf> $$0, dgz $$1) {
      if ($$0 == dci.o) {
         return b($$1);
      } else if ($$0 == dci.p) {
         return c($$1);
      } else if ($$0 != dci.q && $$0 != dci.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dbm.a;
      }
   }

   private void a(aly<dbz<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
