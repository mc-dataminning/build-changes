import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class on implements oh {
   private final oi b;
   private final cxu c;
   private final ctv d;
   private final cyd e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cxo.a<?> j;

   private on(oi $$0, cxu $$1, dcc $$2, cyd $$3, float $$4, int $$5, cxo.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cxo> on a(cyd $$0, oi $$1, dcc $$2, float $$3, int $$4, cyl<T> $$5, cxo.a<T> $$6) {
      return new on($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static on a(cyd $$0, oi $$1, dcc $$2, float $$3, int $$4) {
      return new on($$1, cxu.a, $$2, $$0, $$3, $$4, cxt::new);
   }

   public static on b(cyd $$0, oi $$1, dcc $$2, float $$3, int $$4) {
      return new on($$1, c($$2), $$2, $$0, $$3, $$4, cxr::new);
   }

   public static on c(cyd $$0, oi $$1, dcc $$2, float $$3, int $$4) {
      return new on($$1, b($$2), $$2, $$0, $$3, $$4, cyx::new);
   }

   public static on d(cyd $$0, oi $$1, dcc $$2, float $$3, int $$4) {
      return new on($$1, cxu.a, $$2, $$0, $$3, $$4, czc::new);
   }

   public on b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public on b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public ctv a() {
      return this.d;
   }

   @Override
   public void a(oj $$0, akk $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cxo $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cua(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cxu b(dcc $$0) {
      if ($$0.r().p().b(kn.v)) {
         return cxu.a;
      } else {
         return $$0.r() instanceof cry ? cxu.b : cxu.c;
      }
   }

   private static cxu c(dcc $$0) {
      return $$0.r() instanceof cry ? cxu.b : cxu.c;
   }

   private static cxu a(cyl<? extends cxo> $$0, dcc $$1) {
      if ($$0 == cyl.p) {
         return b($$1);
      } else if ($$0 == cyl.q) {
         return c($$1);
      } else if ($$0 != cyl.r && $$0 != cyl.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cxu.a;
      }
   }

   private void a(akk $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
