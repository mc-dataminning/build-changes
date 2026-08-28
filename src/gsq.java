import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gsq {
   public static final Comparator<gsq> a = Comparator.<gsq, akr>comparing(gsq::a).thenComparing(gsq::b);
   private final akr b;
   private final akr c;
   @Nullable
   private gfh d;

   public gsq(akr $$0, akr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akr a() {
      return this.b;
   }

   public akr b() {
      return this.c;
   }

   public gql c() {
      return fgo.Q().a(this.a()).apply(this.b());
   }

   public gfh a(Function<akr, gfh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fbm a(gez $$0, Function<akr, gfh> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fbm a(gez $$0, Function<akr, gfh> $$1, boolean $$2) {
      return this.c().a(glh.b($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gsq $$1 = (gsq)$$0;
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
