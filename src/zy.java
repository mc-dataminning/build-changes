import java.util.Objects;
import javax.annotation.Nullable;

public class zy implements vf<wy> {
   private final eik a;
   private final String b;

   public zy(eik $$0, @Nullable eil $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public zy(sq $$0) {
      this.a = $$0.a(eik.u);
      this.b = $$0.r();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(eik::a, this.a);
      $$0.a(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public eik a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
