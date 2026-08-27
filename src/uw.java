import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class uw implements ui {
   private final uj c;
   private final List<ui> d;
   private vf e;
   private ask f = ask.a;
   @Nullable
   private ro g;

   uw(uj $$0, List<ui> $$1, vf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static uw a(uj $$0) {
      return new uw($$0, Lists.newArrayList(), vf.a);
   }

   @Override
   public uj b() {
      return this.c;
   }

   @Override
   public List<ui> c() {
      return this.d;
   }

   public uw b(vf $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public vf a() {
      return this.e;
   }

   public uw f(String $$0) {
      return this.b(ui.b($$0));
   }

   public uw b(ui $$0) {
      this.d.add($$0);
      return this;
   }

   public uw a(UnaryOperator<vf> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public uw c(vf $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public uw a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public uw a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public ask g() {
      ro $$0 = ro.a();
      if (this.g != $$0) {
         this.f = $$0.a(this);
         this.g = $$0;
      }

      return this.f;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof uw $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c, this.e, this.d);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder(this.c.toString());
      boolean $$1 = !this.e.g();
      boolean $$2 = !this.d.isEmpty();
      if ($$1 || $$2) {
         $$0.append('[');
         if ($$1) {
            $$0.append("style=");
            $$0.append(this.e);
         }

         if ($$1 && $$2) {
            $$0.append(", ");
         }

         if ($$2) {
            $$0.append("siblings=");
            $$0.append(this.d);
         }

         $$0.append(']');
      }

      return $$0.toString();
   }
}
