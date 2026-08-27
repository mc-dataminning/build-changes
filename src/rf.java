import com.google.common.annotations.VisibleForTesting;

public class rf {
   private static final int a = 512;
   private final long b;
   private long c;
   private final int d;
   private int e;

   public rf(long $$0, int $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static rf a(long $$0) {
      return new rf($$0, 512);
   }

   public static rf a() {
      return new rf(Long.MAX_VALUE, 512);
   }

   public void b(long $$0) {
      this.c += $$0;
      if (this.c > this.b) {
         throw new rg("Tried to read NBT tag that was too big; tried to allocate: " + this.c + " bytes where max allowed: " + this.b);
      }
   }

   public void b() {
      this.e++;
      if (this.e > this.d) {
         throw new rg("Tried to read NBT tag with too high complexity, depth > " + this.d);
      }
   }

   public void c() {
      this.e--;
      if (this.e < 0) {
         throw new rg("NBT-Accounter tried to pop stack-depth at top-level");
      }
   }

   @VisibleForTesting
   public long d() {
      return this.c;
   }

   @VisibleForTesting
   public int e() {
      return this.e;
   }
}
