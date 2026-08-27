import java.util.Objects;
import javax.annotation.Nullable;

public class zt implements va<ws> {
   private final eid a;
   private final String b;

   public zt(eid $$0, @Nullable eie $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public zt(sl $$0) {
      this.a = $$0.a(eid.u);
      this.b = $$0.r();
   }

   @Override
   public void a(sl $$0) {
      $$0.a(eid::a, this.a);
      $$0.a(this.b);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public eid a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
