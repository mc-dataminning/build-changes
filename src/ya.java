import javax.annotation.Nullable;

public class ya implements vf<wy> {
   private final int a;
   private final byte b;

   public ya(bis $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public ya(sq $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(sq $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   @Nullable
   public bis a(cpx $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
