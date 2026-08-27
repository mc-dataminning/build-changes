import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nt implements no {
   private final np b;
   private final cre c;
   private final int d;
   private final iu<cvg> e = iu.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public nt(np $$0, cyw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.p();
      this.d = $$2;
   }

   public static nt a(np $$0, cyw $$1) {
      return new nt($$0, $$1, 1);
   }

   public static nt a(np $$0, cyw $$1, int $$2) {
      return new nt($$0, $$1, $$2);
   }

   public nt a(avr<cre> $$0) {
      return this.a(cvg.a($$0));
   }

   public nt b(cyw $$0) {
      return this.a($$0, 1);
   }

   public nt a(cyw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cvg.a($$0));
      }

      return this;
   }

   public nt a(cvg $$0) {
      return this.a($$0, 1);
   }

   public nt a(cvg $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public nt b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public nt b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cre a() {
      return this.c;
   }

   @Override
   public void a(nq $$0, ajt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cvs $$3 = new cvs(Objects.requireNonNullElse(this.g, ""), no.a(this.b), new crj(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(ajt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
