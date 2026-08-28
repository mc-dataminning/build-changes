import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hha {
   public static final Comparator<hha> a = Comparator.<hha, akv>comparing(hha::a).thenComparing(hha::b);
   private final akv b;
   private final akv c;
   @Nullable
   private gmj d;

   public hha(akv $$0, akv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akv a() {
      return this.b;
   }

   public akv b() {
      return this.c;
   }

   public het c() {
      return flk.Q().a(this.a()).apply(this.b());
   }

   public gmj a(Function<akv, gmj> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ffz a(glz $$0, Function<akv, gmj> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ffz a(glz $$0, Function<akv, gmj> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gtd.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hha $$1 = (hha)$$0;
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
