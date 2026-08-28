import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xv implements xh {
   private final xi c;
   private final List<xh> d;
   private ye e;
   private ayv f = ayv.a;
   @Nullable
   private ue g;

   xv(xi $$0, List<xh> $$1, ye $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xv a(xi $$0) {
      return new xv($$0, Lists.newArrayList(), ye.a);
   }

   @Override
   public xi b() {
      return this.c;
   }

   @Override
   public List<xh> c() {
      return this.d;
   }

   public xv b(ye $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ye a() {
      return this.e;
   }

   public xv f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xh.b($$0));
   }

   public xv b(xh $$0) {
      this.d.add($$0);
      return this;
   }

   public xv a(UnaryOperator<ye> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xv c(ye $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xv a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xv a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xv b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayv g() {
      ue $$0 = ue.a();
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
         return !($$0 instanceof xv $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
