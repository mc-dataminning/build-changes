import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gnm {
   public static final Comparator<gnm> a = Comparator.<gnm, ajt>comparing(gnm::a).thenComparing(gnm::b);
   private final ajt b;
   private final ajt c;
   @Nullable
   private gah d;

   public gnm(ajt $$0, ajt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ajt a() {
      return this.b;
   }

   public ajt b() {
      return this.c;
   }

   public glj c() {
      return fbp.Q().a(this.a()).apply(this.b());
   }

   public gah a(Function<ajt, gah> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ewm a(fzz $$0, Function<ajt, gah> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ewm a(fzz $$0, Function<ajt, gah> $$1, boolean $$2) {
      return this.c().a(ggg.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gnm $$1 = (gnm)$$0;
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
