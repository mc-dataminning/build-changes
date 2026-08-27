import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xi implements wu {
   private final wv c;
   private final List<wu> d;
   private xr e;
   private axl f = axl.a;
   @Nullable
   private tv g;

   xi(wv $$0, List<wu> $$1, xr $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xi a(wv $$0) {
      return new xi($$0, Lists.newArrayList(), xr.a);
   }

   @Override
   public wv b() {
      return this.c;
   }

   @Override
   public List<wu> c() {
      return this.d;
   }

   public xi b(xr $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xr a() {
      return this.e;
   }

   public xi f(String $$0) {
      return this.b(wu.b($$0));
   }

   public xi b(wu $$0) {
      this.d.add($$0);
      return this;
   }

   public xi a(UnaryOperator<xr> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xi c(xr $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xi a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xi a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xi b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public axl g() {
      tv $$0 = tv.a();
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
         return !($$0 instanceof xi $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
