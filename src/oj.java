import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements oe {
   private final jg<czg> b;
   private final of c;
   private final czk d;
   private final List<ddx> e = new ArrayList<>();
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private oj(jg<czg> $$0, of $$1, czk $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static oj a(jg<czg> $$0, of $$1, czk $$2) {
      return new oj($$0, $$1, $$2);
   }

   public static oj a(jg<czg> $$0, of $$1, djg $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oj a(jg<czg> $$0, of $$1, djg $$2, int $$3) {
      return new oj($$0, $$1, $$2.h().m().c($$3));
   }

   public oj a(axr<czg> $$0) {
      return this.a(ddx.a(this.b.b($$0)));
   }

   public oj b(djg $$0) {
      return this.a($$0, 1);
   }

   public oj a(djg $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(ddx.a($$0));
      }

      return this;
   }

   public oj a(ddx $$0) {
      return this.a($$0, 1);
   }

   public oj a(ddx $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oj b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oj b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public czg a() {
      return this.d.h();
   }

   @Override
   public void a(og $$0, alf<deb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      der $$3 = new der(Objects.requireNonNullElse(this.g, ""), oe.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(alf<deb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
