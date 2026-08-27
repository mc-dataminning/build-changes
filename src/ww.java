import java.util.function.Function;
import javax.annotation.Nullable;

public class ww implements uw<wo> {
   private final gv a;
   private final dcm<?> b;
   @Nullable
   private final qs c;

   public static ww a(dck $$0, Function<dck, qs> $$1) {
      return new ww($$0.p(), $$0.u(), $$1.apply($$0));
   }

   public static ww a(dck $$0) {
      return a($$0, dck::ao_);
   }

   private ww(gv $$0, dcm<?> $$1, qs $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public ww(sh $$0) {
      this.a = $$0.e();
      this.b = $$0.a(jc.l);
      this.c = $$0.p();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(jc.l, this.b);
      $$0.a((rl)this.c);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public gv a() {
      return this.a;
   }

   public dcm<?> d() {
      return this.b;
   }

   @Nullable
   public qs e() {
      return this.c;
   }
}
