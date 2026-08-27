import java.util.Objects;
import javax.annotation.Nullable;

public class xv implements uo<ur> {
   private final int a;
   private final String b;

   public xv(int $$0, @Nullable efd $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public xv(sf $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
      $$0.a(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public String c() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
