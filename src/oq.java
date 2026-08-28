import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oq implements ok {
   private final ol b;
   private final cyl c;
   private final cuj d;
   private final cyu e;
   private final float f;
   private final int g;
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cyf.a<?> j;

   private oq(ol $$0, cyl $$1, dct $$2, cyu $$3, float $$4, int $$5, cyf.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cyf> oq a(cyu $$0, ol $$1, dct $$2, float $$3, int $$4, czc<T> $$5, cyf.a<T> $$6) {
      return new oq($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oq a(cyu $$0, ol $$1, dct $$2, float $$3, int $$4) {
      return new oq($$1, cyl.a, $$2, $$0, $$3, $$4, cyk::new);
   }

   public static oq b(cyu $$0, ol $$1, dct $$2, float $$3, int $$4) {
      return new oq($$1, c($$2), $$2, $$0, $$3, $$4, cyi::new);
   }

   public static oq c(cyu $$0, ol $$1, dct $$2, float $$3, int $$4) {
      return new oq($$1, b($$2), $$2, $$0, $$3, $$4, czo::new);
   }

   public static oq d(cyu $$0, ol $$1, dct $$2, float $$3, int $$4) {
      return new oq($$1, cyl.a, $$2, $$0, $$3, $$4, czt::new);
   }

   public oq b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oq b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cuj a() {
      return this.d;
   }

   @Override
   public void a(om $$0, akq $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$2::a);
      cyf $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cuo(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static cyl b(dct $$0) {
      if ($$0.r().p().b(kq.v)) {
         return cyl.a;
      } else {
         return $$0.r() instanceof csm ? cyl.b : cyl.c;
      }
   }

   private static cyl c(dct $$0) {
      return $$0.r() instanceof csm ? cyl.b : cyl.c;
   }

   private static cyl a(czc<? extends cyf> $$0, dct $$1) {
      if ($$0 == czc.p) {
         return b($$1);
      } else if ($$0 == czc.q) {
         return c($$1);
      } else if ($$0 != czc.r && $$0 != czc.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyl.a;
      }
   }

   private void a(akq $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
