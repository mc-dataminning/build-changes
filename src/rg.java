import com.google.common.annotations.VisibleForTesting;

public class rg {
   public static final rg a = new rg(0L) {
      @Override
      public void a(long $$0) {
      }
   };
   private final long b;
   private long c;

   public rg(long $$0) {
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
