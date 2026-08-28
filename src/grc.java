import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class grc {
   public static final Comparator<grc> a = Comparator.<grc, ale>comparing(grc::a).thenComparing(grc::b);
   private final ale b;
   private final ale c;
   @Nullable
   private gdv d;

   public grc(ale $$0, ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ale a() {
      return this.b;
   }

   public ale b() {
      return this.c;
   }

   public goy c() {
      return ffe.Q().a(this.a()).apply(this.b());
   }

   public gdv a(Function<ale, gdv> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fab a(gdn $$0, Function<ale, gdv> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fab a(gdn $$0, Function<ale, gdv> $$1, boolean $$2) {
      return this.c().a(gju.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         grc $$1 = (grc)$$0;
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
