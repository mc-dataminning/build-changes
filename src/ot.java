import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ot implements oo {
   private final jo<cvk> b;
   private final op c;
   private final cvp d;
   private final List<dad> e = new ArrayList<>();
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private ot(jo<cvk> $$0, op $$1, cvp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ot a(jo<cvk> $$0, op $$1, cvp $$2) {
      return new ot($$0, $$1, $$2);
   }

   public static ot a(jo<cvk> $$0, op $$1, def $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static ot a(jo<cvk> $$0, op $$1, def $$2, int $$3) {
      return new ot($$0, $$1, $$2.q().v().c($$3));
   }

   public ot a(axj<cvk> $$0) {
      return this.a(dad.a(this.b.b($$0)));
   }

   public ot b(def $$0) {
      return this.a($$0, 1);
   }

   public ot a(def $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dad.a($$0));
      }

      return this;
   }

   public ot a(dad $$0) {
      return this.a($$0, 1);
   }

   public ot a(dad $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public ot b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ot b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvk a() {
      return this.d.h();
   }

   @Override
   public void a(oq $$0, alc $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      dar $$3 = new dar(Objects.requireNonNullElse(this.g, ""), oo.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private void a(alc $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
