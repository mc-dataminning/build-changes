import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements od {
   private final oe b;
   private final ctj c;
   private final cxr d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cyi.a<?> h;

   public ok(oe $$0, cyi.a<?> $$1, cxr $$2, daw $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.q();
      this.d = $$2;
      this.e = $$4;
   }

   public static ok a(cxr $$0, oe $$1, daw $$2) {
      return new ok($$1, cyo::new, $$0, $$2, 1);
   }

   public static ok a(cxr $$0, oe $$1, daw $$2, int $$3) {
      return new ok($$1, cyo::new, $$0, $$2, $$3);
   }

   public ok b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ok b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public ctj a() {
      return this.c;
   }

   @Override
   public void a(of $$0, akm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyi $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cto(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akm $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
