import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nd implements mw {
   private final mx b;
   private final cnb c;
   private final cqh d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cqy.a<?> h;

   public nd(mx $$0, cqy.a<?> $$1, cqh $$2, ctw $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static nd a(cqh $$0, mx $$1, ctw $$2) {
      return new nd($$1, cre::new, $$0, $$2, 1);
   }

   public static nd a(cqh $$0, mx $$1, ctw $$2, int $$3) {
      return new nd($$1, cre::new, $$0, $$2, $$3);
   }

   public nd b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nd b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cnb a() {
      return this.c;
   }

   @Override
   public void a(my $$0, ahh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cqy $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cng(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ahh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
