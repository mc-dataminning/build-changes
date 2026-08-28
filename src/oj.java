import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements od {
   private final oe b;
   private final dcv c;
   private final cyo d;
   private final ddf e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dcp.a<?> j;

   private oj(oe $$0, dcv $$1, dio $$2, ddf $$3, float $$4, int $$5, dcp.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dcp> oj a(ddf $$0, oe $$1, dio $$2, float $$3, int $$4, ddt<T> $$5, dcp.a<T> $$6) {
      return new oj($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oj a(ddf $$0, oe $$1, dio $$2, float $$3, int $$4) {
      return new oj($$1, dcv.a, $$2, $$0, $$3, $$4, dcu::new);
   }

   public static oj b(ddf $$0, oe $$1, dio $$2, float $$3, int $$4) {
      return new oj($$1, c($$2), $$2, $$0, $$3, $$4, dcs::new);
   }

   public static oj c(ddf $$0, oe $$1, dio $$2, float $$3, int $$4) {
      return new oj($$1, b($$2), $$2, $$0, $$3, $$4, ded::new);
   }

   public static oj d(ddf $$0, oe $$1, dio $$2, float $$3, int $$4) {
      return new oj($$1, dcv.a, $$2, $$0, $$3, $$4, dei::new);
   }

   public oj b(String $$0, aq<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oj b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cyo a() {
      return this.d;
   }

   @Override
   public void a(of $$0, ald<ddj<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dcp $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cys(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static dcv b(dio $$0) {
      if ($$0.h().f().c(kj.v)) {
         return dcv.a;
      } else {
         return $$0.h() instanceof cxa ? dcv.b : dcv.c;
      }
   }

   private static dcv c(dio $$0) {
      return $$0.h() instanceof cxa ? dcv.b : dcv.c;
   }

   private static dcv a(ddt<? extends dcp> $$0, dio $$1) {
      if ($$0 == ddt.o) {
         return b($$1);
      } else if ($$0 == ddt.p) {
         return c($$1);
      } else if ($$0 != ddt.q && $$0 != ddt.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dcv.a;
      }
   }

   private void a(ald<ddj<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
