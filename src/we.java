import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class we implements vq {
   private final vr c;
   private final List<vq> d;
   private wn e;
   private avu f = avu.a;
   @Nullable
   private sr g;

   we(vr $$0, List<vq> $$1, wn $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static we a(vr $$0) {
      return new we($$0, Lists.newArrayList(), wn.a);
   }

   @Override
   public vr b() {
      return this.c;
   }

   @Override
   public List<vq> c() {
      return this.d;
   }

   public we b(wn $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public wn a() {
      return this.e;
   }

   public we f(String $$0) {
      return this.b(vq.b($$0));
   }

   public we b(vq $$0) {
      this.d.add($$0);
      return this;
   }

   public we a(UnaryOperator<wn> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public we c(wn $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public we a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public we a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public we b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public avu g() {
      sr $$0 = sr.a();
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
         return !($$0 instanceof we $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
