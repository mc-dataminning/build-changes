import java.util.function.Function;
import javax.annotation.Nullable;

public class uz implements uo<ur> {
   private final gu a;
   private final czp<?> b;
   @Nullable
   private final qr c;

   public static uz a(czn $$0, Function<czn, qr> $$1) {
      return new uz($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static uz a(czn $$0) {
      return a($$0, czn::ao_);
   }

   private uz(gu $$0, czp<?> $$1, qr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public uz(sf $$0) {
      this.a = $$0.f();
      this.b = $$0.a(jb.l);
      this.c = $$0.p();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.a(jb.l, this.b);
      $$0.a(this.c);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public czp<?> c() {
      return this.b;
   }

   @Nullable
   public qr d() {
      return this.c;
   }
}
