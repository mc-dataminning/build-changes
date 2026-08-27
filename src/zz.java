import javax.annotation.Nullable;

public class zz implements xd<yx> {
   private final int a;
   private final byte b;

   public zz(blp $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public zz(ug $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(ug $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   @Nullable
   public blp a(cti $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
