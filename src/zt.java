import java.util.UUID;
import javax.annotation.Nullable;

public record zt(UUID a, int b, @Nullable uu c, vb.a d, @Nullable ui e, um f, ue.b g) implements wb<xu> {
   public zt(tl $$0) {
      this($$0.p(), $$0.n(), $$0.c(uu::a), new vb.a($$0), $$0.c(tl::m), um.a($$0), new ue.b($$0));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, uu::a);
      this.d.a($$0);
      $$0.a(this.e, tl::a);
      um.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(xu $$0) {
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
   public uu e() {
      return this.c;
   }

   public vb.a f() {
      return this.d;
   }

   @Nullable
   public ui g() {
      return this.e;
   }

   public um h() {
      return this.f;
   }

   public ue.b i() {
      return this.g;
   }
}
