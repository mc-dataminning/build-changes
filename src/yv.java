import java.util.function.Function;
import javax.annotation.Nullable;

public class yv implements wu<yo> {
   private final hv a;
   private final dgf<?> b;
   @Nullable
   private final sj c;

   public static yv a(dgd $$0, Function<dgd, sj> $$1) {
      return new yv($$0.aB_(), $$0.v(), $$1.apply($$0));
   }

   public static yv a(dgd $$0) {
      return a($$0, dgd::ax_);
   }

   private yv(hv $$0, dgf<?> $$1, sj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.g() ? null : $$2;
   }

   public yv(ue $$0) {
      this.a = $$0.e();
      this.b = $$0.a(kb.k);
      this.c = $$0.q();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(kb.k, this.b);
      $$0.a((tg)this.c);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public hv a() {
      return this.a;
   }

   public dgf<?> d() {
      return this.b;
   }

   @Nullable
   public sj e() {
      return this.c;
   }
}
