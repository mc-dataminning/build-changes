import javax.annotation.Nullable;

public class ss extends sr {
   private final io a;
   private final io b;
   private final long c;

   public ss(String $$0, io $$1, io $$2, long $$3) {
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
   public io b() {
      return this.b;
   }

   @Nullable
   public io c() {
      return this.a;
   }
}
