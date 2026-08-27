import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class mx implements ms {
   private final mt b;
   private final cmc c;
   private final int d;
   private final io<cpi> e = io.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public mx(mt $$0, csx $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static mx a(mt $$0, csx $$1) {
      return new mx($$0, $$1, 1);
   }

   public static mx a(mt $$0, csx $$1, int $$2) {
      return new mx($$0, $$1, $$2);
   }

   public mx a(asg<cmc> $$0) {
      return this.a(cpi.a($$0));
   }

   public mx b(csx $$0) {
      return this.a($$0, 1);
   }

   public mx a(csx $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cpi.a($$0));
      }

      return this;
   }

   public mx a(cpi $$0) {
      return this.a($$0, 1);
   }

   public mx a(cpi $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public mx b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public mx b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cmc a() {
      return this.c;
   }

   @Override
   public void a(mu $$0, agt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cpu $$3 = new cpu(Objects.requireNonNullElse(this.g, ""), ms.a(this.b), new cmh(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(agt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
