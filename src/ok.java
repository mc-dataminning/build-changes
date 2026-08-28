import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements of {
   private final jh<dag> b;
   private final og c;
   private final dak d;
   private final List<dex> e = new ArrayList<>();
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private ok(jh<dag> $$0, og $$1, dak $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ok a(jh<dag> $$0, og $$1, dak $$2) {
      return new ok($$0, $$1, $$2);
   }

   public static ok a(jh<dag> $$0, og $$1, dki $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static ok a(jh<dag> $$0, og $$1, dki $$2, int $$3) {
      return new ok($$0, $$1, $$2.h().m().c($$3));
   }

   public ok a(ayc<dag> $$0) {
      return this.a(dex.a(this.b.b($$0)));
   }

   public ok b(dki $$0) {
      return this.a($$0, 1);
   }

   public ok a(dki $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dex.a($$0));
      }

      return this;
   }

   public ok a(dex $$0) {
      return this.a($$0, 1);
   }

   public ok a(dex $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public ok b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ok b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public dag a() {
      return this.d.h();
   }

   @Override
   public void a(oh $$0, alq<dfb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfr $$3 = new dfr(Objects.requireNonNullElse(this.g, ""), of.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(alq<dfb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
