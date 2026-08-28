import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hlq {
   public static final Comparator<hlq> a = Comparator.<hlq, alg>comparing(hlq::a).thenComparing(hlq::b);
   private final alg b;
   private final alg c;
   @Nullable
   private gqx d;

   public hlq(alg $$0, alg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alg a() {
      return this.b;
   }

   public alg b() {
      return this.c;
   }

   public hjk c() {
      return fpo.Q().a(this.a()).apply(this.b());
   }

   public gqx a(Function<alg, gqx> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fkc a(gqm $$0, Function<alg, gqx> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fkc a(gqm $$0, Function<alg, gqx> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gxr.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hlq $$1 = (hlq)$$0;
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
