import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ghe {
   public static final Comparator<ghe> a = Comparator.<ghe, ahh>comparing(ghe::a).thenComparing(ghe::b);
   private final ahh b;
   private final ahh c;
   @Nullable
   private fub d;

   public ghe(ahh $$0, ahh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ahh a() {
      return this.b;
   }

   public ahh b() {
      return this.c;
   }

   public gfb c() {
      return evr.O().a(this.a()).apply(this.b());
   }

   public fub a(Function<ahh, fub> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eqo a(ftt $$0, Function<ahh, fub> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eqo a(ftt $$0, Function<ahh, fub> $$1, boolean $$2) {
      return this.c().a(fzy.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ghe $$1 = (ghe)$$0;
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
