import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pb implements ou {
   private final ov b;
   private final cwb c;
   private final dap d;
   private final int e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dbh.a<?> h;

   public pb(ov $$0, dbh.a<?> $$1, dap $$2, dfe $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static pb a(dap $$0, ov $$1, dfe $$2) {
      return new pb($$1, dbp::new, $$0, $$2, 1);
   }

   public static pb a(dap $$0, ov $$1, dfe $$2, int $$3) {
      return new pb($$1, dbp::new, $$0, $$2, $$3);
   }

   public pb b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pb b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cwb a() {
      return this.c;
   }

   @Override
   public void a(ow $$0, all $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dbh $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cwf(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(all $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
