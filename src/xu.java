import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class xu implements xg {
   private final xh c;
   private final List<xg> d;
   private yd e;
   private azk f = azk.a;
   @Nullable
   private tv g;

   xu(xh $$0, List<xg> $$1, yd $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static xu a(xh $$0) {
      return new xu($$0, Lists.newArrayList(), yd.a);
   }

   @Override
   public xh b() {
      return this.c;
   }

   @Override
   public List<xg> c() {
      return this.d;
   }

   public xu b(yd $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public yd a() {
      return this.e;
   }

   public xu f(String $$0) {
      return $$0.isEmpty() ? this : this.b(xg.b($$0));
   }

   public xu b(xg $$0) {
      this.d.add($$0);
      return this;
   }

   public xu a(UnaryOperator<yd> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public xu c(yd $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public xu a(o... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public xu a(o $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public xu b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public azk g() {
      tv $$0 = tv.a();
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
         return !($$0 instanceof xu $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
