import javax.annotation.Nullable;

public class sx extends sw {
   private final jg a;
   private final jg b;
   private final long c;

   public sx(String $$0, jg $$1, jg $$2, long $$3) {
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
   public jg b() {
      return this.b;
   }

   @Nullable
   public jg c() {
      return this.a;
   }
}
