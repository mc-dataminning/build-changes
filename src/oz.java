import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oz implements os {
   private final ot b;
   private final cvt c;
   private final daf d;
   private final int e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final day.a<?> h;

   public oz(ot $$0, day.a<?> $$1, daf $$2, deu $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static oz a(daf $$0, ot $$1, deu $$2) {
      return new oz($$1, dbg::new, $$0, $$2, 1);
   }

   public static oz a(daf $$0, ot $$1, deu $$2, int $$3) {
      return new oz($$1, dbg::new, $$0, $$2, $$3);
   }

   public oz b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oz b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvt a() {
      return this.c;
   }

   @Override
   public void a(ou $$0, alh $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", du.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      day $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cvx(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(alh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
