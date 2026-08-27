import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class wi implements vu {
   private final vv c;
   private final List<vu> d;
   private wr e;
   private awi f = awi.a;
   @Nullable
   private sv g;

   wi(vv $$0, List<vu> $$1, wr $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static wi a(vv $$0) {
      return new wi($$0, Lists.newArrayList(), wr.a);
   }

   @Override
   public vv b() {
      return this.c;
   }

   @Override
   public List<vu> c() {
      return this.d;
   }

   public wi b(wr $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public wr a() {
      return this.e;
   }

   public wi f(String $$0) {
      return this.b(vu.b($$0));
   }

   public wi b(vu $$0) {
      this.d.add($$0);
      return this;
   }

   public wi a(UnaryOperator<wr> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public wi c(wr $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public wi a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public wi a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public wi b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public awi g() {
      sv $$0 = sv.a();
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
         return !($$0 instanceof wi $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
