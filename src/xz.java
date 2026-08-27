import javax.annotation.Nullable;

public class xz implements ve<wx> {
   private final int a;
   private final byte b;

   public xz(biq $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public xz(sp $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(sp $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   @Nullable
   public biq a(cpv $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
