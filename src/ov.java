import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ov implements oo {
   private final op b;
   private final cuk c;
   private final cys d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final czj.a<?> h;

   public ov(op $$0, czj.a<?> $$1, cys $$2, dbx $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.r();
      this.d = $$2;
      this.e = $$4;
   }

   public static ov a(cys $$0, op $$1, dbx $$2) {
      return new ov($$1, czp::new, $$0, $$2, 1);
   }

   public static ov a(cys $$0, op $$1, dbx $$2, int $$3) {
      return new ov($$1, czp::new, $$0, $$2, $$3);
   }

   public ov b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ov b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cuk a() {
      return this.c;
   }

   @Override
   public void a(oq $$0, alf $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      czj $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cup(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(alf $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
