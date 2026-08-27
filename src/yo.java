import java.util.function.Function;
import javax.annotation.Nullable;

public class yo implements wo<yh> {
   private final hx a;
   private final dfk<?> b;
   @Nullable
   private final sd c;

   public static yo a(dfi $$0, Function<dfi, sd> $$1) {
      return new yo($$0.aC_(), $$0.v(), $$1.apply($$0));
   }

   public static yo a(dfi $$0) {
      return a($$0, dfi::ay_);
   }

   private yo(hx $$0, dfk<?> $$1, sd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public yo(ty $$0) {
      this.a = $$0.e();
      this.b = $$0.a(kc.l);
      this.c = $$0.q();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(kc.l, this.b);
      $$0.a((ta)this.c);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public dfk<?> d() {
      return this.b;
   }

   @Nullable
   public sd e() {
      return this.c;
   }
}
