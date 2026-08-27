import javax.annotation.Nullable;

public class zf implements wk<yd> {
   private final int a;
   private final byte b;

   public zf(bkq $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public zf(tu $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(tu $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   @Nullable
   public bkq a(csa $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
