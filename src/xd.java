import java.util.function.Function;
import javax.annotation.Nullable;

public class xd implements vd<ww> {
   private final gw a;
   private final dcx<?> b;
   @Nullable
   private final qw c;

   public static xd a(dcv $$0, Function<dcv, qw> $$1) {
      return new xd($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static xd a(dcv $$0) {
      return a($$0, dcv::as_);
   }

   private xd(gw $$0, dcx<?> $$1, qw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public xd(so $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jb.l);
      this.c = $$0.p();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(jb.l, this.b);
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
   public qw e() {
      return this.c;
   }
}
