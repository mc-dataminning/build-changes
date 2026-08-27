import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nb implements mu {
   private final mv b;
   private final cmm c;
   private final cps d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cqj.a<?> h;

   public nb(mv $$0, cqj.a<?> $$1, cps $$2, cth $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static nb a(cps $$0, mv $$1, cth $$2) {
      return new nb($$1, cqp::new, $$0, $$2, 1);
   }

   public static nb a(cps $$0, mv $$1, cth $$2, int $$3) {
      return new nb($$1, cqp::new, $$0, $$2, $$3);
   }

   public nb b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nb b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cmm a() {
      return this.c;
   }

   @Override
   public void a(mw $$0, ahd $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cqj $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cmr(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ahd $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
