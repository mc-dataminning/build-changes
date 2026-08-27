public class ws implements uo<ur> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private static final int d = 8;
   private final boolean e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private final float i;
   private final float j;

   public ws(byl $$0) {
      this.e = $$0.a;
      this.f = $$0.b;
      this.g = $$0.c;
      this.h = $$0.d;
      this.i = $$0.a();
      this.j = $$0.b();
   }

   public ws(sf $$0) {
      byte $$1 = $$0.readByte();
      this.e = ($$1 & 1) != 0;
      this.f = ($$1 & 2) != 0;
      this.g = ($$1 & 4) != 0;
      this.h = ($$1 & 8) != 0;
      this.i = $$0.readFloat();
      this.j = $$0.readFloat();
   }

   @Override
   public void a(sf $$0) {
      byte $$1 = 0;
      if (this.e) {
         $$1 = (byte)($$1 | 1);
      }

      if (this.f) {
         $$1 = (byte)($$1 | 2);
      }

      if (this.g) {
         $$1 = (byte)($$1 | 4);
      }

      if (this.h) {
         $$1 = (byte)($$1 | 8);
      }

      $$0.writeByte($$1);
      $$0.writeFloat(this.i);
      $$0.writeFloat(this.j);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public boolean d() {
      return this.g;
   }

   public boolean e() {
      return this.h;
   }

   public float f() {
      return this.i;
   }

   public float g() {
      return this.j;
   }
}
