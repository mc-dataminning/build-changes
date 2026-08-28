import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pf implements ou {
   private final ov b;
   private final jq<cwi> c;
   private final daw d;
   private final daw e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private pf(ov $$0, jq<cwi> $$1, daw $$2, daw $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static pf a(ov $$0, daw $$1, daw $$2, cwi $$3) {
      return new pf($$0, $$3.f(), $$1, $$2);
   }

   public pf b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pf b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cwi a() {
      return this.c.a();
   }

   @Override
   public void a(ow $$0, alj $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dby $$3 = new dby(Objects.requireNonNullElse(this.g, ""), ou.a(this.b), this.d, this.e, this.c);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(alj $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
