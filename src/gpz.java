import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gpz {
   public static final Comparator<gpz> a = Comparator.<gpz, akn>comparing(gpz::a).thenComparing(gpz::b);
   private final akn b;
   private final akn c;
   @Nullable
   private gcs d;

   public gpz(akn $$0, akn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akn a() {
      return this.b;
   }

   public akn b() {
      return this.c;
   }

   public gnv c() {
      return feb.Q().a(this.a()).apply(this.b());
   }

   public gcs a(Function<akn, gcs> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eyy a(gck $$0, Function<akn, gcs> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eyy a(gck $$0, Function<akn, gcs> $$1, boolean $$2) {
      return this.c().a(gir.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gpz $$1 = (gpz)$$0;
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
