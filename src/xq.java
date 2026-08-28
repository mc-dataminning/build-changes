import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xq implements xc {
   private final xd c;
   private final List<xc> d;
   private xz e;
   private azc f = azc.a;
   @Nullable
   private tv g;

   xq(xd $$0, List<xc> $$1, xz $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xq a(xd $$0) {
      return new xq($$0, Lists.newArrayList(), xz.a);
   }

   @Override
   public xd b() {
      return this.c;
   }

   @Override
   public List<xc> c() {
      return this.d;
   }

   public xq b(xz $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xz a() {
      return this.e;
   }

   public xq f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xc.b($$0));
   }

   public xq b(xc $$0) {
      this.d.add($$0);
      return this;
   }

   public xq a(UnaryOperator<xz> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xq c(xz $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xq a(o... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xq a(o $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xq b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public azc g() {
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
         return !($$0 instanceof xq $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
