import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gbk {
   public static final Comparator<gbk> a = Comparator.<gbk, aey>comparing(gbk::a).thenComparing(gbk::b);
   private final aey b;
   private final aey c;
   @Nullable
   private foo d;

   public gbk(aey $$0, aey $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aey a() {
      return this.b;
   }

   public aey b() {
      return this.c;
   }

   public fzg c() {
      return eqx.O().a(this.a()).apply(this.b());
   }

   public foo a(Function<aey, foo> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public elv a(fog $$0, Function<aey, foo> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public elv a(fog $$0, Function<aey, foo> $$1, boolean $$2) {
      return this.c().a(fuh.c($$0, this.a($$1), true, $$2));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         gbk $$1 = (gbk)$$0;
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
