import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nc implements mw {
   private final mx b;
   private final cpq c;
   private final cms d;
   private final cpy e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cpk.a<?> j;

   private nc(mx $$0, cpq $$1, ctn $$2, cpy $$3, float $$4, int $$5, cpk.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.k();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cpk> nc a(cpy $$0, mx $$1, ctn $$2, float $$3, int $$4, cqf<T> $$5, cpk.a<T> $$6) {
      return new nc($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static nc a(cpy $$0, mx $$1, ctn $$2, float $$3, int $$4) {
      return new nc($$1, cpq.a, $$2, $$0, $$3, $$4, cpp::new);
   }

   public static nc b(cpy $$0, mx $$1, ctn $$2, float $$3, int $$4) {
      return new nc($$1, c($$2), $$2, $$0, $$3, $$4, cpn::new);
   }

   public static nc c(cpy $$0, mx $$1, ctn $$2, float $$3, int $$4) {
      return new nc($$1, b($$2), $$2, $$0, $$3, $$4, cqq::new);
   }

   public static nc d(cpy $$0, mx $$1, ctn $$2, float $$3, int $$4) {
      return new nc($$1, cpq.a, $$2, $$0, $$3, $$4, cqu::new);
   }

   public nc b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public nc b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cms a() {
      return this.d;
   }

   @Override
   public void a(my $$0, ahg $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cpk $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cmx(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cpq b(ctn $$0) {
      if ($$0.k().u()) {
         return cpq.a;
      } else {
         return $$0.k() instanceof ckq ? cpq.b : cpq.c;
      }
   }

   private static cpq c(ctn $$0) {
      return $$0.k() instanceof ckq ? cpq.b : cpq.c;
   }

   private static cpq a(cqf<? extends cpk> $$0, ctn $$1) {
      if ($$0 == cqf.p) {
         return b($$1);
      } else if ($$0 == cqf.q) {
         return c($$1);
      } else if ($$0 != cqf.r && $$0 != cqf.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cpq.a;
      }
   }

   private void a(ahg $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
