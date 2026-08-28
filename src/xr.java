import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xr implements xd {
   private final xe c;
   private final List<xd> d;
   private ya e;
   private ayo f = ayo.a;
   @Nullable
   private ua g;

   xr(xe $$0, List<xd> $$1, ya $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xr a(xe $$0) {
      return new xr($$0, Lists.newArrayList(), ya.a);
   }

   @Override
   public xe b() {
      return this.c;
   }

   @Override
   public List<xd> c() {
      return this.d;
   }

   public xr b(ya $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ya a() {
      return this.e;
   }

   public xr f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xd.b($$0));
   }

   public xr b(xd $$0) {
      this.d.add($$0);
      return this;
   }

   public xr a(UnaryOperator<ya> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xr c(ya $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xr a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xr a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xr b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayo g() {
      ua $$0 = ua.a();
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
         return !($$0 instanceof xr $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
