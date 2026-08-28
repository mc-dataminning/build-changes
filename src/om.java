import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class om implements of {
   private final og b;
   private final dag c;
   private final dex d;
   private final int e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dft.a<?> h;

   public om(og $$0, dft.a<?> $$1, dex $$2, dki $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.h();
      this.d = $$2;
      this.e = $$4;
   }

   public static om a(dex $$0, og $$1, dki $$2) {
      return new om($$1, dgb::new, $$0, $$2, 1);
   }

   public static om a(dex $$0, og $$1, dki $$2, int $$3) {
      return new om($$1, dgb::new, $$0, $$2, $$3);
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
   public dag a() {
      return this.c;
   }

   @Override
   public void a(oh $$0, alq<dfb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dft $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new dak(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alq<dfb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
