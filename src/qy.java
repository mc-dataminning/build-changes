import javax.annotation.Nullable;

public class qy extends qx {
   private final hx a;
   private final hx b;
   private final long c;

   public qy(String $$0, hx $$1, hx $$2, long $$3) {
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
   public hx b() {
      return this.b;
   }

   @Nullable
   public hx c() {
      return this.a;
   }
}
