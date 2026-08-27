import com.google.common.collect.Sets;
import java.util.Set;

public record ym(int a, boolean b, Set<aew<cpv>> c, int d, int e, int f, boolean g, boolean h, boolean i, aba j) implements vd<ww> {
   public ym(so $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(je.aH)),
         $$0.m(),
         $$0.m(),
         $$0.m(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new aba($$0)
      );
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.a(this.c, so::b);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.c(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      this.j.a($$0);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }

   public Set<aew<cpv>> e() {
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

   public aba l() {
      return this.j;
   }
}
