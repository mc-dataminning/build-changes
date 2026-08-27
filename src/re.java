import javax.annotation.Nullable;

public class re extends rd {
   private final hv a;
   private final hv b;
   private final long c;

   public re(String $$0, hv $$1, hv $$2, long $$3) {
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
   public hv b() {
      return this.b;
   }

   @Nullable
   public hv c() {
      return this.a;
   }
}
