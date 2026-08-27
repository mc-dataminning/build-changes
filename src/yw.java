import java.util.UUID;
import javax.annotation.Nullable;

public record yw(UUID a, int b, @Nullable tx c, ue.a d, @Nullable tm e, tp f, ti.b g) implements ve<wx> {
   public yw(sp $$0) {
      this($$0.o(), $$0.m(), $$0.c(tx::a), new ue.a($$0), $$0.c(sp::l), tp.a($$0), new ti.b($$0));
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tx::a);
      this.d.a($$0);
      $$0.a(this.e, sp::a);
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
   public tm g() {
      return this.e;
   }

   public tp h() {
      return this.f;
   }

   public ti.b i() {
      return this.g;
   }
}
