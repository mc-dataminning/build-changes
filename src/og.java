import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class og implements oa {
   private final ob b;
   private final cws c;
   private final csu d;
   private final cxa e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cwm.a<?> j;

   private og(ob $$0, cws $$1, dac $$2, cxa $$3, float $$4, int $$5, cwm.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.q();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cwm> og a(cxa $$0, ob $$1, dac $$2, float $$3, int $$4, cxh<T> $$5, cwm.a<T> $$6) {
      return new og($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static og a(cxa $$0, ob $$1, dac $$2, float $$3, int $$4) {
      return new og($$1, cws.a, $$2, $$0, $$3, $$4, cwr::new);
   }

   public static og b(cxa $$0, ob $$1, dac $$2, float $$3, int $$4) {
      return new og($$1, c($$2), $$2, $$0, $$3, $$4, cwp::new);
   }

   public static og c(cxa $$0, ob $$1, dac $$2, float $$3, int $$4) {
      return new og($$1, b($$2), $$2, $$0, $$3, $$4, cxs::new);
   }

   public static og d(cxa $$0, ob $$1, dac $$2, float $$3, int $$4) {
      return new og($$1, cws.a, $$2, $$0, $$3, $$4, cxw::new);
   }

   public og b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public og b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public csu a() {
      return this.d;
   }

   @Override
   public void a(oc $$0, akh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dc.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cwm $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new csz(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cws b(dac $$0) {
      if ($$0.q().o().b(ka.t)) {
         return cws.a;
      } else {
         return $$0.q() instanceof cqx ? cws.b : cws.c;
      }
   }

   private static cws c(dac $$0) {
      return $$0.q() instanceof cqx ? cws.b : cws.c;
   }

   private static cws a(cxh<? extends cwm> $$0, dac $$1) {
      if ($$0 == cxh.p) {
         return b($$1);
      } else if ($$0 == cxh.q) {
         return c($$1);
      } else if ($$0 != cxh.r && $$0 != cxh.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cws.a;
      }
   }

   private void a(akh $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
