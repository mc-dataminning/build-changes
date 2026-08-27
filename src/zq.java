import javax.annotation.Nullable;

public class zq implements wu<yo> {
   private final int a;
   private final byte b;

   public zq(blf $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public zq(ue $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(ue $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   @Nullable
   public blf a(csy $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
