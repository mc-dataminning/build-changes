import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class vf implements ur {
   private final us c;
   private final List<ur> d;
   private vo e;
   private asy f = asy.a;
   @Nullable
   private ru g;

   vf(us $$0, List<ur> $$1, vo $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static vf a(us $$0) {
      return new vf($$0, Lists.newArrayList(), vo.a);
   }

   @Override
   public us b() {
      return this.c;
   }

   @Override
   public List<ur> c() {
      return this.d;
   }

   public vf b(vo $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public vo a() {
      return this.e;
   }

   public vf f(String $$0) {
      return this.b(ur.b($$0));
   }

   public vf b(ur $$0) {
      this.d.add($$0);
      return this;
   }

   public vf a(UnaryOperator<vo> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public vf c(vo $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public vf a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public vf a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public vf b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public asy g() {
      ru $$0 = ru.a();
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
         return !($$0 instanceof vf $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
