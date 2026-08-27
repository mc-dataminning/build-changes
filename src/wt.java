import java.util.UUID;
import javax.annotation.Nullable;

public record wt(UUID a, int b, @Nullable th c, to.a d, @Nullable sw e, sz f, ss.b g) implements uo<ur> {
   public wt(sf $$0) {
      this($$0.o(), $$0.m(), $$0.c(th::a), new to.a($$0), $$0.c(sf::l), sz.a($$0), new ss.b($$0));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.d(this.b);
      $$0.a(this.c, th::a);
      this.d.a($$0);
      $$0.a(this.e, sf::a);
      sz.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   @Override
   public boolean b() {
      return true;
   }

   public int c() {
      return this.b;
   }

   @Nullable
   public th d() {
      return this.c;
   }

   public to.a e() {
      return this.d;
   }

   @Nullable
   public sw f() {
      return this.e;
   }

   public sz g() {
      return this.f;
   }

   public ss.b h() {
      return this.g;
   }
}
