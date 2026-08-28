import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gyq {
   public static final Comparator<gyq> a = Comparator.<gyq, alb>comparing(gyq::a).thenComparing(gyq::b);
   private final alb b;
   private final alb c;
   @Nullable
   private ghe d;

   public gyq(alb $$0, alb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alb a() {
      return this.b;
   }

   public alb b() {
      return this.c;
   }

   public gwk c() {
      return fib.Q().a(this.a()).apply(this.b());
   }

   public ghe a(Function<alb, ghe> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fcy a(ggv $$0, Function<alb, ghe> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fcy a(ggv $$0, Function<alb, ghe> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gnq.b($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gyq $$1 = (gyq)$$0;
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
