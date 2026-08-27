import com.google.common.collect.Sets;
import java.util.Set;

public record zj(int a, boolean b, Set<afv<cqz>> c, int d, int e, int f, boolean g, boolean h, boolean i, abx j) implements wb<xu> {
   public zj(tl $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(jz.aI)),
         $$0.n(),
         $$0.n(),
         $$0.n(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new abx($$0)
      );
   }

   @Override
   public void a(tl $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.a(this.c, tl::b);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.c(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      this.j.a($$0);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }

   public Set<afv<cqz>> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public boolean k() {
      return this.i;
   }

   public abx l() {
      return this.j;
   }
}
