import java.util.function.Function;
import javax.annotation.Nullable;

public class wx implements ux<wp> {
   private final gu a;
   private final dco<?> b;
   @Nullable
   private final qr c;

   public static wx a(dcm $$0, Function<dcm, qr> $$1) {
      return new wx($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static wx a(dcm $$0) {
      return a($$0, dcm::ao_);
   }

   private wx(gu $$0, dco<?> $$1, qr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public wx(si $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jb.l);
      this.c = $$0.p();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(jb.l, this.b);
      $$0.a((rk)this.c);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public dco<?> d() {
      return this.b;
   }

   @Nullable
   public qr e() {
      return this.c;
   }
}
