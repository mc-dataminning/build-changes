import javax.annotation.Nullable;

public class pl extends pk {
   private final gu a;
   private final gu b;
   private final long c;

   public pl(String $$0, gu $$1, gu $$2, long $$3) {
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
   public gu b() {
      return this.b;
   }

   @Nullable
   public gu c() {
      return this.a;
   }
}
