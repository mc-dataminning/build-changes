import javax.annotation.Nullable;

public class yw implements uo<ur> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final int d;
   private final bey e;
   private final byte f;
   private final int g;
   private final byte h;
   @Nullable
   private final bfa.a i;

   public yw(int $$0, bfa $$1) {
      this.d = $$0;
      this.e = $$1.c();
      this.f = (byte)($$1.e() & 0xFF);
      this.g = $$1.d();
      byte $$2 = 0;
      if ($$1.f()) {
         $$2 = (byte)($$2 | 1);
      }

      if ($$1.g()) {
         $$2 = (byte)($$2 | 2);
      }

      if ($$1.h()) {
         $$2 = (byte)($$2 | 4);
      }

      this.h = $$2;
      this.i = $$1.a().orElse(null);
   }

   public yw(sf $$0) {
      this.d = $$0.m();
      this.e = $$0.a(jb.e);
      this.f = $$0.readByte();
      this.g = $$0.m();
      this.h = $$0.readByte();
      this.i = $$0.c($$0x -> $$0x.a(rc.a, bfa.a.a));
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.d);
      $$0.a(jb.e, this.e);
      $$0.writeByte(this.f);
      $$0.d(this.g);
      $$0.writeByte(this.h);
      $$0.a(this.i, ($$0x, $$1) -> $$0x.a(rc.a, bfa.a.a, $$1));
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.d;
   }

   public bey c() {
      return this.e;
   }

   public byte d() {
      return this.f;
   }

   public int e() {
      return this.g;
   }

   public boolean f() {
      return (this.h & 2) == 2;
   }

   public boolean g() {
      return (this.h & 1) == 1;
   }

   public boolean h() {
      return (this.h & 4) == 4;
   }

   @Nullable
   public bfa.a i() {
      return this.i;
   }
}
