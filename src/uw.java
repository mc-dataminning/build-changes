import com.google.common.annotations.VisibleForTesting;

public class uw {
   private static final int a = 512;
   private final long b;
   private long c;
   private final int d;
   private int e;

   public uw(long $$0, int $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static uw a(long $$0) {
      return new uw($$0, 512);
   }

   public static uw a() {
      return new uw(Long.MAX_VALUE, 512);
   }

   public void a(long $$0, long $$1) {
      this.b($$0 * $$1);
   }

   public void b(long $$0) {
      if (this.c + $$0 > this.b) {
         throw new ux("Tried to read NBT tag that was too big; tried to allocate: " + this.c + " + " + $$0 + " bytes where max allowed: " + this.b);
      } else {
         this.c += $$0;
      }
   }

   public void b() {
      if (this.e >= this.d) {
         throw new ux("Tried to read NBT tag with too high complexity, depth > " + this.d);
      } else {
         this.e++;
      }
   }

   public void c() {
      if (this.e <= 0) {
         throw new ux("NBT-Accounter tried to pop stack-depth at top-level");
      } else {
         this.e--;
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
