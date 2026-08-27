import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class tz implements tm {
   private final tn c;
   private final List<tm> d;
   private ui e;
   private ark f = ark.a;
   @Nullable
   private qt g;

   tz(tn $$0, List<tm> $$1, ui $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static tz a(tn $$0) {
      return new tz($$0, Lists.newArrayList(), ui.a);
   }

   @Override
   public tn b() {
      return this.c;
   }

   @Override
   public List<tm> c() {
      return this.d;
   }

   public tz b(ui $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ui a() {
      return this.e;
   }

   public tz f(String $$0) {
      return this.b(tm.b($$0));
   }

   public tz b(tm $$0) {
      this.d.add($$0);
      return this;
   }

   public tz a(UnaryOperator<ui> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public tz c(ui $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public tz a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public tz a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public ark f() {
      qt $$0 = qt.a();
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
         return !($$0 instanceof tz $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
