import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oo implements oh {
   private final oi b;
   private final ctx c;
   private final cyf d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cyx.a<?> h;

   public oo(oi $$0, cyx.a<?> $$1, cyf $$2, dce $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.r();
      this.d = $$2;
      this.e = $$4;
   }

   public static oo a(cyf $$0, oi $$1, dce $$2) {
      return new oo($$1, czf::new, $$0, $$2, 1);
   }

   public static oo a(cyf $$0, oi $$1, dce $$2, int $$3) {
      return new oo($$1, czf::new, $$0, $$2, $$3);
   }

   public oo b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oo b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public ctx a() {
      return this.c;
   }

   @Override
   public void a(oj $$0, akk $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyx $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cuc(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akk $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
