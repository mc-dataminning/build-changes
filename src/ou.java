import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ou implements op {
   private final jp<cvn> b;
   private final oq c;
   private final cvs d;
   private final List<dag> e = new ArrayList<>();
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private ou(jp<cvn> $$0, oq $$1, cvs $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ou a(jp<cvn> $$0, oq $$1, cvs $$2) {
      return new ou($$0, $$1, $$2);
   }

   public static ou a(jp<cvn> $$0, oq $$1, dei $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static ou a(jp<cvn> $$0, oq $$1, dei $$2, int $$3) {
      return new ou($$0, $$1, $$2.q().v().c($$3));
   }

   public ou a(axl<cvn> $$0) {
      return this.a(dag.a(this.b.b($$0)));
   }

   public ou b(dei $$0) {
      return this.a($$0, 1);
   }

   public ou a(dei $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dag.a($$0));
      }

      return this;
   }

   public ou a(dag $$0) {
      return this.a($$0, 1);
   }

   public ou a(dag $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public ou b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ou b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvn a() {
      return this.d.h();
   }

   @Override
   public void a(or $$0, ale $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      dau $$3 = new dau(Objects.requireNonNullElse(this.g, ""), op.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private void a(ale $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}
