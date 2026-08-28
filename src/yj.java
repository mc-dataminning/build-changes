import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class yj implements xv {
   private final xw c;
   private final List<xv> d;
   private ys e;
   private azq f = azq.a;
   @Nullable
   private us g;

   yj(xw $$0, List<xv> $$1, ys $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static yj a(xw $$0) {
      return new yj($$0, Lists.newArrayList(), ys.a);
   }

   @Override
   public xw b() {
      return this.c;
   }

   @Override
   public List<xv> c() {
      return this.d;
   }

   public yj b(ys $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ys a() {
      return this.e;
   }

   public yj f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xv.b($$0));
   }

   public yj b(xv $$0) {
      this.d.add($$0);
      return this;
   }

   public yj a(UnaryOperator<ys> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public yj c(ys $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public yj a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public yj a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public yj b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public azq g() {
      us $$0 = us.a();
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
         return !($$0 instanceof yj $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
