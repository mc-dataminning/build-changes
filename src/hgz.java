import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hgz {
   public static final Comparator<hgz> a = Comparator.<hgz, akv>comparing(hgz::a).thenComparing(hgz::b);
   private final akv b;
   private final akv c;
   @Nullable
   private gmi d;

   public hgz(akv $$0, akv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akv a() {
      return this.b;
   }

   public akv b() {
      return this.c;
   }

   public hes c() {
      return flj.Q().a(this.a()).apply(this.b());
   }

   public gmi a(Function<akv, gmi> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ffy a(gly $$0, Function<akv, gmi> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ffy a(gly $$0, Function<akv, gmi> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gtc.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hgz $$1 = (hgz)$$0;
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
