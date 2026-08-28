import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gzm {
   public static final Comparator<gzm> a = Comparator.<gzm, ale>comparing(gzm::a).thenComparing(gzm::b);
   private final ale b;
   private final ale c;
   @Nullable
   private ghv d;

   public gzm(ale $$0, ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ale a() {
      return this.b;
   }

   public ale b() {
      return this.c;
   }

   public gxg c() {
      return fip.Q().a(this.a()).apply(this.b());
   }

   public ghv a(Function<ale, ghv> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fdm a(ghl $$0, Function<ale, ghv> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fdm a(ghl $$0, Function<ale, ghv> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gom.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gzm $$1 = (gzm)$$0;
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
