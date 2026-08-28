import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class om implements ob {
   private final oc b;
   private final js<cxu> c;
   private final dch d;
   private final dch e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private om(oc $$0, js<cxu> $$1, dch $$2, dch $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static om a(oc $$0, dch $$1, dch $$2, cxu $$3) {
      return new om($$0, $$3.f(), $$1, $$2);
   }

   public om b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public om b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxu a() {
      return this.c.a();
   }

   @Override
   public void a(od $$0, alc<dcl<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      ddn $$3 = new ddn(Objects.requireNonNullElse(this.g, ""), ob.a(this.b), this.d, this.e, new ddo(this.c.a()));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alc<dcl<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
