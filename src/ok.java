import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements nz {
   private final oa b;
   private final jr<cwl> c;
   private final dba d;
   private final dba e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private ok(oa $$0, jr<cwl> $$1, dba $$2, dba $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static ok a(oa $$0, dba $$1, dba $$2, cwl $$3) {
      return new ok($$0, $$3.f(), $$1, $$2);
   }

   public ok b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ok b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cwl a() {
      return this.c.a();
   }

   @Override
   public void a(ob $$0, akt<dbe<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      dcg $$3 = new dcg(Objects.requireNonNullElse(this.g, ""), nz.a(this.b), this.d, this.e, this.c);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(akt<dbe<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
