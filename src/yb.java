import java.util.function.Function;
import javax.annotation.Nullable;

public class yb implements wb<xu> {
   private final ht a;
   private final ddz<?> b;
   @Nullable
   private final rt c;

   public static yb a(ddx $$0, Function<ddx, rt> $$1) {
      return new yb($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static yb a(ddx $$0) {
      return a($$0, ddx::av_);
   }

   private yb(ht $$0, ddz<?> $$1, rt $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public yb(tl $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jy.l);
      this.c = $$0.q();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(jy.l, this.b);
      $$0.a((sn)this.c);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.a;
   }

   public ddz<?> d() {
      return this.b;
   }

   @Nullable
   public rt e() {
      return this.c;
   }
}
