import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xy implements xk {
   private final xl c;
   private final List<xk> d;
   private yh e;
   private azg f = azg.a;
   @Nullable
   private uh g;

   xy(xl $$0, List<xk> $$1, yh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xy a(xl $$0) {
      return new xy($$0, Lists.newArrayList(), yh.a);
   }

   @Override
   public xl b() {
      return this.c;
   }

   @Override
   public List<xk> c() {
      return this.d;
   }

   public xy b(yh $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public yh a() {
      return this.e;
   }

   public xy f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xk.b($$0));
   }

   public xy b(xk $$0) {
      this.d.add($$0);
      return this;
   }

   public xy a(UnaryOperator<yh> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xy c(yh $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xy a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xy a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xy b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public azg g() {
      uh $$0 = uh.a();
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
         return !($$0 instanceof xy $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c, this.e, this.d);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder(this.c.toString());
      boolean $$1 = !this.e.h();
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
