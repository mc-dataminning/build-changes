import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class om implements of {
   private final og b;
   private final cuc c;
   private final cyv d;
   private final int e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final czo.a<?> h;

   public om(og $$0, czo.a<?> $$1, cyv $$2, dbz $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.q();
      this.d = $$2;
      this.e = $$4;
   }

   public static om a(cyv $$0, og $$1, dbz $$2) {
      return new om($$1, czu::new, $$0, $$2, 1);
   }

   public static om a(cyv $$0, og $$1, dbz $$2, int $$3) {
      return new om($$1, czu::new, $$0, $$2, $$3);
   }

   public static om b(cyv $$0, og $$1, dbz $$2, int $$3) {
      return new om($$1, cyy::new, $$0, $$2, $$3);
   }

   public om b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public om b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cuc a() {
      return this.c;
   }

   @Override
   public void a(oh $$0, akt $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", df.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czo $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cuh(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
