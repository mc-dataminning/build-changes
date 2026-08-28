import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final cyk c;
   private final cuk d;
   private final cys e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cye.a<?> j;

   private ou(op $$0, cyk $$1, dbx $$2, cys $$3, float $$4, int $$5, cye.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cye> ou a(cys $$0, op $$1, dbx $$2, float $$3, int $$4, cyz<T> $$5, cye.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(cys $$0, op $$1, dbx $$2, float $$3, int $$4) {
      return new ou($$1, cyk.a, $$2, $$0, $$3, $$4, cyj::new);
   }

   public static ou b(cys $$0, op $$1, dbx $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, cyh::new);
   }

   public static ou c(cys $$0, op $$1, dbx $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, czk::new);
   }

   public static ou d(cys $$0, op $$1, dbx $$2, float $$3, int $$4) {
      return new ou($$1, cyk.a, $$2, $$0, $$3, $$4, czo::new);
   }

   public ou b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ou b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cuk a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cye $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cup(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cyk b(dbx $$0) {
      if ($$0.r().p().b(km.v)) {
         return cyk.a;
      } else {
         return $$0.r() instanceof csn ? cyk.b : cyk.c;
      }
   }

   private static cyk c(dbx $$0) {
      return $$0.r() instanceof csn ? cyk.b : cyk.c;
   }

   private static cyk a(cyz<? extends cye> $$0, dbx $$1) {
      if ($$0 == cyz.p) {
         return b($$1);
      } else if ($$0 == cyz.q) {
         return c($$1);
      } else if ($$0 != cyz.r && $$0 != cyz.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyk.a;
      }
   }

   private void a(alf $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
