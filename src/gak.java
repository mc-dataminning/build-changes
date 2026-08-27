import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gak {
   public static final Comparator<gak> a = Comparator.<gak, aep>comparing(gak::a).thenComparing(gak::b);
   private final aep b;
   private final aep c;
   @Nullable
   private fno d;

   public gak(aep $$0, aep $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aep a() {
      return this.b;
   }

   public aep b() {
      return this.c;
   }

   public fyg c() {
      return eqn.N().a(this.a()).apply(this.b());
   }

   public fno a(Function<aep, fno> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ell a(fng $$0, Function<aep, fno> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ell a(fng $$0, Function<aep, fno> $$1, boolean $$2) {
      return this.c().a(fth.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gak $$1 = (gak)$$0;
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
