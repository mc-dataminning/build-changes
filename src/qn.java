import javax.annotation.Nullable;

public class qn extends qm {
   private final ht a;
   private final ht b;
   private final long c;

   public qn(String $$0, ht $$1, ht $$2, long $$3) {
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
   public ht b() {
      return this.b;
   }

   @Nullable
   public ht c() {
      return this.a;
   }
}
