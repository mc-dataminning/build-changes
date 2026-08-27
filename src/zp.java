import java.util.Objects;
import javax.annotation.Nullable;

public class zp implements uw<wo> {
   private final eia a;
   private final String b;

   public zp(eia $$0, @Nullable eib $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public zp(sh $$0) {
      this.a = $$0.a(eia.u);
      this.b = $$0.r();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(eia::a, this.a);
      $$0.a(this.b);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public eia a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
