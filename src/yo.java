import java.util.UUID;
import javax.annotation.Nullable;

public record yo(UUID a, int b, @Nullable tp c, tw.a d, @Nullable te e, th f, ta.b g) implements uw<wo> {
   public yo(sh $$0) {
      this($$0.o(), $$0.m(), $$0.c(tp::a), new tw.a($$0), $$0.c(sh::l), th.a($$0), new ta.b($$0));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tp::a);
      this.d.a($$0);
      $$0.a(this.e, sh::a);
      th.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(wo $$0) {
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
   public tp e() {
      return this.c;
   }

   public tw.a f() {
      return this.d;
   }

   @Nullable
   public te g() {
      return this.e;
   }

   public th h() {
      return this.f;
   }

   public ta.b i() {
      return this.g;
   }
}
