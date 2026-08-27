import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ts implements tf {
   private final tg c;
   private final List<tf> d;
   private ub e;
   private arc f = arc.a;
   @Nullable
   private qm g;

   ts(tg $$0, List<tf> $$1, ub $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ts a(tg $$0) {
      return new ts($$0, Lists.newArrayList(), ub.a);
   }

   @Override
   public tg b() {
      return this.c;
   }

   @Override
   public List<tf> c() {
      return this.d;
   }

   public ts b(ub $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ub a() {
      return this.e;
   }

   public ts f(String $$0) {
      return this.b(tf.b($$0));
   }

   public ts b(tf $$0) {
      this.d.add($$0);
      return this;
   }

   public ts a(UnaryOperator<ub> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public ts c(ub $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public ts a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public ts a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public arc f() {
      qm $$0 = qm.a();
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
         return !($$0 instanceof ts $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
