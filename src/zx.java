import java.util.Objects;
import javax.annotation.Nullable;

public class zx implements ve<wx> {
   private final eic a;
   private final String b;

   public zx(eic $$0, @Nullable eid $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public zx(so $$0) {
      this.a = $$0.a(eic.u);
      this.b = $$0.s();
   }

   @Override
   public void a(so $$0) {
      $$0.a(eic::a, this.a);
      $$0.a(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public eic a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
