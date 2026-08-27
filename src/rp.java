import javax.annotation.Nullable;

public class rp extends ro {
   private final ib a;
   private final ib b;
   private final long c;

   public rp(String $$0, ib $$1, ib $$2, long $$3) {
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
   public ib b() {
      return this.b;
   }

   @Nullable
   public ib c() {
      return this.a;
   }
}
