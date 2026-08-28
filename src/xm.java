import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xm implements wy {
   private final wz c;
   private final List<wy> d;
   private xv e;
   private axz f = axz.a;
   @Nullable
   private tv g;

   xm(wz $$0, List<wy> $$1, xv $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xm a(wz $$0) {
      return new xm($$0, Lists.newArrayList(), xv.a);
   }

   @Override
   public wz b() {
      return this.c;
   }

   @Override
   public List<wy> c() {
      return this.d;
   }

   public xm b(xv $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xv a() {
      return this.e;
   }

   public xm f(String $$0) {
      return $$0.isEmpty() ? this : this.b(wy.b($$0));
   }

   public xm b(wy $$0) {
      this.d.add($$0);
      return this;
   }

   public xm a(UnaryOperator<xv> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xm c(xv $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xm a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xm a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xm b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public axz g() {
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
         return !($$0 instanceof xm $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
