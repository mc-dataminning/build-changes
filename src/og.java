import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class og implements ob {
   private final jt<cxu> b;
   private final oc c;
   private final cxy d;
   private final List<dch> e = new ArrayList<>();
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private og(jt<cxu> $$0, oc $$1, cxy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static og a(jt<cxu> $$0, oc $$1, cxy $$2) {
      return new og($$0, $$1, $$2);
   }

   public static og a(jt<cxu> $$0, oc $$1, dho $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static og a(jt<cxu> $$0, oc $$1, dho $$2, int $$3) {
      return new og($$0, $$1, $$2.i().n().c($$3));
   }

   public og a(axp<cxu> $$0) {
      return this.a(dch.a(this.b.b($$0)));
   }

   public og b(dho $$0) {
      return this.a($$0, 1);
   }

   public og a(dho $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dch.a($$0));
      }

      return this;
   }

   public og a(dch $$0) {
      return this.a($$0, 1);
   }

   public og a(dch $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public og b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public og b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxu a() {
      return this.d.h();
   }

   @Override
   public void a(od $$0, alc<dcl<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      ddb $$3 = new ddb(Objects.requireNonNullElse(this.g, ""), ob.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(alc<dcl<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
