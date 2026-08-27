import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ggq {
   public static final Comparator<ggq> a = Comparator.<ggq, ahg>comparing(ggq::a).thenComparing(ggq::b);
   private final ahg b;
   private final ahg c;
   @Nullable
   private ftp d;

   public ggq(ahg $$0, ahg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ahg a() {
      return this.b;
   }

   public ahg b() {
      return this.c;
   }

   public gen c() {
      return evi.O().a(this.a()).apply(this.b());
   }

   public ftp a(Function<ahg, ftp> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eqf a(fth $$0, Function<ahg, ftp> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eqf a(fth $$0, Function<ahg, ftp> $$1, boolean $$2) {
      return this.c().a(fzl.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ggq $$1 = (ggq)$$0;
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
