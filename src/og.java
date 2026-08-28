import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class og implements nz {
   private final oa b;
   private final cwl c;
   private final dba d;
   private final int e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dbw.a<?> h;

   public og(oa $$0, dbw.a<?> $$1, dba $$2, dgh $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static og a(dba $$0, oa $$1, dgh $$2) {
      return new og($$1, dce::new, $$0, $$2, 1);
   }

   public static og a(dba $$0, oa $$1, dgh $$2, int $$3) {
      return new og($$1, dce::new, $$0, $$2, $$3);
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
   public cwl a() {
      return this.c;
   }

   @Override
   public void a(ob $$0, akt<dbe<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      dbw $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cwp(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(akt<dbe<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
