import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hlx {
   public static final Comparator<hlx> a = Comparator.<hlx, alg>comparing(hlx::a).thenComparing(hlx::b);
   private final alg b;
   private final alg c;
   @Nullable
   private grc d;

   public hlx(alg $$0, alg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alg a() {
      return this.b;
   }

   public alg b() {
      return this.c;
   }

   public hjq c() {
      return fpt.Q().a(this.a()).apply(this.b());
   }

   public grc a(Function<alg, grc> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fkh a(gqr $$0, Function<alg, grc> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fkh a(gqr $$0, Function<alg, grc> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gxw.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hlx $$1 = (hlx)$$0;
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
