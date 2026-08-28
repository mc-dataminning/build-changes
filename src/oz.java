import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oz implements ou {
   private final jr<cwi> b;
   private final ov c;
   private final cwm d;
   private final List<daw> e = new ArrayList<>();
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private oz(jr<cwi> $$0, ov $$1, cwm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static oz a(jr<cwi> $$0, ov $$1, cwm $$2) {
      return new oz($$0, $$1, $$2);
   }

   public static oz a(jr<cwi> $$0, ov $$1, dfl $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oz a(jr<cwi> $$0, ov $$1, dfl $$2, int $$3) {
      return new oz($$0, $$1, $$2.j().o().c($$3));
   }

   public oz a(axs<cwi> $$0) {
      return this.a(daw.a(this.b.b($$0)));
   }

   public oz b(dfl $$0) {
      return this.a($$0, 1);
   }

   public oz a(dfl $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(daw.a($$0));
      }

      return this;
   }

   public oz a(daw $$0) {
      return this.a($$0, 1);
   }

   public oz a(daw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oz b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oz b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cwi a() {
      return this.d.h();
   }

   @Override
   public void a(ow $$0, alj $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dbk $$3 = new dbk(Objects.requireNonNullElse(this.g, ""), ou.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private void a(alj $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
