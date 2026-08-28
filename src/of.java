import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class of implements nz {
   private final oa b;
   private final daq c;
   private final cwl d;
   private final dba e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dak.a<?> j;

   private of(oa $$0, daq $$1, dgh $$2, dba $$3, float $$4, int $$5, dak.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dak> of a(dba $$0, oa $$1, dgh $$2, float $$3, int $$4, dbo<T> $$5, dak.a<T> $$6) {
      return new of($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static of a(dba $$0, oa $$1, dgh $$2, float $$3, int $$4) {
      return new of($$1, daq.a, $$2, $$0, $$3, $$4, dap::new);
   }

   public static of b(dba $$0, oa $$1, dgh $$2, float $$3, int $$4) {
      return new of($$1, c($$2), $$2, $$0, $$3, $$4, dan::new);
   }

   public static of c(dba $$0, oa $$1, dgh $$2, float $$3, int $$4) {
      return new of($$1, b($$2), $$2, $$0, $$3, $$4, dby::new);
   }

   public static of d(dba $$0, oa $$1, dgh $$2, float $$3, int $$4) {
      return new of($$1, daq.a, $$2, $$0, $$3, $$4, dcd::new);
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
   public cwl a() {
      return this.d;
   }

   @Override
   public void a(ob $$0, aku<dbe<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dak $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cwp(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static daq b(dgh $$0) {
      if ($$0.j().g().b(kv.w)) {
         return daq.a;
      } else {
         return $$0.j() instanceof cuv ? daq.b : daq.c;
      }
   }

   private static daq c(dgh $$0) {
      return $$0.j() instanceof cuv ? daq.b : daq.c;
   }

   private static daq a(dbo<? extends dak> $$0, dgh $$1) {
      if ($$0 == dbo.o) {
         return b($$1);
      } else if ($$0 == dbo.p) {
         return c($$1);
      } else if ($$0 != dbo.q && $$0 != dbo.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return daq.a;
      }
   }

   private void a(aku<dbe<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
