import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gay {
   public static final Comparator<gay> a = Comparator.<gay, aer>comparing(gay::a).thenComparing(gay::b);
   private final aer b;
   private final aer c;
   @Nullable
   private foc d;

   public gay(aer $$0, aer $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aer a() {
      return this.b;
   }

   public aer b() {
      return this.c;
   }

   public fyu c() {
      return eql.O().a(this.a()).apply(this.b());
   }

   public foc a(Function<aer, foc> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public elj a(fnu $$0, Function<aer, foc> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public elj a(fnu $$0, Function<aer, foc> $$1, boolean $$2) {
      return this.c().a(ftv.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gay $$1 = (gay)$$0;
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
