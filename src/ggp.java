import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ggp {
   public static final Comparator<ggp> a = Comparator.<ggp, ahg>comparing(ggp::a).thenComparing(ggp::b);
   private final ahg b;
   private final ahg c;
   @Nullable
   private fto d;

   public ggp(ahg $$0, ahg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ahg a() {
      return this.b;
   }

   public ahg b() {
      return this.c;
   }

   public gem c() {
      return evh.O().a(this.a()).apply(this.b());
   }

   public fto a(Function<ahg, fto> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eqe a(ftg $$0, Function<ahg, fto> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eqe a(ftg $$0, Function<ahg, fto> $$1, boolean $$2) {
      return this.c().a(fzk.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ggp $$1 = (ggp)$$0;
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
