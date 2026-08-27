import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gbe {
   public static final Comparator<gbe> a = Comparator.<gbe, aez>comparing(gbe::a).thenComparing(gbe::b);
   private final aez b;
   private final aez c;
   @Nullable
   private foi d;

   public gbe(aez $$0, aez $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aez a() {
      return this.b;
   }

   public aez b() {
      return this.c;
   }

   public fza c() {
      return eqp.O().a(this.a()).apply(this.b());
   }

   public foi a(Function<aez, foi> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eln a(foa $$0, Function<aez, foi> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eln a(foa $$0, Function<aez, foi> $$1, boolean $$2) {
      return this.c().a(fub.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gbe $$1 = (gbe)$$0;
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
