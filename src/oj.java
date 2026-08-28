import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements od {
   private final oe b;
   private final ddb c;
   private final cyu d;
   private final ddl e;
   private final float f;
   private final int g;
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dcv.a<?> j;

   private oj(oe $$0, ddb $$1, diu $$2, ddl $$3, float $$4, int $$5, dcv.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dcv> oj a(ddl $$0, oe $$1, diu $$2, float $$3, int $$4, ddz<T> $$5, dcv.a<T> $$6) {
      return new oj($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static oj a(ddl $$0, oe $$1, diu $$2, float $$3, int $$4) {
      return new oj($$1, ddb.a, $$2, $$0, $$3, $$4, dda::new);
   }

   public static oj b(ddl $$0, oe $$1, diu $$2, float $$3, int $$4) {
      return new oj($$1, c($$2), $$2, $$0, $$3, $$4, dcy::new);
   }

   public static oj c(ddl $$0, oe $$1, diu $$2, float $$3, int $$4) {
      return new oj($$1, b($$2), $$2, $$0, $$3, $$4, dej::new);
   }

   public static oj d(ddl $$0, oe $$1, diu $$2, float $$3, int $$4) {
      return new oj($$1, ddb.a, $$2, $$0, $$3, $$4, deo::new);
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
   public cyu a() {
      return this.d;
   }

   @Override
   public void a(of $$0, alf<ddp<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$2::a);
      dcv $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cyy(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private static ddb b(diu $$0) {
      if ($$0.h().f().c(kj.v)) {
         return ddb.a;
      } else {
         return $$0.h() instanceof cxg ? ddb.b : ddb.c;
      }
   }

   private static ddb c(diu $$0) {
      return $$0.h() instanceof cxg ? ddb.b : ddb.c;
   }

   private static ddb a(ddz<? extends dcv> $$0, diu $$1) {
      if ($$0 == ddz.o) {
         return b($$1);
      } else if ($$0 == ddz.p) {
         return c($$1);
      } else if ($$0 != ddz.q && $$0 != ddz.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return ddb.a;
      }
   }

   private void a(alf<ddp<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
