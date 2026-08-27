import java.util.UUID;
import javax.annotation.Nullable;

public record yv(UUID a, int b, @Nullable tw c, ud.a d, @Nullable tl e, to f, th.b g) implements vd<ww> {
   public yv(so $$0) {
      this($$0.o(), $$0.m(), $$0.c(tw::a), new ud.a($$0), $$0.c(so::l), to.a($$0), new th.b($$0));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tw::a);
      this.d.a($$0);
      $$0.a(this.e, so::a);
      to.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(ww $$0) {
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
   public tw e() {
      return this.c;
   }

   public ud.a f() {
      return this.d;
   }

   @Nullable
   public tl g() {
      return this.e;
   }

   public to h() {
      return this.f;
   }

   public th.b i() {
      return this.g;
   }
}
