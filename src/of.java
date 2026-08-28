import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class of implements nz {
   private final oa b;
   private final dao c;
   private final cwj d;
   private final day e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dai.a<?> j;

   private of(oa $$0, dao $$1, dgf $$2, day $$3, float $$4, int $$5, dai.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dai> of a(day $$0, oa $$1, dgf $$2, float $$3, int $$4, dbm<T> $$5, dai.a<T> $$6) {
      return new of($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static of a(day $$0, oa $$1, dgf $$2, float $$3, int $$4) {
      return new of($$1, dao.a, $$2, $$0, $$3, $$4, dan::new);
   }

   public static of b(day $$0, oa $$1, dgf $$2, float $$3, int $$4) {
      return new of($$1, c($$2), $$2, $$0, $$3, $$4, dal::new);
   }

   public static of c(day $$0, oa $$1, dgf $$2, float $$3, int $$4) {
      return new of($$1, b($$2), $$2, $$0, $$3, $$4, dbw::new);
   }

   public static of d(day $$0, oa $$1, dgf $$2, float $$3, int $$4) {
      return new of($$1, dao.a, $$2, $$0, $$3, $$4, dcb::new);
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
   public cwj a() {
      return this.d;
   }

   @Override
   public void a(ob $$0, akt<dbc<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dai $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cwn(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dao b(dgf $$0) {
      if ($$0.j().g().b(kv.w)) {
         return dao.a;
      } else {
         return $$0.j() instanceof cut ? dao.b : dao.c;
      }
   }

   private static dao c(dgf $$0) {
      return $$0.j() instanceof cut ? dao.b : dao.c;
   }

   private static dao a(dbm<? extends dai> $$0, dgf $$1) {
      if ($$0 == dbm.o) {
         return b($$1);
      } else if ($$0 == dbm.p) {
         return c($$1);
      } else if ($$0 != dbm.q && $$0 != dbm.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dao.a;
      }
   }

   private void a(akt<dbc<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
