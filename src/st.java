import javax.annotation.Nullable;

public class st extends ss {
   private final je a;
   private final je b;
   private final long c;

   public st(String $$0, je $$1, je $$2, long $$3) {
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
   public je b() {
      return this.b;
   }

   @Nullable
   public je c() {
      return this.a;
   }
}
