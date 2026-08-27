import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nb implements mw {
   private final mx b;
   private final cnb c;
   private final int d;
   private final iq<cqh> e = iq.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public nb(mx $$0, ctw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
   }

   public static nb a(mx $$0, ctw $$1) {
      return new nb($$0, $$1, 1);
   }

   public static nb a(mx $$0, ctw $$1, int $$2) {
      return new nb($$0, $$1, $$2);
   }

   public nb a(asx<cnb> $$0) {
      return this.a(cqh.a($$0));
   }

   public nb b(ctw $$0) {
      return this.a($$0, 1);
   }

   public nb a(ctw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cqh.a($$0));
      }

      return this;
   }

   public nb a(cqh $$0) {
      return this.a($$0, 1);
   }

   public nb a(cqh $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public nb b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nb b(@Nullable String $$0) {
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
      cqt $$3 = new cqt(Objects.requireNonNullElse(this.g, ""), mw.a(this.b), new cng(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ahh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
