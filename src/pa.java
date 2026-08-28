import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pa implements ot {
   private final ou b;
   private final cvx c;
   private final dal d;
   private final int e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dbe.a<?> h;

   public pa(ou $$0, dbe.a<?> $$1, dal $$2, dfa $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static pa a(dal $$0, ou $$1, dfa $$2) {
      return new pa($$1, dbm::new, $$0, $$2, 1);
   }

   public static pa a(dal $$0, ou $$1, dfa $$2, int $$3) {
      return new pa($$1, dbm::new, $$0, $$2, $$3);
   }

   public pa b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pa b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvx a() {
      return this.c;
   }

   @Override
   public void a(ov $$0, ali $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dbe $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cwb(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(ali $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
