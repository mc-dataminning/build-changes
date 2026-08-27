import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nd implements my {
   private final mz b;
   private final coy c;
   private final int d;
   private final is<csc> e = is.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public nd(mz $$0, cvq $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
   }

   public static nd a(mz $$0, cvq $$1) {
      return new nd($$0, $$1, 1);
   }

   public static nd a(mz $$0, cvq $$1, int $$2) {
      return new nd($$0, $$1, $$2);
   }

   public nd a(aup<coy> $$0) {
      return this.a(csc.a($$0));
   }

   public nd b(cvq $$0) {
      return this.a($$0, 1);
   }

   public nd a(cvq $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(csc.a($$0));
      }

      return this;
   }

   public nd a(csc $$0) {
      return this.a($$0, 1);
   }

   public nd a(csc $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public nd b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nd b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public coy a() {
      return this.c;
   }

   @Override
   public void a(na $$0, aiy $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cso $$3 = new cso(Objects.requireNonNullElse(this.g, ""), my.a(this.b), new cpd(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(aiy $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
