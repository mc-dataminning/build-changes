import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class om implements oh {
   private final oi b;
   private final ctv c;
   private final int d;
   private final js<cyd> e = js.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public om(oi $$0, dcc $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.r();
      this.d = $$2;
   }

   public static om a(oi $$0, dcc $$1) {
      return new om($$0, $$1, 1);
   }

   public static om a(oi $$0, dcc $$1, int $$2) {
      return new om($$0, $$1, $$2);
   }

   public om a(awk<ctv> $$0) {
      return this.a(cyd.a($$0));
   }

   public om b(dcc $$0) {
      return this.a($$0, 1);
   }

   public om a(dcc $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cyd.a($$0));
      }

      return this;
   }

   public om a(cyd $$0) {
      return this.a($$0, 1);
   }

   public om a(cyd $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public om b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public om b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public ctv a() {
      return this.c;
   }

   @Override
   public void a(oj $$0, akk $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyq $$3 = new cyq(Objects.requireNonNullElse(this.g, ""), oh.a(this.b), new cua(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akk $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
