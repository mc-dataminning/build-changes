import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gre {
   public static final Comparator<gre> a = Comparator.<gre, alf>comparing(gre::a).thenComparing(gre::b);
   private final alf b;
   private final alf c;
   @Nullable
   private gdx d;

   public gre(alf $$0, alf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alf a() {
      return this.b;
   }

   public alf b() {
      return this.c;
   }

   public gpa c() {
      return ffg.Q().a(this.a()).apply(this.b());
   }

   public gdx a(Function<alf, gdx> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fad a(gdp $$0, Function<alf, gdx> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fad a(gdp $$0, Function<alf, gdx> $$1, boolean $$2) {
      return this.c().a(gjw.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gre $$1 = (gre)$$0;
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
