import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hdp {
   public static final Comparator<hdp> a = Comparator.<hdp, alp>comparing(hdp::a).thenComparing(hdp::b);
   private final alp b;
   private final alp c;
   @Nullable
   private glq d;

   public hdp(alp $$0, alp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public alp a() {
      return this.b;
   }

   public alp b() {
      return this.c;
   }

   public hbg c() {
      return flz.Q().a(this.a()).apply(this.b());
   }

   public glq a(Function<alp, glq> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fgp a(glg $$0, Function<alp, glq> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fgp a(glg $$0, Function<alp, glq> $$1, boolean $$2, boolean $$3) {
      return this.c().a(gsj.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hdp $$1 = (hdp)$$0;
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
