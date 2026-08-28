import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class or implements ol {
   private final om b;
   private final cyn c;
   private final cul d;
   private final cyw e;
   private final float f;
   private final int g;
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cyh.a<?> j;

   private or(om $$0, cyn $$1, dcv $$2, cyw $$3, float $$4, int $$5, cyh.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cyh> or a(cyw $$0, om $$1, dcv $$2, float $$3, int $$4, cze<T> $$5, cyh.a<T> $$6) {
      return new or($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static or a(cyw $$0, om $$1, dcv $$2, float $$3, int $$4) {
      return new or($$1, cyn.a, $$2, $$0, $$3, $$4, cym::new);
   }

   public static or b(cyw $$0, om $$1, dcv $$2, float $$3, int $$4) {
      return new or($$1, c($$2), $$2, $$0, $$3, $$4, cyk::new);
   }

   public static or c(cyw $$0, om $$1, dcv $$2, float $$3, int $$4) {
      return new or($$1, b($$2), $$2, $$0, $$3, $$4, czq::new);
   }

   public static or d(cyw $$0, om $$1, dcv $$2, float $$3, int $$4) {
      return new or($$1, cyn.a, $$2, $$0, $$3, $$4, czv::new);
   }

   public or b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public or b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cul a() {
      return this.d;
   }

   @Override
   public void a(on $$0, akr $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$2::a);
      cyh $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cuq(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static cyn b(dcv $$0) {
      if ($$0.r().p().b(kq.v)) {
         return cyn.a;
      } else {
         return $$0.r() instanceof cso ? cyn.b : cyn.c;
      }
   }

   private static cyn c(dcv $$0) {
      return $$0.r() instanceof cso ? cyn.b : cyn.c;
   }

   private static cyn a(cze<? extends cyh> $$0, dcv $$1) {
      if ($$0 == cze.p) {
         return b($$1);
      } else if ($$0 == cze.q) {
         return c($$1);
      } else if ($$0 != cze.r && $$0 != cze.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyn.a;
      }
   }

   private void a(akr $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
