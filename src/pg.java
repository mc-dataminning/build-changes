import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pg implements oz {
   private final pa b;
   private final cxl c;
   private final dca d;
   private final int e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dcw.a<?> h;

   public pg(pa $$0, dcw.a<?> $$1, dca $$2, dhh $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static pg a(dca $$0, pa $$1, dhh $$2) {
      return new pg($$1, dde::new, $$0, $$2, 1);
   }

   public static pg a(dca $$0, pa $$1, dhh $$2, int $$3) {
      return new pg($$1, dde::new, $$0, $$2, $$3);
   }

   public pg b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pg b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxl a() {
      return this.c;
   }

   @Override
   public void a(pb $$0, aly<dce<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dcw $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cxp(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(aly<dce<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
