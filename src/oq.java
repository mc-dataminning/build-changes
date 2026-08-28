import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oq implements ol {
   private final om b;
   private final cul c;
   private final int d;
   private final jv<cyw> e = jv.a();
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public oq(om $$0, dcv $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.r();
      this.d = $$2;
   }

   public static oq a(om $$0, dcv $$1) {
      return new oq($$0, $$1, 1);
   }

   public static oq a(om $$0, dcv $$1, int $$2) {
      return new oq($$0, $$1, $$2);
   }

   public oq a(awu<cul> $$0) {
      return this.a(cyw.a($$0));
   }

   public oq b(dcv $$0) {
      return this.a($$0, 1);
   }

   public oq a(dcv $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cyw.a($$0));
      }

      return this;
   }

   public oq a(cyw $$0) {
      return this.a($$0, 1);
   }

   public oq a(cyw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oq b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oq b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cul a() {
      return this.c;
   }

   @Override
   public void a(on $$0, akr $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czj $$3 = new czj(Objects.requireNonNullElse(this.g, ""), ol.a(this.b), new cuq(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(akr $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
