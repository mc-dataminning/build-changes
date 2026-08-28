import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ok implements od {
   private final oe b;
   private final cyz c;
   private final ddq d;
   private final int e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dem.a<?> h;

   public ok(oe $$0, dem.a<?> $$1, ddq $$2, diz $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.h();
      this.d = $$2;
      this.e = $$4;
   }

   public static ok a(ddq $$0, oe $$1, diz $$2) {
      return new ok($$1, deu::new, $$0, $$2, 1);
   }

   public static ok a(ddq $$0, oe $$1, diz $$2, int $$3) {
      return new ok($$1, deu::new, $$0, $$2, $$3);
   }

   public ok b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ok b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cyz a() {
      return this.c;
   }

   @Override
   public void a(of $$0, alf<ddu<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      dem $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new czd(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alf<ddu<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
