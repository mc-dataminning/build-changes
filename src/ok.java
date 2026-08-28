import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements nz {
   private final oa b;
   private final jr<cxd> c;
   private final dbr d;
   private final dbr e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private ok(oa $$0, jr<cxd> $$1, dbr $$2, dbr $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static ok a(oa $$0, dbr $$1, dbr $$2, cxd $$3) {
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
   public cxd a() {
      return this.c.a();
   }

   @Override
   public void a(ob $$0, akt<dbv<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      dcx $$3 = new dcx(Objects.requireNonNullElse(this.g, ""), nz.a(this.b), this.d, this.e, new dcy(this.c.a()));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(akt<dbv<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
