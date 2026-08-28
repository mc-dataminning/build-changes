import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class or implements ok {
   private final ol b;
   private final cuj c;
   private final cyu d;
   private final int e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final czm.a<?> h;

   public or(ol $$0, czm.a<?> $$1, cyu $$2, dct $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.r();
      this.d = $$2;
      this.e = $$4;
   }

   public static or a(cyu $$0, ol $$1, dct $$2) {
      return new or($$1, czu::new, $$0, $$2, 1);
   }

   public static or a(cyu $$0, ol $$1, dct $$2, int $$3) {
      return new or($$1, czu::new, $$0, $$2, $$3);
   }

   public or b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public or b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cuj a() {
      return this.c;
   }

   @Override
   public void a(om $$0, akq $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czm $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cuo(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(akq $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
