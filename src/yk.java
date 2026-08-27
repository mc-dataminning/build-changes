import java.util.function.Function;
import javax.annotation.Nullable;

public class yk implements wk<yd> {
   private final ht a;
   private final det<?> b;
   @Nullable
   private final rz c;

   public static yk a(der $$0, Function<der, rz> $$1) {
      return new yk($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static yk a(der $$0) {
      return a($$0, der::av_);
   }

   private yk(ht $$0, det<?> $$1, rz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public yk(tu $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jy.l);
      this.c = $$0.q();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(jy.l, this.b);
      $$0.a((sw)this.c);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.a;
   }

   public det<?> d() {
      return this.b;
   }

   @Nullable
   public rz e() {
      return this.c;
   }
}
