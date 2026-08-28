import javax.annotation.Nullable;

public class sq extends sp {
   private final jd a;
   private final jd b;
   private final long c;

   public sq(String $$0, jd $$1, jd $$2, long $$3) {
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
   public jd b() {
      return this.b;
   }

   @Nullable
   public jd c() {
      return this.a;
   }
}
