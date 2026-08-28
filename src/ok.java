import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements oe {
   private final of b;
   private final ddn c;
   private final czg d;
   private final ddx e;
   private final float f;
   private final int g;
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final ddh.a<?> j;

   private ok(of $$0, ddn $$1, djg $$2, ddx $$3, float $$4, int $$5, ddh.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends ddh> ok a(ddx $$0, of $$1, djg $$2, float $$3, int $$4, del<T> $$5, ddh.a<T> $$6) {
      return new ok($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ok a(ddx $$0, of $$1, djg $$2, float $$3, int $$4) {
      return new ok($$1, ddn.a, $$2, $$0, $$3, $$4, ddm::new);
   }

   public static ok b(ddx $$0, of $$1, djg $$2, float $$3, int $$4) {
      return new ok($$1, c($$2), $$2, $$0, $$3, $$4, ddk::new);
   }

   public static ok c(ddx $$0, of $$1, djg $$2, float $$3, int $$4) {
      return new ok($$1, b($$2), $$2, $$0, $$3, $$4, dev::new);
   }

   public static ok d(ddx $$0, of $$1, djg $$2, float $$3, int $$4) {
      return new ok($$1, ddn.a, $$2, $$0, $$3, $$4, dfa::new);
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
   public czg a() {
      return this.d;
   }

   @Override
   public void a(og $$0, alf<deb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$2::a);
      ddh $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new czk(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static ddn b(djg $$0) {
      if ($$0.h().f().c(kk.v)) {
         return ddn.a;
      } else {
         return $$0.h() instanceof cxs ? ddn.b : ddn.c;
      }
   }

   private static ddn c(djg $$0) {
      return $$0.h() instanceof cxs ? ddn.b : ddn.c;
   }

   private static ddn a(del<? extends ddh> $$0, djg $$1) {
      if ($$0 == del.o) {
         return b($$1);
      } else if ($$0 == del.p) {
         return c($$1);
      } else if ($$0 != del.q && $$0 != del.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return ddn.a;
      }
   }

   private void a(alf<deb<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
