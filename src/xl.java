import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xl implements wx {
   private final wy c;
   private final List<wx> d;
   private xu e;
   private axq f = axq.a;
   @Nullable
   private ty g;

   xl(wy $$0, List<wx> $$1, xu $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xl a(wy $$0) {
      return new xl($$0, Lists.newArrayList(), xu.a);
   }

   @Override
   public wy b() {
      return this.c;
   }

   @Override
   public List<wx> c() {
      return this.d;
   }

   public xl b(xu $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xu a() {
      return this.e;
   }

   public xl f(String $$0) {
      return this.b(wx.b($$0));
   }

   public xl b(wx $$0) {
      this.d.add($$0);
      return this;
   }

   public xl a(UnaryOperator<xu> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xl c(xu $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xl a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xl a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xl b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public axq g() {
      ty $$0 = ty.a();
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
         return !($$0 instanceof xl $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
