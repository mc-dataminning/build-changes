import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nj implements nc {
   private final nd b;
   private final cqf c;
   private final ctk d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cub.a<?> h;

   public nj(nd $$0, cub.a<?> $$1, ctk $$2, cwy $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.l();
      this.d = $$2;
      this.e = $$4;
   }

   public static nj a(ctk $$0, nd $$1, cwy $$2) {
      return new nj($$1, cuh::new, $$0, $$2, 1);
   }

   public static nj a(ctk $$0, nd $$1, cwy $$2, int $$3) {
      return new nj($$1, cuh::new, $$0, $$2, $$3);
   }

   public nj b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nj b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cqf a() {
      return this.c;
   }

   @Override
   public void a(ne $$0, ajh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cub $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cqk(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
