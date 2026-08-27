import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ggo {
   public static final Comparator<ggo> a = Comparator.<ggo, ahg>comparing(ggo::a).thenComparing(ggo::b);
   private final ahg b;
   private final ahg c;
   @Nullable
   private ftn d;

   public ggo(ahg $$0, ahg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ahg a() {
      return this.b;
   }

   public ahg b() {
      return this.c;
   }

   public gel c() {
      return evg.O().a(this.a()).apply(this.b());
   }

   public ftn a(Function<ahg, ftn> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eqd a(ftf $$0, Function<ahg, ftn> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eqd a(ftf $$0, Function<ahg, ftn> $$1, boolean $$2) {
      return this.c().a(fzj.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ggo $$1 = (ggo)$$0;
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
