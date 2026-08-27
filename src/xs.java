import javax.annotation.Nullable;

public class xs implements ux<wp> {
   private final int a;
   private final byte b;

   public xs(bii $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public xs(si $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(si $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   @Nullable
   public bii a(cpm $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
