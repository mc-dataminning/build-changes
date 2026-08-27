import java.util.UUID;
import javax.annotation.Nullable;

public record yx(UUID a, int b, @Nullable ty c, uf.a d, @Nullable tn e, tq f, tj.b g) implements vf<wy> {
   public yx(sq $$0) {
      this($$0.o(), $$0.m(), $$0.c(ty::a), new uf.a($$0), $$0.c(sq::l), tq.a($$0), new tj.b($$0));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, ty::a);
      this.d.a($$0);
      $$0.a(this.e, sq::a);
      tq.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(wy $$0) {
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
   public ty e() {
      return this.c;
   }

   public uf.a f() {
      return this.d;
   }

   @Nullable
   public tn g() {
      return this.e;
   }

   public tq h() {
      return this.f;
   }

   public tj.b i() {
      return this.g;
   }
}
