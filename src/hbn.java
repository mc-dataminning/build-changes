import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hbn {
   public static final Comparator<hbn> a = Comparator.<hbn, alj>comparing(hbn::a).thenComparing(hbn::b);
   private final alj b;
   private final alj c;
   @Nullable
   private gjq d;

   public hbn(alj $$0, alj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alj a() {
      return this.b;
   }

   public alj b() {
      return this.c;
   }

   public gze c() {
      return fke.Q().a(this.a()).apply(this.b());
   }

   public gjq a(Function<alj, gjq> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fev a(gjg $$0, Function<alj, gjq> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fev a(gjg $$0, Function<alj, gjq> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gqi.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hbn $$1 = (hbn)$$0;
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
