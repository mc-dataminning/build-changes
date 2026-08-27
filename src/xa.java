import java.util.function.Function;
import javax.annotation.Nullable;

public class xa implements va<ws> {
   private final gw a;
   private final dcs<?> b;
   @Nullable
   private final qu c;

   public static xa a(dcq $$0, Function<dcq, qu> $$1) {
      return new xa($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static xa a(dcq $$0) {
      return a($$0, dcq::an_);
   }

   private xa(gw $$0, dcs<?> $$1, qu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public xa(sl $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jd.l);
      this.c = $$0.p();
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(jd.l, this.b);
      $$0.a((rn)this.c);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public dcs<?> d() {
      return this.b;
   }

   @Nullable
   public qu e() {
      return this.c;
   }
}
