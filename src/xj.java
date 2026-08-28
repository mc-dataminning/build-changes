import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xj implements wv {
   private final ww c;
   private final List<wv> d;
   private xs e;
   private ayw f = ayw.a;
   @Nullable
   private tr g;

   xj(ww $$0, List<wv> $$1, xs $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xj a(ww $$0) {
      return new xj($$0, Lists.newArrayList(), xs.a);
   }

   @Override
   public ww b() {
      return this.c;
   }

   @Override
   public List<wv> c() {
      return this.d;
   }

   public xj b(xs $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xs a() {
      return this.e;
   }

   public xj f(String $$0) {
      return $$0.isEmpty() ? this : this.b(wv.b($$0));
   }

   public xj b(wv $$0) {
      this.d.add($$0);
      return this;
   }

   public xj a(UnaryOperator<xs> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xj c(xs $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xj a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xj a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xj b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayw g() {
      tr $$0 = tr.a();
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
         return !($$0 instanceof xj $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
