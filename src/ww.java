import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ww implements wi {
   private final wj c;
   private final List<wi> d;
   private xf e;
   private awy f = awy.a;
   @Nullable
   private tj g;

   ww(wj $$0, List<wi> $$1, xf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ww a(wj $$0) {
      return new ww($$0, Lists.newArrayList(), xf.a);
   }

   @Override
   public wj b() {
      return this.c;
   }

   @Override
   public List<wi> c() {
      return this.d;
   }

   public ww b(xf $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xf a() {
      return this.e;
   }

   public ww f(String $$0) {
      return this.b(wi.b($$0));
   }

   public ww b(wi $$0) {
      this.d.add($$0);
      return this;
   }

   public ww a(UnaryOperator<xf> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public ww c(xf $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public ww a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public ww a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public ww b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public awy g() {
      tj $$0 = tj.a();
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
         return !($$0 instanceof ww $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
