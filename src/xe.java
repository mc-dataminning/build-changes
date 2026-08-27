import java.util.function.Function;
import javax.annotation.Nullable;

public class xe implements vd<ww> {
   private final gw a;
   private final dcx<?> b;
   @Nullable
   private final qx c;

   public static xe a(dcv $$0, Function<dcv, qx> $$1) {
      return new xe($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static xe a(dcv $$0) {
      return a($$0, dcv::as_);
   }

   private xe(gw $$0, dcx<?> $$1, qx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public xe(so $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jd.l);
      this.c = $$0.p();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(jd.l, this.b);
      $$0.a((rq)this.c);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public dcx<?> d() {
      return this.b;
   }

   @Nullable
   public qx e() {
      return this.c;
   }
}
