import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hgy {
   public static final Comparator<hgy> a = Comparator.<hgy, akv>comparing(hgy::a).thenComparing(hgy::b);
   private final akv b;
   private final akv c;
   @Nullable
   private gmh d;

   public hgy(akv $$0, akv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akv a() {
      return this.b;
   }

   public akv b() {
      return this.c;
   }

   public her c() {
      return fli.Q().a(this.a()).apply(this.b());
   }

   public gmh a(Function<akv, gmh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ffx a(glx $$0, Function<akv, gmh> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ffx a(glx $$0, Function<akv, gmh> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gtb.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hgy $$1 = (hgy)$$0;
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
