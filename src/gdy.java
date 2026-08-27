import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gdy {
   public static final Comparator<gdy> a = Comparator.<gdy, agi>comparing(gdy::a).thenComparing(gdy::b);
   private final agi b;
   private final agi c;
   @Nullable
   private frc d;

   public gdy(agi $$0, agi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public agi a() {
      return this.b;
   }

   public agi b() {
      return this.c;
   }

   public gbu c() {
      return etd.N().a(this.a()).apply(this.b());
   }

   public frc a(Function<agi, frc> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eoa a(fqu $$0, Function<agi, frc> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eoa a(fqu $$0, Function<agi, frc> $$1, boolean $$2) {
      return this.c().a(fwv.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gdy $$1 = (gdy)$$0;
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
