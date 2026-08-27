import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xs implements xe {
   private final xf c;
   private final List<xe> d;
   private yb e;
   private axy f = axy.a;
   @Nullable
   private uf g;

   xs(xf $$0, List<xe> $$1, yb $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xs a(xf $$0) {
      return new xs($$0, Lists.newArrayList(), yb.a);
   }

   @Override
   public xf b() {
      return this.c;
   }

   @Override
   public List<xe> c() {
      return this.d;
   }

   public xs b(yb $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public yb a() {
      return this.e;
   }

   public xs f(String $$0) {
      return this.a(xe.b($$0));
   }

   public xs a(xe... $$0) {
      this.d.addAll(Arrays.asList($$0));
      return this;
   }

   public xs a(Object... $$0) {
      for (Object $$1 : $$0) {
         if ($$1 instanceof xe $$2) {
            this.a($$2);
         } else {
            if (!($$1 instanceof String $$3)) {
               throw new IllegalArgumentException("Don't know how to turn " + $$1 + " into a Component");
            }

            this.a(xe.b($$3));
         }
      }

      return this;
   }

   public xs a(UnaryOperator<yb> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xs c(yb $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xs a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xs a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xs b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public axy g() {
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
         return !($$0 instanceof xs $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
