import java.util.UUID;
import javax.annotation.Nullable;

public record yp(UUID a, int b, @Nullable tq c, tx.a d, @Nullable tf e, ti f, tb.b g) implements ux<wp> {
   public yp(si $$0) {
      this($$0.o(), $$0.m(), $$0.c(tq::a), new tx.a($$0), $$0.c(si::l), ti.a($$0), new tb.b($$0));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tq::a);
      this.d.a($$0);
      $$0.a(this.e, si::a);
      ti.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(wp $$0) {
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
   public tq e() {
      return this.c;
   }

   public tx.a f() {
      return this.d;
   }

   @Nullable
   public tf g() {
      return this.e;
   }

   public ti h() {
      return this.f;
   }

   public tb.b i() {
      return this.g;
   }
}
