import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class of implements nz {
   private final oa b;
   private final dap c;
   private final cwk d;
   private final daz e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final daj.a<?> j;

   private of(oa $$0, dap $$1, dgg $$2, daz $$3, float $$4, int $$5, daj.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends daj> of a(daz $$0, oa $$1, dgg $$2, float $$3, int $$4, dbn<T> $$5, daj.a<T> $$6) {
      return new of($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static of a(daz $$0, oa $$1, dgg $$2, float $$3, int $$4) {
      return new of($$1, dap.a, $$2, $$0, $$3, $$4, dao::new);
   }

   public static of b(daz $$0, oa $$1, dgg $$2, float $$3, int $$4) {
      return new of($$1, c($$2), $$2, $$0, $$3, $$4, dam::new);
   }

   public static of c(daz $$0, oa $$1, dgg $$2, float $$3, int $$4) {
      return new of($$1, b($$2), $$2, $$0, $$3, $$4, dbx::new);
   }

   public static of d(daz $$0, oa $$1, dgg $$2, float $$3, int $$4) {
      return new of($$1, dap.a, $$2, $$0, $$3, $$4, dcc::new);
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
   public cwk a() {
      return this.d;
   }

   @Override
   public void a(ob $$0, aku<dbd<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      daj $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cwo(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dap b(dgg $$0) {
      if ($$0.j().g().b(kv.w)) {
         return dap.a;
      } else {
         return $$0.j() instanceof cuu ? dap.b : dap.c;
      }
   }

   private static dap c(dgg $$0) {
      return $$0.j() instanceof cuu ? dap.b : dap.c;
   }

   private static dap a(dbn<? extends daj> $$0, dgg $$1) {
      if ($$0 == dbn.o) {
         return b($$1);
      } else if ($$0 == dbn.p) {
         return c($$1);
      } else if ($$0 != dbn.q && $$0 != dbn.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dap.a;
      }
   }

   private void a(aku<dbd<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
