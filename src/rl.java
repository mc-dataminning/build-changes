import javax.annotation.Nullable;

public class rl extends rk {
   private final hz a;
   private final hz b;
   private final long c;

   public rl(String $$0, hz $$1, hz $$2, long $$3) {
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
   public hz b() {
      return this.b;
   }

   @Nullable
   public hz c() {
      return this.a;
   }
}
