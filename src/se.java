import javax.annotation.Nullable;

public class se extends sd {
   private final ji a;
   private final ji b;
   private final long c;

   public se(String $$0, ji $$1, ji $$2, long $$3) {
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
   public ji b() {
      return this.b;
   }

   @Nullable
   public ji c() {
      return this.a;
   }
}
