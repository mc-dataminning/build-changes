import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oy implements os {
   private final ot b;
   private final czw c;
   private final cvt d;
   private final daf e;
   private final float f;
   private final int g;
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final czq.a<?> j;

   private oy(ot $$0, czw $$1, deu $$2, daf $$3, float $$4, int $$5, czq.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends czq> oy a(daf $$0, ot $$1, deu $$2, float $$3, int $$4, dao<T> $$5, czq.a<T> $$6) {
      return new oy($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oy a(daf $$0, ot $$1, deu $$2, float $$3, int $$4) {
      return new oy($$1, czw.a, $$2, $$0, $$3, $$4, czv::new);
   }

   public static oy b(daf $$0, ot $$1, deu $$2, float $$3, int $$4) {
      return new oy($$1, c($$2), $$2, $$0, $$3, $$4, czt::new);
   }

   public static oy c(daf $$0, ot $$1, deu $$2, float $$3, int $$4) {
      return new oy($$1, b($$2), $$2, $$0, $$3, $$4, dba::new);
   }

   public static oy d(daf $$0, ot $$1, deu $$2, float $$3, int $$4) {
      return new oy($$1, czw.a, $$2, $$0, $$3, $$4, dbf::new);
   }

   public oy b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oy b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cvt a() {
      return this.d;
   }

   @Override
   public void a(ou $$0, alh $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", du.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$2::a);
      czq $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cvx(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static czw b(deu $$0) {
      if ($$0.j().g().b(kt.w)) {
         return czw.a;
      } else {
         return $$0.j() instanceof cuc ? czw.b : czw.c;
      }
   }

   private static czw c(deu $$0) {
      return $$0.j() instanceof cuc ? czw.b : czw.c;
   }

   private static czw a(dao<? extends czq> $$0, deu $$1) {
      if ($$0 == dao.o) {
         return b($$1);
      } else if ($$0 == dao.p) {
         return c($$1);
      } else if ($$0 != dao.q && $$0 != dao.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return czw.a;
      }
   }

   private void a(alh $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
