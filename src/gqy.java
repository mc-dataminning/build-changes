import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gqy {
   public static final Comparator<gqy> a = Comparator.<gqy, alb>comparing(gqy::a).thenComparing(gqy::b);
   private final alb b;
   private final alb c;
   @Nullable
   private gdr d;

   public gqy(alb $$0, alb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alb a() {
      return this.b;
   }

   public alb b() {
      return this.c;
   }

   public gou c() {
      return ffa.Q().a(this.a()).apply(this.b());
   }

   public gdr a(Function<alb, gdr> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public ezx a(gdj $$0, Function<alb, gdr> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public ezx a(gdj $$0, Function<alb, gdr> $$1, boolean $$2) {
      return this.c().a(gjq.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gqy $$1 = (gqy)$$0;
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
