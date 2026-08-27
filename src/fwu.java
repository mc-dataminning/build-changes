import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fwu {
   public static final Comparator<fwu> a = Comparator.<fwu, acq>comparing(fwu::a).thenComparing(fwu::b);
   private final acq b;
   private final acq c;
   @Nullable
   private fkf d;

   public fwu(acq $$0, acq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public acq a() {
      return this.b;
   }

   public acq b() {
      return this.c;
   }

   public fuv c() {
      return enn.N().a(this.a()).apply(this.b());
   }

   public fkf a(Function<acq, fkf> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ein a(fjx $$0, Function<acq, fkf> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ein a(fjx $$0, Function<acq, fkf> $$1, boolean $$2) {
      return this.c().a(fpw.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         fwu $$1 = (fwu)$$0;
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
