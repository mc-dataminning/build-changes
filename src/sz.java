import javax.annotation.Nullable;

public class sz extends sy {
   private final jh a;
   private final jh b;
   private final long c;

   public sz(String $$0, jh $$1, jh $$2, long $$3) {
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
   public jh b() {
      return this.b;
   }

   @Nullable
   public jh c() {
      return this.a;
   }
}
