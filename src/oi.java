import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oi implements od {
   private final oe b;
   private final ctl c;
   private final int d;
   private final jg<cxt> e = jg.a();
   private final Map<String, an<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public oi(oe $$0, day $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.r();
      this.d = $$2;
   }

   public static oi a(oe $$0, day $$1) {
      return new oi($$0, $$1, 1);
   }

   public static oi a(oe $$0, day $$1, int $$2) {
      return new oi($$0, $$1, $$2);
   }

   public oi a(awm<ctl> $$0) {
      return this.a(cxt.a($$0));
   }

   public oi b(day $$0) {
      return this.a($$0, 1);
   }

   public oi a(day $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cxt.a($$0));
      }

      return this;
   }

   public oi a(cxt $$0) {
      return this.a($$0, 1);
   }

   public oi a(cxt $$0, int $$1) {
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
   public ctl a() {
      return this.c;
   }

   @Override
   public void a(of $$0, akn $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cyf $$3 = new cyf(Objects.requireNonNullElse(this.g, ""), od.a(this.b), new ctq(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private void a(akn $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
