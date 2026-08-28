import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class grb {
   public static final Comparator<grb> a = Comparator.<grb, ale>comparing(grb::a).thenComparing(grb::b);
   private final ale b;
   private final ale c;
   @Nullable
   private gdu d;

   public grb(ale $$0, ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ale a() {
      return this.b;
   }

   public ale b() {
      return this.c;
   }

   public gox c() {
      return ffd.Q().a(this.a()).apply(this.b());
   }

   public gdu a(Function<ale, gdu> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public faa a(gdm $$0, Function<ale, gdu> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public faa a(gdm $$0, Function<ale, gdu> $$1, boolean $$2) {
      return this.c().a(gjt.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         grb $$1 = (grb)$$0;
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
