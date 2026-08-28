import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hkg {
   public static final Comparator<hkg> a = Comparator.<hkg, ale>comparing(hkg::a).thenComparing(hkg::b);
   private final ale b;
   private final ale c;
   @Nullable
   private gpn d;

   public hkg(ale $$0, ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ale a() {
      return this.b;
   }

   public ale b() {
      return this.c;
   }

   public hhz c() {
      return fof.Q().a(this.a()).apply(this.b());
   }

   public gpn a(Function<ale, gpn> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fiu a(gpd $$0, Function<ale, gpn> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fiu a(gpd $$0, Function<ale, gpn> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gwi.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hkg $$1 = (hkg)$$0;
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
