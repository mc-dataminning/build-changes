import javax.annotation.Nullable;

public class xr implements uw<wo> {
   private final int a;
   private final byte b;

   public xr(big $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public xr(sh $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(sh $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   @Nullable
   public big a(cpk $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
