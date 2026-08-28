import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class yd implements xp {
   private final xq c;
   private final List<xp> d;
   private ym e;
   private ayl f = ayl.a;
   @Nullable
   private un g;

   yd(xq $$0, List<xp> $$1, ym $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static yd a(xq $$0) {
      return new yd($$0, Lists.newArrayList(), ym.a);
   }

   @Override
   public xq b() {
      return this.c;
   }

   @Override
   public List<xp> c() {
      return this.d;
   }

   public yd b(ym $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ym a() {
      return this.e;
   }

   public yd f(String $$0) {
      return this.b(xp.b($$0));
   }

   public yd b(xp $$0) {
      this.d.add($$0);
      return this;
   }

   public yd a(UnaryOperator<ym> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public yd c(ym $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public yd a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public yd a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public yd b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayl g() {
      un $$0 = un.a();
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
         return !($$0 instanceof yd $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
