import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oe implements nz {
   private final js<cwk> b;
   private final oa c;
   private final cwo d;
   private final List<daz> e = new ArrayList<>();
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private oe(js<cwk> $$0, oa $$1, cwo $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static oe a(js<cwk> $$0, oa $$1, cwo $$2) {
      return new oe($$0, $$1, $$2);
   }

   public static oe a(js<cwk> $$0, oa $$1, dgg $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oe a(js<cwk> $$0, oa $$1, dgg $$2, int $$3) {
      return new oe($$0, $$1, $$2.j().n().c($$3));
   }

   public oe a(axf<cwk> $$0) {
      return this.a(daz.a(this.b.b($$0)));
   }

   public oe b(dgg $$0) {
      return this.a($$0, 1);
   }

   public oe a(dgg $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(daz.a($$0));
      }

      return this;
   }

   public oe a(daz $$0) {
      return this.a($$0, 1);
   }

   public oe a(daz $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oe b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oe b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cwk a() {
      return this.d.h();
   }

   @Override
   public void a(ob $$0, aku<dbd<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      dbt $$3 = new dbt(Objects.requireNonNullElse(this.g, ""), nz.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(aku<dbd<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
