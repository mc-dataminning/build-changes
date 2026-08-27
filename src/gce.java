import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gce {
   public static final Comparator<gce> a = Comparator.<gce, afw>comparing(gce::a).thenComparing(gce::b);
   private final afw b;
   private final afw c;
   @Nullable
   private fpj d;

   public gce(afw $$0, afw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public afw a() {
      return this.b;
   }

   public afw b() {
      return this.c;
   }

   public gaa c() {
      return ero.O().a(this.a()).apply(this.b());
   }

   public fpj a(Function<afw, fpj> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eml a(fpb $$0, Function<afw, fpj> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eml a(fpb $$0, Function<afw, fpj> $$1, boolean $$2) {
      return this.c().a(fvb.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gce $$1 = (gce)$$0;
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
