import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements od {
   private final oe b;
   private final ctl c;
   private final cxt d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cyk.a<?> h;

   public ok(oe $$0, cyk.a<?> $$1, cxt $$2, day $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.r();
      this.d = $$2;
      this.e = $$4;
   }

   public static ok a(cxt $$0, oe $$1, day $$2) {
      return new ok($$1, cyq::new, $$0, $$2, 1);
   }

   public static ok a(cxt $$0, oe $$1, day $$2, int $$3) {
      return new ok($$1, cyq::new, $$0, $$2, $$3);
   }

   public ok b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ok b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public ctl a() {
      return this.c;
   }

   @Override
   public void a(of $$0, akn $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyk $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new ctq(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akn $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
