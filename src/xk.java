import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xk implements ww {
   private final wx c;
   private final List<ww> d;
   private xt e;
   private ayw f = ayw.a;
   @Nullable
   private ts g;

   xk(wx $$0, List<ww> $$1, xt $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xk a(wx $$0) {
      return new xk($$0, Lists.newArrayList(), xt.a);
   }

   @Override
   public wx b() {
      return this.c;
   }

   @Override
   public List<ww> c() {
      return this.d;
   }

   public xk b(xt $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xt a() {
      return this.e;
   }

   public xk f(String $$0) {
      return $$0.isEmpty() ? this : this.b(ww.b($$0));
   }

   public xk b(ww $$0) {
      this.d.add($$0);
      return this;
   }

   public xk a(UnaryOperator<xt> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xk c(xt $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xk a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xk a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xk b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayw g() {
      ts $$0 = ts.a();
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
         return !($$0 instanceof xk $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
