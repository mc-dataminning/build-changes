public class yi implements uo<ur> {
   private final long a;
   private final long b;

   public yi(long $$0, long $$1, boolean $$2) {
      this.a = $$0;
      long $$3 = $$1;
      if (!$$2) {
         $$3 = -$$1;
         if ($$3 == 0L) {
            $$3 = -1L;
         }
      }

      this.b = $$3;
   }

   public yi(sf $$0) {
      this.a = $$0.readLong();
      this.b = $$0.readLong();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeLong(this.a);
      $$0.writeLong(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public long a() {
      return this.a;
   }

   public long c() {
      return this.b;
   }
}
