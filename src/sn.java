import javax.annotation.Nullable;

public class sn extends sm {
   private final im a;
   private final im b;
   private final long c;

   public sn(String $$0, im $$1, im $$2, long $$3) {
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
   public im b() {
      return this.b;
   }

   @Nullable
   public im c() {
      return this.a;
   }
}
