import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hiz {
   public static final Comparator<hiz> a = Comparator.<hiz, ald>comparing(hiz::a).thenComparing(hiz::b);
   private final ald b;
   private final ald c;
   @Nullable
   private goi d;

   public hiz(ald $$0, ald $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ald a() {
      return this.b;
   }

   public ald b() {
      return this.c;
   }

   public hgs c() {
      return fnd.Q().a(this.a()).apply(this.b());
   }

   public goi a(Function<ald, goi> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fhs a(gny $$0, Function<ald, goi> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fhs a(gny $$0, Function<ald, goi> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gvd.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hiz $$1 = (hiz)$$0;
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
