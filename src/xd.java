import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xd implements wp {
   private final wq c;
   private final List<wp> d;
   private xm e;
   private ayl f = ayl.a;
   @Nullable
   private tl g;

   xd(wq $$0, List<wp> $$1, xm $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xd a(wq $$0) {
      return new xd($$0, Lists.newArrayList(), xm.a);
   }

   @Override
   public wq b() {
      return this.c;
   }

   @Override
   public List<wp> c() {
      return this.d;
   }

   public xd b(xm $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xm a() {
      return this.e;
   }

   public xd f(String $$0) {
      return $$0.isEmpty() ? this : this.b(wp.b($$0));
   }

   public xd b(wp $$0) {
      this.d.add($$0);
      return this;
   }

   public xd a(UnaryOperator<xm> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xd c(xm $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xd a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xd a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xd b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayl g() {
      tl $$0 = tl.a();
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
         return !($$0 instanceof xd $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
