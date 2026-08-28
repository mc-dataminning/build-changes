import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hnh {
   public static final Comparator<hnh> a = Comparator.<hnh, ali>comparing(hnh::a).thenComparing(hnh::b);
   private final ali b;
   private final ali c;
   @Nullable
   private gsl d;

   public hnh(ali $$0, ali $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ali a() {
      return this.b;
   }

   public ali b() {
      return this.c;
   }

   public hla c() {
      return frd.Q().a(this.a()).apply(this.b());
   }

   public gsl a(Function<ali, gsl> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public flr a(gsa $$0, Function<ali, gsl> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public flr a(gsa $$0, Function<ali, gsl> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gzg.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hnh $$1 = (hnh)$$0;
         return this.b.equals($$1.b) && this.c.equals($$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c);
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.b + ", texture=" + this.c + "}";
   }
}
