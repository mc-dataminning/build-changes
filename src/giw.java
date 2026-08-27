import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class giw {
   public static final Comparator<giw> a = Comparator.<giw, aiy>comparing(giw::a).thenComparing(giw::b);
   private final aiy b;
   private final aiy c;
   @Nullable
   private fvt d;

   public giw(aiy $$0, aiy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aiy a() {
      return this.b;
   }

   public aiy b() {
      return this.c;
   }

   public ggt c() {
      return exh.O().a(this.a()).apply(this.b());
   }

   public fvt a(Function<aiy, fvt> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ese a(fvl $$0, Function<aiy, fvt> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ese a(fvl $$0, Function<aiy, fvt> $$1, boolean $$2) {
      return this.c().a(gbq.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         giw $$1 = (giw)$$0;
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
