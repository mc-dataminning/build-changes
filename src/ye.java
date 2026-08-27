import com.google.common.collect.Sets;
import java.util.Set;

public record ye(int a, boolean b, Set<aeo<cpk>> c, int d, int e, int f, boolean g, boolean h, aas i) implements uw<wo> {
   public ye(sh $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(jd.aH)),
         $$0.m(),
         $$0.m(),
         $$0.m(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new aas($$0)
      );
   }

   @Override
   public void a(sh $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.a(this.c, sh::b);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.c(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      this.i.a($$0);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }

   public Set<aeo<cpk>> e() {
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

   public aas k() {
      return this.i;
   }
}
