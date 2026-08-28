import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements oe {
   private final of b;
   private final deb c;
   private final czu d;
   private final del e;
   private final float f;
   private final int g;
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final ddv.a<?> j;

   private ok(of $$0, deb $$1, djw $$2, del $$3, float $$4, int $$5, ddv.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends ddv> ok a(del $$0, of $$1, djw $$2, float $$3, int $$4, dez<T> $$5, ddv.a<T> $$6) {
      return new ok($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ok a(del $$0, of $$1, djw $$2, float $$3, int $$4) {
      return new ok($$1, deb.a, $$2, $$0, $$3, $$4, dea::new);
   }

   public static ok b(del $$0, of $$1, djw $$2, float $$3, int $$4) {
      return new ok($$1, c($$2), $$2, $$0, $$3, $$4, ddy::new);
   }

   public static ok c(del $$0, of $$1, djw $$2, float $$3, int $$4) {
      return new ok($$1, b($$2), $$2, $$0, $$3, $$4, dfj::new);
   }

   public static ok d(del $$0, of $$1, djw $$2, float $$3, int $$4) {
      return new ok($$1, deb.a, $$2, $$0, $$3, $$4, dfo::new);
   }

   public ok b(String $$0, ar<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ok b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public czu a() {
      return this.d;
   }

   @Override
   public void a(og $$0, alh<dep<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$2::a);
      ddv $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new czy(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static deb b(djw $$0) {
      if ($$0.h().f().c(kk.v)) {
         return deb.a;
      } else {
         return $$0.h() instanceof cyg ? deb.b : deb.c;
      }
   }

   private static deb c(djw $$0) {
      return $$0.h() instanceof cyg ? deb.b : deb.c;
   }

   private static deb a(dez<? extends ddv> $$0, djw $$1) {
      if ($$0 == dez.o) {
         return b($$1);
      } else if ($$0 == dez.p) {
         return c($$1);
      } else if ($$0 != dez.q && $$0 != dez.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return deb.a;
      }
   }

   private void a(alh<dep<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
