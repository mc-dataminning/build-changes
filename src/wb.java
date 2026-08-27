public class wb implements uo<ur> {
   private final long a;

   public wb(long $$0) {
      this.a = $$0;
   }

   public wb(sf $$0) {
      this.a = $$0.readLong();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeLong(this.a);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public long a() {
      return this.a;
   }
}
