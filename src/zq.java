import java.util.Objects;
import javax.annotation.Nullable;

public class zq implements ux<wp> {
   private final ehy a;
   private final String b;

   public zq(ehy $$0, @Nullable ehz $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public zq(si $$0) {
      this.a = $$0.a(ehy.u);
      this.b = $$0.r();
   }

   @Override
   public void a(si $$0) {
      $$0.a(ehy::a, this.a);
      $$0.a(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public ehy a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
