import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xo implements xa {
   private final xb c;
   private final List<xa> d;
   private xx e;
   private aza f = aza.a;
   @Nullable
   private tu g;

   xo(xb $$0, List<xa> $$1, xx $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xo a(xb $$0) {
      return new xo($$0, Lists.newArrayList(), xx.a);
   }

   @Override
   public xb b() {
      return this.c;
   }

   @Override
   public List<xa> c() {
      return this.d;
   }

   public xo b(xx $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xx a() {
      return this.e;
   }

   public xo f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xa.b($$0));
   }

   public xo b(xa $$0) {
      this.d.add($$0);
      return this;
   }

   public xo a(UnaryOperator<xx> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xo c(xx $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xo a(o... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xo a(o $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xo b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public aza g() {
      tu $$0 = tu.a();
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
         return !($$0 instanceof xo $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
