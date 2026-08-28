import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pa implements ou {
   private final ov b;
   private final dag c;
   private final cwb d;
   private final dap e;
   private final float f;
   private final int g;
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final daa.a<?> j;

   private pa(ov $$0, dag $$1, dfe $$2, dap $$3, float $$4, int $$5, daa.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends daa> pa a(dap $$0, ov $$1, dfe $$2, float $$3, int $$4, day<T> $$5, daa.a<T> $$6) {
      return new pa($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static pa a(dap $$0, ov $$1, dfe $$2, float $$3, int $$4) {
      return new pa($$1, dag.a, $$2, $$0, $$3, $$4, daf::new);
   }

   public static pa b(dap $$0, ov $$1, dfe $$2, float $$3, int $$4) {
      return new pa($$1, c($$2), $$2, $$0, $$3, $$4, dad::new);
   }

   public static pa c(dap $$0, ov $$1, dfe $$2, float $$3, int $$4) {
      return new pa($$1, b($$2), $$2, $$0, $$3, $$4, dbj::new);
   }

   public static pa d(dap $$0, ov $$1, dfe $$2, float $$3, int $$4) {
      return new pa($$1, dag.a, $$2, $$0, $$3, $$4, dbo::new);
   }

   public pa b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public pa b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cwb a() {
      return this.d;
   }

   @Override
   public void a(ow $$0, all $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.h.forEach($$2::a);
      daa $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cwf(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static dag b(dfe $$0) {
      if ($$0.j().g().b(ku.w)) {
         return dag.a;
      } else {
         return $$0.j() instanceof cul ? dag.b : dag.c;
      }
   }

   private static dag c(dfe $$0) {
      return $$0.j() instanceof cul ? dag.b : dag.c;
   }

   private static dag a(day<? extends daa> $$0, dfe $$1) {
      if ($$0 == day.o) {
         return b($$1);
      } else if ($$0 == day.p) {
         return c($$1);
      } else if ($$0 != day.q && $$0 != day.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dag.a;
      }
   }

   private void a(all $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
