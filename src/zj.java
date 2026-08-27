import javax.annotation.Nullable;

public class zj implements wo<yh> {
   private final int a;
   private final byte b;

   public zj(bkv $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public zj(ty $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(ty $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   @Nullable
   public bkv a(csf $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
