import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class of implements oa {
   private final ob b;
   private final csu c;
   private final int d;
   private final jf<cxa> e = jf.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public of(ob $$0, dac $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.q();
      this.d = $$2;
   }

   public static of a(ob $$0, dac $$1) {
      return new of($$0, $$1, 1);
   }

   public static of a(ob $$0, dac $$1, int $$2) {
      return new of($$0, $$1, $$2);
   }

   public of a(awg<csu> $$0) {
      return this.a(cxa.a($$0));
   }

   public of b(dac $$0) {
      return this.a($$0, 1);
   }

   public of a(dac $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cxa.a($$0));
      }

      return this;
   }

   public of a(cxa $$0) {
      return this.a($$0, 1);
   }

   public of a(cxa $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public of b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public of b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public csu a() {
      return this.c;
   }

   @Override
   public void a(oc $$0, akh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dc.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cxm $$3 = new cxm(Objects.requireNonNullElse(this.g, ""), oa.a(this.b), new csz(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
