import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements of {
   private final og b;
   private final cuc c;
   private final int d;
   private final jj<cyv> e = jj.a();
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public ok(og $$0, dbz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.q();
      this.d = $$2;
   }

   public static ok a(og $$0, dbz $$1) {
      return new ok($$0, $$1, 1);
   }

   public static ok a(og $$0, dbz $$1, int $$2) {
      return new ok($$0, $$1, $$2);
   }

   public ok a(awt<cuc> $$0) {
      return this.a(cyv.a($$0));
   }

   public ok b(dbz $$0) {
      return this.a($$0, 1);
   }

   public ok a(dbz $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cyv.a($$0));
      }

      return this;
   }

   public ok a(cyv $$0) {
      return this.a($$0, 1);
   }

   public ok a(cyv $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public ok b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ok b(@Nullable String $$0) {
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
      czj $$3 = new czj(Objects.requireNonNullElse(this.g, ""), of.a(this.b), new cuh(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
