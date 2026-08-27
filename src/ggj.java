import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ggj {
   public static final Comparator<ggj> a = Comparator.<ggj, ahd>comparing(ggj::a).thenComparing(ggj::b);
   private final ahd b;
   private final ahd c;
   @Nullable
   private fth d;

   public ggj(ahd $$0, ahd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ahd a() {
      return this.b;
   }

   public ahd b() {
      return this.c;
   }

   public gef c() {
      return eva.N().a(this.a()).apply(this.b());
   }

   public fth a(Function<ahd, fth> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public epx a(fsz $$0, Function<ahd, fth> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public epx a(fsz $$0, Function<ahd, fth> $$1, boolean $$2) {
      return this.c().a(fzd.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ggj $$1 = (ggj)$$0;
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
