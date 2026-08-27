public class zq implements uo<zb> {
   private static final int b = 32767;
   public static final acq a = new acq("brand");
   private final acq c;
   private final sf d;

   public zq(acq $$0, sf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public zq(sf $$0) {
      this.c = $$0.t();
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 32767) {
         this.d = new sf($$0.readBytes($$1));
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.c);
      $$0.writeBytes(this.d);
   }

   public void a(zb $$0) {
      $$0.a(this);
      this.d.release();
   }

   public acq a() {
      return this.c;
   }

   public sf c() {
      return this.d;
   }
}
