import com.google.common.collect.Sets;
import java.util.Set;

public record zw(int a, boolean b, Set<agl<csf>> c, int d, int e, int f, boolean g, boolean h, boolean i, acm j) implements wo<yh> {
   public zw(ty $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(kd.aJ)),
         $$0.n(),
         $$0.n(),
         $$0.n(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new acm($$0)
      );
   }

   @Override
   public void a(ty $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.a(this.c, ty::b);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.c(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      this.j.a($$0);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }

   public Set<agl<csf>> e() {
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

   public acm l() {
      return this.j;
   }
}
