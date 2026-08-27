import javax.annotation.Nullable;

public class yw implements wb<xu> {
   private final int a;
   private final byte b;

   public yw(bjt $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public yw(tl $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(tl $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   @Nullable
   public bjt a(cqz $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
