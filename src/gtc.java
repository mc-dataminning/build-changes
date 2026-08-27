import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gtc {
   public static final Comparator<gtc> a = Comparator.<gtc, akt>comparing(gtc::a).thenComparing(gtc::b);
   private final akt b;
   private final akt c;
   @Nullable
   private gfo d;

   public gtc(akt $$0, akt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akt a() {
      return this.b;
   }

   public akt b() {
      return this.c;
   }

   public gqy c() {
      return fgj.Q().a(this.a()).apply(this.b());
   }

   public gfo a(Function<akt, gfo> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fbg a(gfg $$0, Function<akt, gfo> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fbg a(gfg $$0, Function<akt, gfo> $$1, boolean $$2) {
      return this.c().a(glp.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gtc $$1 = (gtc)$$0;
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
