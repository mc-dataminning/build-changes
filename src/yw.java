import java.util.UUID;
import javax.annotation.Nullable;

public record yw(UUID a, int b, @Nullable tx c, ue.a d, @Nullable tl e, tp f, th.b g) implements ve<wx> {
   public yw(so $$0) {
      this($$0.p(), $$0.n(), $$0.c(tx::a), new ue.a($$0), $$0.c(so::m), tp.a($$0), new th.b($$0));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tx::a);
      this.d.a($$0);
      $$0.a(this.e, so::a);
      tp.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   @Override
   public boolean b() {
      return true;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public tx e() {
      return this.c;
   }

   public ue.a f() {
      return this.d;
   }

   @Nullable
   public tl g() {
      return this.e;
   }

   public tp h() {
      return this.f;
   }

   public th.b i() {
      return this.g;
   }
}
