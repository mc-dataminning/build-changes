import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hbc {
   public static final Comparator<hbc> a = Comparator.<hbc, all>comparing(hbc::a).thenComparing(hbc::b);
   private final all b;
   private final all c;
   @Nullable
   private gjh d;

   public hbc(all $$0, all $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public all a() {
      return this.b;
   }

   public all b() {
      return this.c;
   }

   public gyt c() {
      return fjx.Q().a(this.a()).apply(this.b());
   }

   public gjh a(Function<all, gjh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public feo a(gix $$0, Function<all, gjh> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public feo a(gix $$0, Function<all, gjh> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gpy.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hbc $$1 = (hbc)$$0;
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
