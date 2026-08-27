import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gbi {
   public static final Comparator<gbi> a = Comparator.<gbi, aex>comparing(gbi::a).thenComparing(gbi::b);
   private final aex b;
   private final aex c;
   @Nullable
   private fom d;

   public gbi(aex $$0, aex $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aex a() {
      return this.b;
   }

   public aex b() {
      return this.c;
   }

   public fze c() {
      return eqv.O().a(this.a()).apply(this.b());
   }

   public fom a(Function<aex, fom> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public elt a(foe $$0, Function<aex, fom> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public elt a(foe $$0, Function<aex, fom> $$1, boolean $$2) {
      return this.c().a(fuf.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gbi $$1 = (gbi)$$0;
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
