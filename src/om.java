import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class om implements of {
   private final og b;
   private final czw c;
   private final den d;
   private final int e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dfj.a<?> h;

   public om(og $$0, dfj.a<?> $$1, den $$2, djy $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.h();
      this.d = $$2;
      this.e = $$4;
   }

   public static om a(den $$0, og $$1, djy $$2) {
      return new om($$1, dfr::new, $$0, $$2, 1);
   }

   public static om a(den $$0, og $$1, djy $$2, int $$3) {
      return new om($$1, dfr::new, $$0, $$2, $$3);
   }

   public om b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public om b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public czw a() {
      return this.c;
   }

   @Override
   public void a(oh $$0, alj<der<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfj $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new daa(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alj<der<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
