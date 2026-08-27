import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class mz implements ms {
   private final mt b;
   private final cmc c;
   private final cpi d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cpz.a<?> h;

   public mz(mt $$0, cpz.a<?> $$1, cpi $$2, csx $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.k();
      this.d = $$2;
      this.e = $$4;
   }

   public static mz a(cpi $$0, mt $$1, csx $$2) {
      return new mz($$1, cqf::new, $$0, $$2, 1);
   }

   public static mz a(cpi $$0, mt $$1, csx $$2, int $$3) {
      return new mz($$1, cqf::new, $$0, $$2, $$3);
   }

   public mz b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public mz b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cmc a() {
      return this.c;
   }

   @Override
   public void a(mu $$0, agt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cpz $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cmh(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(agt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
