import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gnv {
   public static final Comparator<gnv> a = Comparator.<gnv, ajv>comparing(gnv::a).thenComparing(gnv::b);
   private final ajv b;
   private final ajv c;
   @Nullable
   private gaq d;

   public gnv(ajv $$0, ajv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ajv a() {
      return this.b;
   }

   public ajv b() {
      return this.c;
   }

   public gls c() {
      return fby.Q().a(this.a()).apply(this.b());
   }

   public gaq a(Function<ajv, gaq> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ewv a(gai $$0, Function<ajv, gaq> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ewv a(gai $$0, Function<ajv, gaq> $$1, boolean $$2) {
      return this.c().a(ggp.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gnv $$1 = (gnv)$$0;
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
