import javax.annotation.Nullable;

public class xy implements vd<ww> {
   private final int a;
   private final byte b;

   public xy(biq $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public xy(so $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(ww $$0) {
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
