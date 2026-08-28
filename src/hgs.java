import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hgs {
   public static final Comparator<hgs> a = Comparator.<hgs, aku>comparing(hgs::a).thenComparing(hgs::b);
   private final aku b;
   private final aku c;
   @Nullable
   private gmh d;

   public hgs(aku $$0, aku $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aku a() {
      return this.b;
   }

   public aku b() {
      return this.c;
   }

   public hej c() {
      return flj.Q().a(this.a()).apply(this.b());
   }

   public gmh a(Function<aku, gmh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ffy a(glx $$0, Function<aku, gmh> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ffy a(glx $$0, Function<aku, gmh> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gta.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hgs $$1 = (hgs)$$0;
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
