import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nh implements nc {
   private final nd b;
   private final cqh c;
   private final int d;
   private final iu<ctm> e = iu.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public nh(nd $$0, cxa $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.l();
      this.d = $$2;
   }

   public static nh a(nd $$0, cxa $$1) {
      return new nh($$0, $$1, 1);
   }

   public static nh a(nd $$0, cxa $$1, int $$2) {
      return new nh($$0, $$1, $$2);
   }

   public nh a(avd<cqh> $$0) {
      return this.a(ctm.a($$0));
   }

   public nh b(cxa $$0) {
      return this.a($$0, 1);
   }

   public nh a(cxa $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(ctm.a($$0));
      }

      return this;
   }

   public nh a(ctm $$0) {
      return this.a($$0, 1);
   }

   public nh a(ctm $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public nh b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nh b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cqh a() {
      return this.c;
   }

   @Override
   public void a(ne $$0, ajh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cty $$3 = new cty(Objects.requireNonNullElse(this.g, ""), nc.a(this.b), new cqm(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
