import javax.annotation.Nullable;

public class sp extends so {
   private final in a;
   private final in b;
   private final long c;

   public sp(String $$0, in $$1, in $$2, long $$3) {
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
   public in b() {
      return this.b;
   }

   @Nullable
   public in c() {
      return this.a;
   }
}
