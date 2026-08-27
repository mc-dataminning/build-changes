import java.util.function.Function;
import javax.annotation.Nullable;

public class zi implements xg<zb> {
   private final hx a;
   private final dhf<?> b;
   @Nullable
   private final so c;

   public static zi a(dhd $$0, Function<dhd, so> $$1) {
      return new zi($$0.aE_(), $$0.v(), $$1.apply($$0));
   }

   public static zi a(dhd $$0) {
      return a($$0, dhd::aA_);
   }

   private zi(hx $$0, dhf<?> $$1, so $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public zi(uj $$0) {
      this.a = $$0.e();
      this.b = $$0.a(kd.k);
      this.c = $$0.q();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(kd.k, this.b);
      $$0.a((tl)this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public dhf<?> d() {
      return this.b;
   }

   @Nullable
   public so e() {
      return this.c;
   }
}
