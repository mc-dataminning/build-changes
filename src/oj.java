import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements od {
   private final oe b;
   private final cxl c;
   private final ctl d;
   private final cxt e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cxf.a<?> j;

   private oj(oe $$0, cxl $$1, day $$2, cxt $$3, float $$4, int $$5, cxf.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cxf> oj a(cxt $$0, oe $$1, day $$2, float $$3, int $$4, cya<T> $$5, cxf.a<T> $$6) {
      return new oj($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oj a(cxt $$0, oe $$1, day $$2, float $$3, int $$4) {
      return new oj($$1, cxl.a, $$2, $$0, $$3, $$4, cxk::new);
   }

   public static oj b(cxt $$0, oe $$1, day $$2, float $$3, int $$4) {
      return new oj($$1, c($$2), $$2, $$0, $$3, $$4, cxi::new);
   }

   public static oj c(cxt $$0, oe $$1, day $$2, float $$3, int $$4) {
      return new oj($$1, b($$2), $$2, $$0, $$3, $$4, cyl::new);
   }

   public static oj d(cxt $$0, oe $$1, day $$2, float $$3, int $$4) {
      return new oj($$1, cxl.a, $$2, $$0, $$3, $$4, cyp::new);
   }

   public oj b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oj b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public ctl a() {
      return this.d;
   }

   @Override
   public void a(of $$0, akn $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cxf $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new ctq(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cxl b(day $$0) {
      if ($$0.r().p().b(kb.u)) {
         return cxl.a;
      } else {
         return $$0.r() instanceof cro ? cxl.b : cxl.c;
      }
   }

   private static cxl c(day $$0) {
      return $$0.r() instanceof cro ? cxl.b : cxl.c;
   }

   private static cxl a(cya<? extends cxf> $$0, day $$1) {
      if ($$0 == cya.p) {
         return b($$1);
      } else if ($$0 == cya.q) {
         return c($$1);
      } else if ($$0 != cya.r && $$0 != cya.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cxl.a;
      }
   }

   private void a(akn $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
