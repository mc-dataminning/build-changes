import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oi implements od {
   private final oe b;
   private final ctj c;
   private final int d;
   private final jg<cxr> e = jg.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public oi(oe $$0, daw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.q();
      this.d = $$2;
   }

   public static oi a(oe $$0, daw $$1) {
      return new oi($$0, $$1, 1);
   }

   public static oi a(oe $$0, daw $$1, int $$2) {
      return new oi($$0, $$1, $$2);
   }

   public oi a(awl<ctj> $$0) {
      return this.a(cxr.a($$0));
   }

   public oi b(daw $$0) {
      return this.a($$0, 1);
   }

   public oi a(daw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cxr.a($$0));
      }

      return this;
   }

   public oi a(cxr $$0) {
      return this.a($$0, 1);
   }

   public oi a(cxr $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oi b(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oi b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public ctj a() {
      return this.c;
   }

   @Override
   public void a(of $$0, akm $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyd $$3 = new cyd(Objects.requireNonNullElse(this.g, ""), od.a(this.b), new cto(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akm $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
