import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pa implements ou {
   private final ov b;
   private final dan c;
   private final cwi d;
   private final daw e;
   private final float f;
   private final int g;
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final dah.a<?> j;

   private pa(ov $$0, dan $$1, dfl $$2, daw $$3, float $$4, int $$5, dah.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends dah> pa a(daw $$0, ov $$1, dfl $$2, float $$3, int $$4, dbf<T> $$5, dah.a<T> $$6) {
      return new pa($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static pa a(daw $$0, ov $$1, dfl $$2, float $$3, int $$4) {
      return new pa($$1, dan.a, $$2, $$0, $$3, $$4, dam::new);
   }

   public static pa b(daw $$0, ov $$1, dfl $$2, float $$3, int $$4) {
      return new pa($$1, c($$2), $$2, $$0, $$3, $$4, dak::new);
   }

   public static pa c(daw $$0, ov $$1, dfl $$2, float $$3, int $$4) {
      return new pa($$1, b($$2), $$2, $$0, $$3, $$4, dbq::new);
   }

   public static pa d(daw $$0, ov $$1, dfl $$2, float $$3, int $$4) {
      return new pa($$1, dan.a, $$2, $$0, $$3, $$4, dbv::new);
   }

   public pa b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public pa b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cwi a() {
      return this.d;
   }

   @Override
   public void a(ow $$0, alj $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.h.forEach($$2::a);
      dah $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cwm(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static dan b(dfl $$0) {
      if ($$0.j().g().b(ku.w)) {
         return dan.a;
      } else {
         return $$0.j() instanceof cus ? dan.b : dan.c;
      }
   }

   private static dan c(dfl $$0) {
      return $$0.j() instanceof cus ? dan.b : dan.c;
   }

   private static dan a(dbf<? extends dah> $$0, dfl $$1) {
      if ($$0 == dbf.o) {
         return b($$1);
      } else if ($$0 == dbf.p) {
         return c($$1);
      } else if ($$0 != dbf.q && $$0 != dbf.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return dan.a;
      }
   }

   private void a(alj $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
