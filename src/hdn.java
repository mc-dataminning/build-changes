import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hdn {
   public static final Comparator<hdn> a = Comparator.<hdn, alz>comparing(hdn::a).thenComparing(hdn::b);
   private final alz b;
   private final alz c;
   @Nullable
   private glo d;

   public hdn(alz $$0, alz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alz a() {
      return this.b;
   }

   public alz b() {
      return this.c;
   }

   public hbe c() {
      return flz.Q().a(this.a()).apply(this.b());
   }

   public glo a(Function<alz, glo> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fgp a(gle $$0, Function<alz, glo> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fgp a(gle $$0, Function<alz, glo> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gsh.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hdn $$1 = (hdn)$$0;
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
