import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hmx {
   public static final Comparator<hmx> a = Comparator.<hmx, alr>comparing(hmx::a).thenComparing(hmx::b);
   private final alr b;
   private final alr c;
   @Nullable
   private gry d;

   public hmx(alr $$0, alr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alr a() {
      return this.b;
   }

   public alr b() {
      return this.c;
   }

   public hkq c() {
      return fqq.Q().a(this.a()).apply(this.b());
   }

   public gry a(Function<alr, gry> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public flg a(grn $$0, Function<alr, gry> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public flg a(grn $$0, Function<alr, gry> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gyt.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hmx $$1 = (hmx)$$0;
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
