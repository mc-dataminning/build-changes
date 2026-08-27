import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gpc {
   public static final Comparator<gpc> a = Comparator.<gpc, akh>comparing(gpc::a).thenComparing(gpc::b);
   private final akh b;
   private final akh c;
   @Nullable
   private gbw d;

   public gpc(akh $$0, akh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public akh a() {
      return this.b;
   }

   public akh b() {
      return this.c;
   }

   public gmy c() {
      return fde.Q().a(this.a()).apply(this.b());
   }

   public gbw a(Function<akh, gbw> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public eyb a(gbo $$0, Function<akh, gbw> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public eyb a(gbo $$0, Function<akh, gbw> $$1, boolean $$2) {
      return this.c().a(ghv.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gpc $$1 = (gpc)$$0;
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
