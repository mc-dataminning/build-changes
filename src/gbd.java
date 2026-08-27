import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gbd {
   public static final Comparator<gbd> a = Comparator.<gbd, aeu>comparing(gbd::a).thenComparing(gbd::b);
   private final aeu b;
   private final aeu c;
   @Nullable
   private foh d;

   public gbd(aeu $$0, aeu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aeu a() {
      return this.b;
   }

   public aeu b() {
      return this.c;
   }

   public fyz c() {
      return eqq.O().a(this.a()).apply(this.b());
   }

   public foh a(Function<aeu, foh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public elo a(fnz $$0, Function<aeu, foh> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public elo a(fnz $$0, Function<aeu, foh> $$1, boolean $$2) {
      return this.c().a(fua.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gbd $$1 = (gbd)$$0;
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
