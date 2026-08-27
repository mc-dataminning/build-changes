import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public record wi(
   int a,
   boolean b,
   cmj c,
   @Nullable cmj d,
   Set<acp<cmm>> e,
   hs.b f,
   acp<dfk> g,
   acp<cmm> h,
   long i,
   int j,
   int k,
   int l,
   boolean m,
   boolean n,
   boolean o,
   boolean p,
   Optional<hd> q,
   int r
) implements uo<ur> {
   private static final aco<rk> s = aco.a(rc.a, hs.a(jb.ap));

   public wi(sf $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         cmj.a($$0.readByte()),
         cmj.b($$0.readByte()),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(jc.aH)),
         $$0.<hs>a(s, hv.a).c(),
         $$0.a(jc.au),
         $$0.a(jc.aH),
         $$0.readLong(),
         $$0.m(),
         $$0.m(),
         $$0.m(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(sf::i),
         $$0.m()
      );
   }

   @Override
   public void a(sf $$0) {
      $$0.writeInt(this.a);
      $$0.writeBoolean(this.b);
      $$0.writeByte(this.c.a());
      $$0.writeByte(cmj.a(this.d));
      $$0.a(this.e, sf::b);
      $$0.a(s, hv.a, this.f);
      $$0.b(this.g);
      $$0.b(this.h);
      $$0.writeLong(this.i);
      $$0.d(this.j);
      $$0.d(this.k);
      $$0.d(this.l);
      $$0.writeBoolean(this.m);
      $$0.writeBoolean(this.n);
      $$0.writeBoolean(this.o);
      $$0.writeBoolean(this.p);
      $$0.a(this.q, sf::a);
      $$0.d(this.r);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public boolean c() {
      return this.b;
   }

   public cmj d() {
      return this.c;
   }

   @Nullable
   public cmj e() {
      return this.d;
   }

   public Set<acp<cmm>> f() {
      return this.e;
   }

   public hs.b g() {
      return this.f;
   }

   public acp<dfk> h() {
      return this.g;
   }

   public acp<cmm> i() {
      return this.h;
   }

   public long j() {
      return this.i;
   }

   public int k() {
      return this.j;
   }

   public int l() {
      return this.k;
   }

   public int m() {
      return this.l;
   }

   public boolean n() {
      return this.m;
   }

   public boolean o() {
      return this.n;
   }

   public boolean p() {
      return this.o;
   }

   public boolean q() {
      return this.p;
   }

   public Optional<hd> r() {
      return this.q;
   }

   public int s() {
      return this.r;
   }
}
