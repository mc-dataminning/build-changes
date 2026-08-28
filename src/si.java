import javax.annotation.Nullable;

public class si extends sh {
   private final iv c;
   private final iv d;

   public si(xa $$0, iv $$1, iv $$2, int $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public xa a() {
      return xa.a("test.error.position", this.a, this.c.u(), this.c.v(), this.c.w(), this.d.u(), this.d.v(), this.d.w(), this.b);
   }

   @Nullable
   public String b() {
      return super.getMessage();
   }

   @Nullable
   public iv c() {
      return this.d;
   }

   @Nullable
   public iv d() {
      return this.c;
   }
}
