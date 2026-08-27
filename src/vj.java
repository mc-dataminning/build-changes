import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class vj implements uv {
   private final uw c;
   private final List<uv> d;
   private vs e;
   private atc f = atc.a;
   @Nullable
   private ry g;

   vj(uw $$0, List<uv> $$1, vs $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static vj a(uw $$0) {
      return new vj($$0, Lists.newArrayList(), vs.a);
   }

   @Override
   public uw b() {
      return this.c;
   }

   @Override
   public List<uv> c() {
      return this.d;
   }

   public vj b(vs $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public vs a() {
      return this.e;
   }

   public vj f(String $$0) {
      return this.b(uv.b($$0));
   }

   public vj b(uv $$0) {
      this.d.add($$0);
      return this;
   }

   public vj a(UnaryOperator<vs> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public vj c(vs $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public vj a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public vj a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public vj b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public atc g() {
      ry $$0 = ry.a();
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
         return !($$0 instanceof vj $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
