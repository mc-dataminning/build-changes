import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oi implements ob {
   private final oc b;
   private final cxu c;
   private final dch d;
   private final int e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final ddd.a<?> h;

   public oi(oc $$0, ddd.a<?> $$1, dch $$2, dho $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.i();
      this.d = $$2;
      this.e = $$4;
   }

   public static oi a(dch $$0, oc $$1, dho $$2) {
      return new oi($$1, ddl::new, $$0, $$2, 1);
   }

   public static oi a(dch $$0, oc $$1, dho $$2, int $$3) {
      return new oi($$1, ddl::new, $$0, $$2, $$3);
   }

   public oi b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oi b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxu a() {
      return this.c;
   }

   @Override
   public void a(od $$0, alc<dcl<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      ddd $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cxy(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alc<dcl<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
