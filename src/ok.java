import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements oe {
   private final of b;
   private final ddq c;
   private final czj d;
   private final dea e;
   private final float f;
   private final int g;
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final ddk.a<?> j;

   private ok(of $$0, ddq $$1, djl $$2, dea $$3, float $$4, int $$5, ddk.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends ddk> ok a(dea $$0, of $$1, djl $$2, float $$3, int $$4, deo<T> $$5, ddk.a<T> $$6) {
      return new ok($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ok a(dea $$0, of $$1, djl $$2, float $$3, int $$4) {
      return new ok($$1, ddq.a, $$2, $$0, $$3, $$4, ddp::new);
   }

   public static ok b(dea $$0, of $$1, djl $$2, float $$3, int $$4) {
      return new ok($$1, c($$2), $$2, $$0, $$3, $$4, ddn::new);
   }

   public static ok c(dea $$0, of $$1, djl $$2, float $$3, int $$4) {
      return new ok($$1, b($$2), $$2, $$0, $$3, $$4, dey::new);
   }

   public static ok d(dea $$0, of $$1, djl $$2, float $$3, int $$4) {
      return new ok($$1, ddq.a, $$2, $$0, $$3, $$4, dfd::new);
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
   public czj a() {
      return this.d;
   }

   @Override
   public void a(og $$0, alf<dee<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$2::a);
      ddk $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new czn(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static ddq b(djl $$0) {
      if ($$0.h().f().c(kk.v)) {
         return ddq.a;
      } else {
         return $$0.h() instanceof cxv ? ddq.b : ddq.c;
      }
   }

   private static ddq c(djl $$0) {
      return $$0.h() instanceof cxv ? ddq.b : ddq.c;
   }

   private static ddq a(deo<? extends ddk> $$0, djl $$1) {
      if ($$0 == deo.o) {
         return b($$1);
      } else if ($$0 == deo.p) {
         return c($$1);
      } else if ($$0 != deo.q && $$0 != deo.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return ddq.a;
      }
   }

   private void a(alf<dee<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
