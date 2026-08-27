import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gor {
   public static final Comparator<gor> a = Comparator.<gor, akf>comparing(gor::a).thenComparing(gor::b);
   private final akf b;
   private final akf c;
   @Nullable
   private gbm d;

   public gor(akf $$0, akf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akf a() {
      return this.b;
   }

   public akf b() {
      return this.c;
   }

   public gmo c() {
      return fcu.Q().a(this.a()).apply(this.b());
   }

   public gbm a(Function<akf, gbm> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public exr a(gbe $$0, Function<akf, gbm> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public exr a(gbe $$0, Function<akf, gbm> $$1, boolean $$2) {
      return this.c().a(ghl.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gor $$1 = (gor)$$0;
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
