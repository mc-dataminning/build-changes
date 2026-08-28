import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class grd {
   public static final Comparator<grd> a = Comparator.<grd, alf>comparing(grd::a).thenComparing(grd::b);
   private final alf b;
   private final alf c;
   @Nullable
   private gdw d;

   public grd(alf $$0, alf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alf a() {
      return this.b;
   }

   public alf b() {
      return this.c;
   }

   public goz c() {
      return fff.Q().a(this.a()).apply(this.b());
   }

   public gdw a(Function<alf, gdw> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fac a(gdo $$0, Function<alf, gdw> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fac a(gdo $$0, Function<alf, gdw> $$1, boolean $$2) {
      return this.c().a(gjv.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         grd $$1 = (grd)$$0;
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
