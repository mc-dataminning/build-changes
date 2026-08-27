import com.google.common.annotations.VisibleForTesting;

public class rh {
   public static final rh a = new rh(0L) {
      @Override
      public void a(long $$0) {
      }
   };
   private final long b;
   private long c;

   public rh(long $$0) {
      this.b = $$0;
   }

   public void a(long $$0) {
      this.c += $$0;
      if (this.c > this.b) {
         throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
      }
   }

   @VisibleForTesting
   public long a() {
      return this.c;
   }
}
