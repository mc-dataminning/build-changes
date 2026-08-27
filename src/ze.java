import java.util.function.Function;
import javax.annotation.Nullable;

public class ze implements xd<yx> {
   private final hx a;
   private final dgq<?> b;
   @Nullable
   private final sl c;

   public static ze a(dgo $$0, Function<dgo, sl> $$1) {
      return new ze($$0.aB_(), $$0.v(), $$1.apply($$0));
   }

   public static ze a(dgo $$0) {
      return a($$0, dgo::ax_);
   }

   private ze(hx $$0, dgq<?> $$1, sl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public ze(ug $$0) {
      this.a = $$0.e();
      this.b = $$0.a(kd.k);
      this.c = $$0.q();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(kd.k, this.b);
      $$0.a((ti)this.c);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public dgq<?> d() {
      return this.b;
   }

   @Nullable
   public sl e() {
      return this.c;
   }
}
