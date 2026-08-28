import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hgt {
   public static final Comparator<hgt> a = Comparator.<hgt, aku>comparing(hgt::a).thenComparing(hgt::b);
   private final aku b;
   private final aku c;
   @Nullable
   private gmf d;

   public hgt(aku $$0, aku $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aku a() {
      return this.b;
   }

   public aku b() {
      return this.c;
   }

   public hem c() {
      return flh.Q().a(this.a()).apply(this.b());
   }

   public gmf a(Function<aku, gmf> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ffw a(glv $$0, Function<aku, gmf> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ffw a(glv $$0, Function<aku, gmf> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gsz.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hgt $$1 = (hgt)$$0;
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
