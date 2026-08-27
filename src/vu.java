import javax.annotation.Nullable;

public class vu implements uo<ur> {
   private final int a;
   private final byte b;

   public vu(bfj $$0, byte $$1) {
      this.a = $$0.af();
      this.b = $$1;
   }

   public vu(sf $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeInt(this.a);
      $$0.writeByte(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   @Nullable
   public bfj a(cmm $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
