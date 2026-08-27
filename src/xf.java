import java.util.Optional;
import javax.annotation.Nullable;

public class xf implements uo<ur> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;
   private final acp<dfk> d;
   private final acp<cmm> e;
   private final long f;
   private final cmj g;
   @Nullable
   private final cmj h;
   private final boolean i;
   private final boolean j;
   private final byte k;
   private final Optional<hd> l;
   private final int m;

   public xf(acp<dfk> $$0, acp<cmm> $$1, long $$2, cmj $$3, @Nullable cmj $$4, boolean $$5, boolean $$6, byte $$7, Optional<hd> $$8, int $$9) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$8;
      this.m = $$9;
   }

   public xf(sf $$0) {
      this.d = $$0.a(jc.au);
      this.e = $$0.a(jc.aH);
      this.f = $$0.readLong();
      this.g = cmj.a($$0.readUnsignedByte());
      this.h = cmj.b($$0.readByte());
      this.i = $$0.readBoolean();
      this.j = $$0.readBoolean();
      this.k = $$0.readByte();
      this.l = $$0.b(sf::i);
      this.m = $$0.m();
   }

   @Override
   public void a(sf $$0) {
      $$0.b(this.d);
      $$0.b(this.e);
      $$0.writeLong(this.f);
      $$0.writeByte(this.g.a());
      $$0.writeByte(cmj.a(this.h));
      $$0.writeBoolean(this.i);
      $$0.writeBoolean(this.j);
      $$0.writeByte(this.k);
      $$0.a(this.l, sf::a);
      $$0.d(this.m);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public acp<dfk> a() {
      return this.d;
   }

   public acp<cmm> c() {
      return this.e;
   }

   public long d() {
      return this.f;
   }

   public cmj e() {
      return this.g;
   }

   @Nullable
   public cmj f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public boolean a(byte $$0) {
      return (this.k & $$0) != 0;
   }

   public Optional<hd> i() {
      return this.l;
   }

   public int j() {
      return this.m;
   }
}
