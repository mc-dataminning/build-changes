import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ol implements oe {
   private final of b;
   private final czu c;
   private final del d;
   private final int e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dfh.a<?> h;

   public ol(of $$0, dfh.a<?> $$1, del $$2, djw $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.h();
      this.d = $$2;
      this.e = $$4;
   }

   public static ol a(del $$0, of $$1, djw $$2) {
      return new ol($$1, dfp::new, $$0, $$2, 1);
   }

   public static ol a(del $$0, of $$1, djw $$2, int $$3) {
      return new ol($$1, dfp::new, $$0, $$2, $$3);
   }

   public ol b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ol b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public czu a() {
      return this.c;
   }

   @Override
   public void a(og $$0, alh<dep<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfh $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new czy(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alh<dep<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
