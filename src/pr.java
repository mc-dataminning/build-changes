import javax.annotation.Nullable;

public class pr extends pq {
   private final gw a;
   private final gw b;
   private final long c;

   public pr(String $$0, gw $$1, gw $$2, long $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   public String getMessage() {
      String $$0 = this.a.u() + "," + this.a.v() + "," + this.a.w() + " (relative: " + this.b.u() + "," + this.b.v() + "," + this.b.w() + ")";
      return super.getMessage() + " at " + $$0 + " (t=" + this.c + ")";
   }

   @Nullable
   public String a() {
      return super.getMessage();
   }

   @Nullable
   public gw b() {
      return this.b;
   }

   @Nullable
   public gw c() {
      return this.a;
   }
}
