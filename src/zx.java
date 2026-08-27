import java.util.Objects;
import javax.annotation.Nullable;

public class zx implements ve<wx> {
   private final eii a;
   private final String b;

   public zx(eii $$0, @Nullable eij $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public zx(sp $$0) {
      this.a = $$0.a(eii.u);
      this.b = $$0.r();
   }

   @Override
   public void a(sp $$0) {
      $$0.a(eii::a, this.a);
      $$0.a(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public eii a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
