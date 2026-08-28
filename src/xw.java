import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xw implements xi {
   private final xj c;
   private final List<xi> d;
   private yf e;
   private ayw f = ayw.a;
   @Nullable
   private uf g;

   xw(xj $$0, List<xi> $$1, yf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xw a(xj $$0) {
      return new xw($$0, Lists.newArrayList(), yf.a);
   }

   @Override
   public xj b() {
      return this.c;
   }

   @Override
   public List<xi> c() {
      return this.d;
   }

   public xw b(yf $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public yf a() {
      return this.e;
   }

   public xw f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xi.b($$0));
   }

   public xw b(xi $$0) {
      this.d.add($$0);
      return this;
   }

   public xw a(UnaryOperator<yf> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xw c(yf $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xw a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xw a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xw b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayw g() {
      uf $$0 = uf.a();
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
         return !($$0 instanceof xw $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
