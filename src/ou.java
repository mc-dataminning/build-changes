import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements oo {
   private final op b;
   private final cyf c;
   private final cuf d;
   private final cyn e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cxz.a<?> j;

   private ou(op $$0, cyf $$1, dbs $$2, cyn $$3, float $$4, int $$5, cxz.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cxz> ou a(cyn $$0, op $$1, dbs $$2, float $$3, int $$4, cyu<T> $$5, cxz.a<T> $$6) {
      return new ou($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ou a(cyn $$0, op $$1, dbs $$2, float $$3, int $$4) {
      return new ou($$1, cyf.a, $$2, $$0, $$3, $$4, cye::new);
   }

   public static ou b(cyn $$0, op $$1, dbs $$2, float $$3, int $$4) {
      return new ou($$1, c($$2), $$2, $$0, $$3, $$4, cyc::new);
   }

   public static ou c(cyn $$0, op $$1, dbs $$2, float $$3, int $$4) {
      return new ou($$1, b($$2), $$2, $$0, $$3, $$4, czf::new);
   }

   public static ou d(cyn $$0, op $$1, dbs $$2, float $$3, int $$4) {
      return new ou($$1, cyf.a, $$2, $$0, $$3, $$4, czj::new);
   }

   public ou b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ou b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cuf a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alb $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cxz $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cuk(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cyf b(dbs $$0) {
      if ($$0.r().p().b(km.u)) {
         return cyf.a;
      } else {
         return $$0.r() instanceof csi ? cyf.b : cyf.c;
      }
   }

   private static cyf c(dbs $$0) {
      return $$0.r() instanceof csi ? cyf.b : cyf.c;
   }

   private static cyf a(cyu<? extends cxz> $$0, dbs $$1) {
      if ($$0 == cyu.p) {
         return b($$1);
      } else if ($$0 == cyu.q) {
         return c($$1);
      } else if ($$0 != cyu.r && $$0 != cyu.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cyf.a;
      }
   }

   private void a(alb $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
