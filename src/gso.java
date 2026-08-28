import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gso {
   public static final Comparator<gso> a = Comparator.<gso, akr>comparing(gso::a).thenComparing(gso::b);
   private final akr b;
   private final akr c;
   @Nullable
   private gff d;

   public gso(akr $$0, akr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akr a() {
      return this.b;
   }

   public akr b() {
      return this.c;
   }

   public gqj c() {
      return fgm.Q().a(this.a()).apply(this.b());
   }

   public gff a(Function<akr, gff> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fbk a(gex $$0, Function<akr, gff> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fbk a(gex $$0, Function<akr, gff> $$1, boolean $$2) {
      return this.c().a(glf.b($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gso $$1 = (gso)$$0;
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
