import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hle {
   public static final Comparator<hle> a = Comparator.<hle, alg>comparing(hle::a).thenComparing(hle::b);
   private final alg b;
   private final alg c;
   @Nullable
   private gqk d;

   public hle(alg $$0, alg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alg a() {
      return this.b;
   }

   public alg b() {
      return this.c;
   }

   public hix c() {
      return foz.Q().a(this.a()).apply(this.b());
   }

   public gqk a(Function<alg, gqk> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fjn a(gqa $$0, Function<alg, gqk> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fjn a(gqa $$0, Function<alg, gqk> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gxf.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hle $$1 = (hle)$$0;
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
