import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements od {
   private final oe b;
   private final cxj c;
   private final ctj d;
   private final cxr e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cxd.a<?> j;

   private oj(oe $$0, cxj $$1, daw $$2, cxr $$3, float $$4, int $$5, cxd.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.q();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cxd> oj a(cxr $$0, oe $$1, daw $$2, float $$3, int $$4, cxy<T> $$5, cxd.a<T> $$6) {
      return new oj($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oj a(cxr $$0, oe $$1, daw $$2, float $$3, int $$4) {
      return new oj($$1, cxj.a, $$2, $$0, $$3, $$4, cxi::new);
   }

   public static oj b(cxr $$0, oe $$1, daw $$2, float $$3, int $$4) {
      return new oj($$1, c($$2), $$2, $$0, $$3, $$4, cxg::new);
   }

   public static oj c(cxr $$0, oe $$1, daw $$2, float $$3, int $$4) {
      return new oj($$1, b($$2), $$2, $$0, $$3, $$4, cyj::new);
   }

   public static oj d(cxr $$0, oe $$1, daw $$2, float $$3, int $$4) {
      return new oj($$1, cxj.a, $$2, $$0, $$3, $$4, cyn::new);
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
   public ctj a() {
      return this.d;
   }

   @Override
   public void a(of $$0, akm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cxd $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cto(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cxj b(daw $$0) {
      if ($$0.q().o().b(kb.u)) {
         return cxj.a;
      } else {
         return $$0.q() instanceof crm ? cxj.b : cxj.c;
      }
   }

   private static cxj c(daw $$0) {
      return $$0.q() instanceof crm ? cxj.b : cxj.c;
   }

   private static cxj a(cxy<? extends cxd> $$0, daw $$1) {
      if ($$0 == cxy.p) {
         return b($$1);
      } else if ($$0 == cxy.q) {
         return c($$1);
      } else if ($$0 != cxy.r && $$0 != cxy.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cxj.a;
      }
   }

   private void a(akm $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
