import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ot implements oo {
   private final op b;
   private final cui c;
   private final int d;
   private final jr<cyq> e = jr.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public ot(op $$0, dbv $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.r();
      this.d = $$2;
   }

   public static ot a(op $$0, dbv $$1) {
      return new ot($$0, $$1, 1);
   }

   public static ot a(op $$0, dbv $$1, int $$2) {
      return new ot($$0, $$1, $$2);
   }

   public ot a(axe<cui> $$0) {
      return this.a(cyq.a($$0));
   }

   public ot b(dbv $$0) {
      return this.a($$0, 1);
   }

   public ot a(dbv $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cyq.a($$0));
      }

      return this;
   }

   public ot a(cyq $$0) {
      return this.a($$0, 1);
   }

   public ot a(cyq $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public ot b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ot b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cui a() {
      return this.c;
   }

   @Override
   public void a(oq $$0, ale $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dp.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      czc $$3 = new czc(Objects.requireNonNullElse(this.g, ""), oo.a(this.b), new cun(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ale $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
