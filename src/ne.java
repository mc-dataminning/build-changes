import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ne implements my {
   private final mz b;
   private final cru c;
   private final coy d;
   private final csc e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cro.a<?> j;

   private ne(mz $$0, cru $$1, cvq $$2, csc $$3, float $$4, int $$5, cro.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cro> ne a(csc $$0, mz $$1, cvq $$2, float $$3, int $$4, csj<T> $$5, cro.a<T> $$6) {
      return new ne($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ne a(csc $$0, mz $$1, cvq $$2, float $$3, int $$4) {
      return new ne($$1, cru.a, $$2, $$0, $$3, $$4, crt::new);
   }

   public static ne b(csc $$0, mz $$1, cvq $$2, float $$3, int $$4) {
      return new ne($$1, c($$2), $$2, $$0, $$3, $$4, crr::new);
   }

   public static ne c(csc $$0, mz $$1, cvq $$2, float $$3, int $$4) {
      return new ne($$1, b($$2), $$2, $$0, $$3, $$4, csu::new);
   }

   public static ne d(csc $$0, mz $$1, cvq $$2, float $$3, int $$4) {
      return new ne($$1, cru.a, $$2, $$0, $$3, $$4, csy::new);
   }

   public ne b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ne b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public coy a() {
      return this.d;
   }

   @Override
   public void a(na $$0, aiy $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cro $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cpd(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cru b(cvq $$0) {
      if ($$0.j().t()) {
         return cru.a;
      } else {
         return $$0.j() instanceof cmw ? cru.b : cru.c;
      }
   }

   private static cru c(cvq $$0) {
      return $$0.j() instanceof cmw ? cru.b : cru.c;
   }

   private static cru a(csj<? extends cro> $$0, cvq $$1) {
      if ($$0 == csj.p) {
         return b($$1);
      } else if ($$0 == csj.q) {
         return c($$1);
      } else if ($$0 != csj.r && $$0 != csj.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cru.a;
      }
   }

   private void a(aiy $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
