import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class glf {
   public static final Comparator<glf> a = Comparator.<glf, ajh>comparing(glf::a).thenComparing(glf::b);
   private final ajh b;
   private final ajh c;
   @Nullable
   private fya d;

   public glf(ajh $$0, ajh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ajh a() {
      return this.b;
   }

   public ajh b() {
      return this.c;
   }

   public gjc c() {
      return ezi.Q().a(this.a()).apply(this.b());
   }

   public fya a(Function<ajh, fya> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public euf a(fxs $$0, Function<ajh, fya> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public euf a(fxs $$0, Function<ajh, fya> $$1, boolean $$2) {
      return this.c().a(gdz.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         glf $$1 = (glf)$$0;
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
