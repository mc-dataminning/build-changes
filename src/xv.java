import javax.annotation.Nullable;

public class xv implements va<ws> {
   private final int a;
   private final byte b;

   public xv(bil $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public xv(sl $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(sl $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   @Nullable
   public bil a(cpq $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
