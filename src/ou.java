import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final czu c;
   private final cvk d;
   private final dad e;
   private final float f;
   private final int g;
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final czo.a<?> j;

   private ou(op $$0, czu $$1, def $$2, dad $$3, float $$4, int $$5, czo.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.q();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends czo> ou a(dad $$0, op $$1, def $$2, float $$3, int $$4, dam<T> $$5, czo.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(dad $$0, op $$1, def $$2, float $$3, int $$4) {
      return new ou($$1, czu.a, $$2, $$0, $$3, $$4, czt::new);
   }

   public static ou b(dad $$0, op $$1, def $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, czr::new);
   }

   public static ou c(dad $$0, op $$1, def $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, day::new);
   }

   public static ou d(dad $$0, op $$1, def $$2, float $$3, int $$4) {
      return new ou($$1, czu.a, $$2, $$0, $$3, $$4, dbd::new);
   }

   public ou b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ou b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cvk a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alc $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$2::a);
      czo $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cvp(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static czu b(def $$0) {
      if ($$0.q().o().b(kr.v)) {
         return czu.a;
      } else {
         return $$0.q() instanceof ctr ? czu.b : czu.c;
      }
   }

   private static czu c(def $$0) {
      return $$0.q() instanceof ctr ? czu.b : czu.c;
   }

   private static czu a(dam<? extends czo> $$0, def $$1) {
      if ($$0 == dam.o) {
         return b($$1);
      } else if ($$0 == dam.p) {
         return c($$1);
      } else if ($$0 != dam.q && $$0 != dam.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return czu.a;
      }
   }

   private void a(alc $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
