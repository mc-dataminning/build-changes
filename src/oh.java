import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oh implements oa {
   private final ob b;
   private final csu c;
   private final cxa d;
   private final int e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final cxr.a<?> h;

   public oh(ob $$0, cxr.a<?> $$1, cxa $$2, dac $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.q();
      this.d = $$2;
      this.e = $$4;
   }

   public static oh a(cxa $$0, ob $$1, dac $$2) {
      return new oh($$1, cxx::new, $$0, $$2, 1);
   }

   public static oh a(cxa $$0, ob $$1, dac $$2, int $$3) {
      return new oh($$1, cxx::new, $$0, $$2, $$3);
   }

   public oh b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oh b(@Nullable String $$0) {
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
      cxr $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new csz(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
