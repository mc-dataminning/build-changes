import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class os implements ol {
   private final om b;
   private final cul c;
   private final cyw d;
   private final int e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final czo.a<?> h;

   public os(om $$0, czo.a<?> $$1, cyw $$2, dcv $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.r();
      this.d = $$2;
      this.e = $$4;
   }

   public static os a(cyw $$0, om $$1, dcv $$2) {
      return new os($$1, czw::new, $$0, $$2, 1);
   }

   public static os a(cyw $$0, om $$1, dcv $$2, int $$3) {
      return new os($$1, czw::new, $$0, $$2, $$3);
   }

   public os b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public os b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cul a() {
      return this.c;
   }

   @Override
   public void a(on $$0, akr $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czo $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cuq(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(akr $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
