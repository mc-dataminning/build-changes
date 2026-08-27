import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class tr implements te {
   private final tf c;
   private final List<te> d;
   private ua e;
   private ara f = ara.a;
   @Nullable
   private qn g;

   tr(tf $$0, List<te> $$1, ua $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static tr a(tf $$0) {
      return new tr($$0, Lists.newArrayList(), ua.a);
   }

   @Override
   public tf b() {
      return this.c;
   }

   @Override
   public List<te> c() {
      return this.d;
   }

   public tr b(ua $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ua a() {
      return this.e;
   }

   public tr f(String $$0) {
      return this.b(te.b($$0));
   }

   public tr b(te $$0) {
      this.d.add($$0);
      return this;
   }

   public tr a(UnaryOperator<ua> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public tr c(ua $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public tr a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public tr a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public ara f() {
      qn $$0 = qn.a();
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
         return !($$0 instanceof tr $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
