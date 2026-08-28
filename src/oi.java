import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oi implements od {
   private final jf<cyu> b;
   private final oe c;
   private final cyy d;
   private final List<ddl> e = new ArrayList<>();
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private oi(jf<cyu> $$0, oe $$1, cyy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static oi a(jf<cyu> $$0, oe $$1, cyy $$2) {
      return new oi($$0, $$1, $$2);
   }

   public static oi a(jf<cyu> $$0, oe $$1, diu $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oi a(jf<cyu> $$0, oe $$1, diu $$2, int $$3) {
      return new oi($$0, $$1, $$2.h().m().c($$3));
   }

   public oi a(axr<cyu> $$0) {
      return this.a(ddl.a(this.b.b($$0)));
   }

   public oi b(diu $$0) {
      return this.a($$0, 1);
   }

   public oi a(diu $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(ddl.a($$0));
      }

      return this;
   }

   public oi a(ddl $$0) {
      return this.a($$0, 1);
   }

   public oi a(ddl $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oi b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oi b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cyu a() {
      return this.d.h();
   }

   @Override
   public void a(of $$0, alf<ddp<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      def $$3 = new def(Objects.requireNonNullElse(this.g, ""), od.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(alf<ddp<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
