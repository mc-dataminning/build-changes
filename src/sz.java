import javax.annotation.Nullable;

public class sz extends sy {
   private final ir a;
   private final ir b;
   private final long c;

   public sz(String $$0, ir $$1, ir $$2, long $$3) {
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
   public ir b() {
      return this.b;
   }

   @Nullable
   public ir c() {
      return this.a;
   }
}
