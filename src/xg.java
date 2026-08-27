import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xg implements ws {
   private final wt c;
   private final List<ws> d;
   private xp e;
   private axi f = axi.a;
   @Nullable
   private tt g;

   xg(wt $$0, List<ws> $$1, xp $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xg a(wt $$0) {
      return new xg($$0, Lists.newArrayList(), xp.a);
   }

   @Override
   public wt b() {
      return this.c;
   }

   @Override
   public List<ws> c() {
      return this.d;
   }

   public xg b(xp $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xp a() {
      return this.e;
   }

   public xg f(String $$0) {
      return this.b(ws.b($$0));
   }

   public xg b(ws $$0) {
      this.d.add($$0);
      return this;
   }

   public xg a(UnaryOperator<xp> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xg c(xp $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xg a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xg a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xg b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public axi g() {
      tt $$0 = tt.a();
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
         return !($$0 instanceof xg $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
