import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class of implements nz {
   private final oa b;
   private final dar c;
   private final cwm d;
   private final dbb e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dal.a<?> j;

   private of(oa $$0, dar $$1, dgi $$2, dbb $$3, float $$4, int $$5, dal.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dal> of a(dbb $$0, oa $$1, dgi $$2, float $$3, int $$4, dbp<T> $$5, dal.a<T> $$6) {
      return new of($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static of a(dbb $$0, oa $$1, dgi $$2, float $$3, int $$4) {
      return new of($$1, dar.a, $$2, $$0, $$3, $$4, daq::new);
   }

   public static of b(dbb $$0, oa $$1, dgi $$2, float $$3, int $$4) {
      return new of($$1, c($$2), $$2, $$0, $$3, $$4, dao::new);
   }

   public static of c(dbb $$0, oa $$1, dgi $$2, float $$3, int $$4) {
      return new of($$1, b($$2), $$2, $$0, $$3, $$4, dbz::new);
   }

   public static of d(dbb $$0, oa $$1, dgi $$2, float $$3, int $$4) {
      return new of($$1, dar.a, $$2, $$0, $$3, $$4, dce::new);
   }

   public of b(String $$0, aq<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public of b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cwm a() {
      return this.d;
   }

   @Override
   public void a(ob $$0, aku<dbf<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dal $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cwq(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dar b(dgi $$0) {
      if ($$0.j().g().b(kv.w)) {
         return dar.a;
      } else {
         return $$0.j() instanceof cuw ? dar.b : dar.c;
      }
   }

   private static dar c(dgi $$0) {
      return $$0.j() instanceof cuw ? dar.b : dar.c;
   }

   private static dar a(dbp<? extends dal> $$0, dgi $$1) {
      if ($$0 == dbp.o) {
         return b($$1);
      } else if ($$0 == dbp.p) {
         return c($$1);
      } else if ($$0 != dbp.q && $$0 != dbp.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dar.a;
      }
   }

   private void a(aku<dbf<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
