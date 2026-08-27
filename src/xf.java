import java.util.function.Function;
import javax.annotation.Nullable;

public class xf implements vf<wy> {
   private final gw a;
   private final dcz<?> b;
   @Nullable
   private final qy c;

   public static xf a(dcx $$0, Function<dcx, qy> $$1) {
      return new xf($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static xf a(dcx $$0) {
      return a($$0, dcx::as_);
   }

   private xf(gw $$0, dcz<?> $$1, qy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public xf(sq $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jd.l);
      this.c = $$0.p();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(jd.l, this.b);
      $$0.a((rs)this.c);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public dcz<?> d() {
      return this.b;
   }

   @Nullable
   public qy e() {
      return this.c;
   }
}
