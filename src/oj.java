import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements od {
   private final oe b;
   private final ddg c;
   private final cyz d;
   private final ddq e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dda.a<?> j;

   private oj(oe $$0, ddg $$1, diz $$2, ddq $$3, float $$4, int $$5, dda.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dda> oj a(ddq $$0, oe $$1, diz $$2, float $$3, int $$4, dee<T> $$5, dda.a<T> $$6) {
      return new oj($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oj a(ddq $$0, oe $$1, diz $$2, float $$3, int $$4) {
      return new oj($$1, ddg.a, $$2, $$0, $$3, $$4, ddf::new);
   }

   public static oj b(ddq $$0, oe $$1, diz $$2, float $$3, int $$4) {
      return new oj($$1, c($$2), $$2, $$0, $$3, $$4, ddd::new);
   }

   public static oj c(ddq $$0, oe $$1, diz $$2, float $$3, int $$4) {
      return new oj($$1, b($$2), $$2, $$0, $$3, $$4, deo::new);
   }

   public static oj d(ddq $$0, oe $$1, diz $$2, float $$3, int $$4) {
      return new oj($$1, ddg.a, $$2, $$0, $$3, $$4, det::new);
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
   public cyz a() {
      return this.d;
   }

   @Override
   public void a(of $$0, alf<ddu<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dda $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new czd(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static ddg b(diz $$0) {
      if ($$0.h().f().c(kj.v)) {
         return ddg.a;
      } else {
         return $$0.h() instanceof cxl ? ddg.b : ddg.c;
      }
   }

   private static ddg c(diz $$0) {
      return $$0.h() instanceof cxl ? ddg.b : ddg.c;
   }

   private static ddg a(dee<? extends dda> $$0, diz $$1) {
      if ($$0 == dee.o) {
         return b($$1);
      } else if ($$0 == dee.p) {
         return c($$1);
      } else if ($$0 != dee.q && $$0 != dee.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return ddg.a;
      }
   }

   private void a(alf<ddu<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
