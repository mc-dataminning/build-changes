import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pk implements oz {
   private final pa b;
   private final jq<cxk> c;
   private final dbz d;
   private final dbz e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private pk(pa $$0, jq<cxk> $$1, dbz $$2, dbz $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static pk a(pa $$0, dbz $$1, dbz $$2, cxk $$3) {
      return new pk($$0, $$3.f(), $$1, $$2);
   }

   public pk b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pk b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxk a() {
      return this.c.a();
   }

   @Override
   public void a(pb $$0, aly<dcd<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      ddf $$3 = new ddf(Objects.requireNonNullElse(this.g, ""), oz.a(this.b), this.d, this.e, this.c);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(aly<dcd<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
