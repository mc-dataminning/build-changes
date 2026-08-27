import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gix {
   public static final Comparator<gix> a = Comparator.<gix, aiy>comparing(gix::a).thenComparing(gix::b);
   private final aiy b;
   private final aiy c;
   @Nullable
   private fvu d;

   public gix(aiy $$0, aiy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aiy a() {
      return this.b;
   }

   public aiy b() {
      return this.c;
   }

   public ggu c() {
      return exh.O().a(this.a()).apply(this.b());
   }

   public fvu a(Function<aiy, fvu> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ese a(fvm $$0, Function<aiy, fvu> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ese a(fvm $$0, Function<aiy, fvu> $$1, boolean $$2) {
      return this.c().a(gbr.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gix $$1 = (gix)$$0;
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
