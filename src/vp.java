import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class vp implements vb {
   private final vc c;
   private final List<vb> d;
   private vy e;
   private atk f = atk.a;
   @Nullable
   private se g;

   vp(vc $$0, List<vb> $$1, vy $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static vp a(vc $$0) {
      return new vp($$0, Lists.newArrayList(), vy.a);
   }

   @Override
   public vc b() {
      return this.c;
   }

   @Override
   public List<vb> c() {
      return this.d;
   }

   public vp b(vy $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public vy a() {
      return this.e;
   }

   public vp f(String $$0) {
      return this.b(vb.b($$0));
   }

   public vp b(vb $$0) {
      this.d.add($$0);
      return this;
   }

   public vp a(UnaryOperator<vy> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public vp c(vy $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public vp a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public vp a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public vp b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public atk g() {
      se $$0 = se.a();
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
         return !($$0 instanceof vp $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
