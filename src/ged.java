import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ged {
   public static final Comparator<ged> a = Comparator.<ged, agm>comparing(ged::a).thenComparing(ged::b);
   private final agm b;
   private final agm c;
   @Nullable
   private frh d;

   public ged(agm $$0, agm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public agm a() {
      return this.b;
   }

   public agm b() {
      return this.c;
   }

   public gbz c() {
      return eti.N().a(this.a()).apply(this.b());
   }

   public frh a(Function<agm, frh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eof a(fqz $$0, Function<agm, frh> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eof a(fqz $$0, Function<agm, frh> $$1, boolean $$2) {
      return this.c().a(fxa.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ged $$1 = (ged)$$0;
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
