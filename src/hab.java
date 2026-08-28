import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hab {
   public static final Comparator<hab> a = Comparator.<hab, alh>comparing(hab::a).thenComparing(hab::b);
   private final alh b;
   private final alh c;
   @Nullable
   private gig d;

   public hab(alh $$0, alh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alh a() {
      return this.b;
   }

   public alh b() {
      return this.c;
   }

   public gxs c() {
      return fja.Q().a(this.a()).apply(this.b());
   }

   public gig a(Function<alh, gig> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fdx a(ghw $$0, Function<alh, gig> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fdx a(ghw $$0, Function<alh, gig> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gox.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hab $$1 = (hab)$$0;
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
