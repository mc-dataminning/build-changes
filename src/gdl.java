import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gdl {
   public static final Comparator<gdl> a = Comparator.<gdl, agg>comparing(gdl::a).thenComparing(gdl::b);
   private final agg b;
   private final agg c;
   @Nullable
   private fqp d;

   public gdl(agg $$0, agg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public agg a() {
      return this.b;
   }

   public agg b() {
      return this.c;
   }

   public gbh c() {
      return esr.N().a(this.a()).apply(this.b());
   }

   public fqp a(Function<agg, fqp> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eno a(fqh $$0, Function<agg, fqp> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eno a(fqh $$0, Function<agg, fqp> $$1, boolean $$2) {
      return this.c().a(fwi.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gdl $$1 = (gdl)$$0;
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
