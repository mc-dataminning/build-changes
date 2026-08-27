import java.util.function.Function;
import javax.annotation.Nullable;

public class xe implements ve<wx> {
   private final gw a;
   private final ddb<?> b;
   @Nullable
   private final qw c;

   public static xe a(dcz $$0, Function<dcz, qw> $$1) {
      return new xe($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static xe a(dcz $$0) {
      return a($$0, dcz::as_);
   }

   private xe(gw $$0, ddb<?> $$1, qw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public xe(so $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jb.l);
      this.c = $$0.q();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(jb.l, this.b);
      $$0.a((rq)this.c);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public ddb<?> d() {
      return this.b;
   }

   @Nullable
   public qw e() {
      return this.c;
   }
}
