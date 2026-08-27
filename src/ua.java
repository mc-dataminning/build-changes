import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ua implements tn {
   private final to c;
   private final List<tn> d;
   private uj e;
   private arl f = arl.a;
   @Nullable
   private qt g;

   ua(to $$0, List<tn> $$1, uj $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ua a(to $$0) {
      return new ua($$0, Lists.newArrayList(), uj.a);
   }

   @Override
   public to b() {
      return this.c;
   }

   @Override
   public List<tn> c() {
      return this.d;
   }

   public ua b(uj $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public uj a() {
      return this.e;
   }

   public ua f(String $$0) {
      return this.b(tn.b($$0));
   }

   public ua b(tn $$0) {
      this.d.add($$0);
      return this;
   }

   public ua a(UnaryOperator<uj> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public ua c(uj $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public ua a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public ua a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public arl f() {
      qt $$0 = qt.a();
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
         return !($$0 instanceof ua $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
