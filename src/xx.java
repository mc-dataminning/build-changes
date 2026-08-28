import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xx implements xj {
   private final xk c;
   private final List<xj> d;
   private yg e;
   private ayy f = ayy.a;
   @Nullable
   private ug g;

   xx(xk $$0, List<xj> $$1, yg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xx a(xk $$0) {
      return new xx($$0, Lists.newArrayList(), yg.a);
   }

   @Override
   public xk b() {
      return this.c;
   }

   @Override
   public List<xj> c() {
      return this.d;
   }

   public xx b(yg $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public yg a() {
      return this.e;
   }

   public xx f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xj.b($$0));
   }

   public xx b(xj $$0) {
      this.d.add($$0);
      return this;
   }

   public xx a(UnaryOperator<yg> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xx c(yg $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xx a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xx a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xx b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayy g() {
      ug $$0 = ug.a();
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
         return !($$0 instanceof xx $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
