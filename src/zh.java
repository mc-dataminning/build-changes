import java.util.function.Function;
import javax.annotation.Nullable;

public class zh implements xf<za> {
   private final hx a;
   private final dgw<?> b;
   @Nullable
   private final sn c;

   public static zh a(dgu $$0, Function<dgu, sn> $$1) {
      return new zh($$0.aB_(), $$0.v(), $$1.apply($$0));
   }

   public static zh a(dgu $$0) {
      return a($$0, dgu::ax_);
   }

   private zh(hx $$0, dgw<?> $$1, sn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public zh(ui $$0) {
      this.a = $$0.e();
      this.b = $$0.a(kd.k);
      this.c = $$0.q();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(kd.k, this.b);
      $$0.a((tk)this.c);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public dgw<?> d() {
      return this.b;
   }

   @Nullable
   public sn e() {
      return this.c;
   }
}
