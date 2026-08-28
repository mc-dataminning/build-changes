import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ox implements os {
   private final jq<cvt> b;
   private final ot c;
   private final cvx d;
   private final List<daf> e = new ArrayList<>();
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private ox(jq<cvt> $$0, ot $$1, cvx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ox a(jq<cvt> $$0, ot $$1, cvx $$2) {
      return new ox($$0, $$1, $$2);
   }

   public static ox a(jq<cvt> $$0, ot $$1, deu $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static ox a(jq<cvt> $$0, ot $$1, deu $$2, int $$3) {
      return new ox($$0, $$1, $$2.j().o().c($$3));
   }

   public ox a(axp<cvt> $$0) {
      return this.a(daf.a(this.b.b($$0)));
   }

   public ox b(deu $$0) {
      return this.a($$0, 1);
   }

   public ox a(deu $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(daf.a($$0));
      }

      return this;
   }

   public ox a(daf $$0) {
      return this.a($$0, 1);
   }

   public ox a(daf $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public ox b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ox b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvt a() {
      return this.d.h();
   }

   @Override
   public void a(ou $$0, alh $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", du.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      dat $$3 = new dat(Objects.requireNonNullElse(this.g, ""), os.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private void a(alh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
