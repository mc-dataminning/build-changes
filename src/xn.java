import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xn implements wz {
   private final xa c;
   private final List<wz> d;
   private xw e;
   private aya f = aya.a;
   @Nullable
   private tw g;

   xn(xa $$0, List<wz> $$1, xw $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xn a(xa $$0) {
      return new xn($$0, Lists.newArrayList(), xw.a);
   }

   @Override
   public xa b() {
      return this.c;
   }

   @Override
   public List<wz> c() {
      return this.d;
   }

   public xn b(xw $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xw a() {
      return this.e;
   }

   public xn f(String $$0) {
      return $$0.isEmpty() ? this : this.b(wz.b($$0));
   }

   public xn b(wz $$0) {
      this.d.add($$0);
      return this;
   }

   public xn a(UnaryOperator<xw> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xn c(xw $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xn a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xn a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xn b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public aya g() {
      tw $$0 = tw.a();
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
         return !($$0 instanceof xn $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
