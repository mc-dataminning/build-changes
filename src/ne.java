import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ne implements my {
   private final mz b;
   private final crq c;
   private final cou d;
   private final cry e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final crk.a<?> j;

   private ne(mz $$0, crq $$1, cvm $$2, cry $$3, float $$4, int $$5, crk.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends crk> ne a(cry $$0, mz $$1, cvm $$2, float $$3, int $$4, csf<T> $$5, crk.a<T> $$6) {
      return new ne($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ne a(cry $$0, mz $$1, cvm $$2, float $$3, int $$4) {
      return new ne($$1, crq.a, $$2, $$0, $$3, $$4, crp::new);
   }

   public static ne b(cry $$0, mz $$1, cvm $$2, float $$3, int $$4) {
      return new ne($$1, c($$2), $$2, $$0, $$3, $$4, crn::new);
   }

   public static ne c(cry $$0, mz $$1, cvm $$2, float $$3, int $$4) {
      return new ne($$1, b($$2), $$2, $$0, $$3, $$4, csq::new);
   }

   public static ne d(cry $$0, mz $$1, cvm $$2, float $$3, int $$4) {
      return new ne($$1, crq.a, $$2, $$0, $$3, $$4, csu::new);
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
   public cou a() {
      return this.d;
   }

   @Override
   public void a(na $$0, aiy $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      crk $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new coz(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static crq b(cvm $$0) {
      if ($$0.j().t()) {
         return crq.a;
      } else {
         return $$0.j() instanceof cms ? crq.b : crq.c;
      }
   }

   private static crq c(cvm $$0) {
      return $$0.j() instanceof cms ? crq.b : crq.c;
   }

   private static crq a(csf<? extends crk> $$0, cvm $$1) {
      if ($$0 == csf.p) {
         return b($$1);
      } else if ($$0 == csf.q) {
         return c($$1);
      } else if ($$0 != csf.r && $$0 != csf.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return crq.a;
      }
   }

   private void a(aiy $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
