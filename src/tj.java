import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class tj implements sw {
   private final sx c;
   private final List<sw> d;
   private ts e;
   private aom f = aom.a;
   @Nullable
   private qm g;

   tj(sx $$0, List<sw> $$1, ts $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static tj a(sx $$0) {
      return new tj($$0, Lists.newArrayList(), ts.a);
   }

   @Override
   public sx b() {
      return this.c;
   }

   @Override
   public List<sw> c() {
      return this.d;
   }

   public tj b(ts $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ts a() {
      return this.e;
   }

   public tj f(String $$0) {
      return this.b(sw.b($$0));
   }

   public tj b(sw $$0) {
      this.d.add($$0);
      return this;
   }

   public tj a(UnaryOperator<ts> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public tj c(ts $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public tj a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public tj a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public aom f() {
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
         return !($$0 instanceof tj $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
