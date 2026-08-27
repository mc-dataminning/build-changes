public class xo implements va<ws> {
   private final int a;
   private final int b;
   private final int c;

   public xo(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public xo(sl $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.readShort();
      this.c = $$0.readShort();
   }

   @Override
   public void a(sl $$0) {
      $$0.k(this.a);
      $$0.l(this.b);
      $$0.l(this.c);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
