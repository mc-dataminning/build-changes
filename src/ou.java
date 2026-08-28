import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final cyj c;
   private final cuj d;
   private final cyr e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cyd.a<?> j;

   private ou(op $$0, cyj $$1, dbw $$2, cyr $$3, float $$4, int $$5, cyd.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cyd> ou a(cyr $$0, op $$1, dbw $$2, float $$3, int $$4, cyy<T> $$5, cyd.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(cyr $$0, op $$1, dbw $$2, float $$3, int $$4) {
      return new ou($$1, cyj.a, $$2, $$0, $$3, $$4, cyi::new);
   }

   public static ou b(cyr $$0, op $$1, dbw $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, cyg::new);
   }

   public static ou c(cyr $$0, op $$1, dbw $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, czj::new);
   }

   public static ou d(cyr $$0, op $$1, dbw $$2, float $$3, int $$4) {
      return new ou($$1, cyj.a, $$2, $$0, $$3, $$4, czn::new);
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
   public cuj a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, ale $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cyd $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cuo(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cyj b(dbw $$0) {
      if ($$0.r().p().b(km.v)) {
         return cyj.a;
      } else {
         return $$0.r() instanceof csm ? cyj.b : cyj.c;
      }
   }

   private static cyj c(dbw $$0) {
      return $$0.r() instanceof csm ? cyj.b : cyj.c;
   }

   private static cyj a(cyy<? extends cyd> $$0, dbw $$1) {
      if ($$0 == cyy.p) {
         return b($$1);
      } else if ($$0 == cyy.q) {
         return c($$1);
      } else if ($$0 != cyy.r && $$0 != cyy.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyj.a;
      }
   }

   private void a(ale $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
