import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hhy {
   public static final Comparator<hhy> a = Comparator.<hhy, aku>comparing(hhy::a).thenComparing(hhy::b);
   private final aku b;
   private final aku c;
   @Nullable
   private gnh d;

   public hhy(aku $$0, aku $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aku a() {
      return this.b;
   }

   public aku b() {
      return this.c;
   }

   public hfr c() {
      return fmg.Q().a(this.a()).apply(this.b());
   }

   public gnh a(Function<aku, gnh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fgv a(gmx $$0, Function<aku, gnh> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fgv a(gmx $$0, Function<aku, gnh> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gub.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hhy $$1 = (hhy)$$0;
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
