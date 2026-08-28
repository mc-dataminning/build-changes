import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xc implements wo {
   private final wp c;
   private final List<wo> d;
   private xl e;
   private ayl f = ayl.a;
   @Nullable
   private tl g;

   xc(wp $$0, List<wo> $$1, xl $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xc a(wp $$0) {
      return new xc($$0, Lists.newArrayList(), xl.a);
   }

   @Override
   public wp b() {
      return this.c;
   }

   @Override
   public List<wo> c() {
      return this.d;
   }

   public xc b(xl $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xl a() {
      return this.e;
   }

   public xc f(String $$0) {
      return $$0.isEmpty() ? this : this.b(wo.b($$0));
   }

   public xc b(wo $$0) {
      this.d.add($$0);
      return this;
   }

   public xc a(UnaryOperator<xl> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xc c(xl $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xc a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xc a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xc b(int $$0) {
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
         return !($$0 instanceof xc $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
